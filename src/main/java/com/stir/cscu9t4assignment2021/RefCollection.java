package com.stir.cscu9t4assignment2021;

//import java.util.Collection;
import java.util.*;

public class RefCollection {
    private List<Ref> rc;
    private List<RefJournal> rcj;
    private List<RefConference> rcv;

    public RefCollection(){
        rc = new ArrayList<Ref>();
        rcj = new ArrayList<RefJournal>();
        rcv = new ArrayList<RefConference>();
    }//constructor

    //method to add a citation to the list of references
    public void addCite(Ref ref){
        rc.add(ref);
    }

    public String lookUpByJournal(String journal){
        ListIterator<RefJournal> iter = rcj.listIterator();
        String result = "";
        while(iter.hasNext()){
            RefJournal current = iter.next();
            if(current.getJournal()==journal){
                result = result + current.getCitation();
            }
        }
        if(result.equals("")){
            result = "There are no citations from the specified journal";
        }
        return result;
    }

    public String lookUpByVenue(String venue){
        ListIterator<RefConference> iter = rcv.listIterator();
        String result = "";
        while(iter.hasNext()){
            RefConference current = iter.next();
            if(current.getVenue()==venue){
                result = result +current.getCitation();
            }
        }
        if(result.equals("")){
            result = "There are no citations from conferences at the specified venue";
        }
        return result;    }

    public String lookUpByPublisher(String publisher){
        ListIterator<Ref> iter = rc.listIterator();
        String result = "";
        while(iter.hasNext()){
            Ref current = iter.next();
            if(current.getPublisher()==publisher){
                result = current.getCitation();
            }
        }
        if(result.equals("")){
            result = "There are no citations from the specified publisher";
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