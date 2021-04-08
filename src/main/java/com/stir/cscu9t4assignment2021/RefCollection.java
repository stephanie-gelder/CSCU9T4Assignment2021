package com.stir.cscu9t4assignment2021;

import java.util.Collection;
import java.util.*;

public class RefCollection {
    private List<Ref>rc;

    public RefCollection(){
        rc = new ArrayList<Ref>();
    }//constructor

    public void addCite(Ref ref){
        rc.add(ref);
    }

    public String lookUpByJournal(String journal){
        ListIterator<Ref> iter = rc.listIterator();
        String result = "No journals found";
        while(iter.hasNext()){
            Ref current = iter.next();
            if(current.getJournal()==journal){
                result = current.getCitation();
            }
        }
        return result;
    }

    public String lookUpByVenue(String venue){
        ListIterator<Ref> iter = rc.listIterator();
        String result = "No journals found";
        while(iter.hasNext()){
            Ref current = iter.next();
            if(current.getVenue()==venue){
                result = current.getCitation();
            }
        }
        return result;    }

    public String lookUpByPublisher(String publisher){
        ListIterator<Ref> iter = rc.listIterator();
        String result = "No journals found";
        while(iter.hasNext()){
            Ref current = iter.next();
            if(current.getPublisher()==publisher){
                result = current.getCitation();
            }
        }
        return result;    }

//    public int getNumberOfRefs(String type){
//     //   return ;
//    }
//
//    public String exportAll(){
//       // return ;
//    }

    public String importMany(String filePath){
        return filePath;
    }
}
