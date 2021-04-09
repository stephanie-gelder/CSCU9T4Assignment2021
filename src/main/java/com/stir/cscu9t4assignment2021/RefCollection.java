package com.stir.cscu9t4assignment2021;

//import java.util.Collection;
import java.util.*;

public class RefCollection {
    private static List<Ref> rc;
    private static List<RefJournal> rcj;
    private static List<RefConference> rcv;

    public RefCollection(){
        rc = new ArrayList<>();
        rcj = new ArrayList<>();
        rcv = new ArrayList<>();
    }//constructor

    //method to add a citation to the list of references
    public void addCite(Ref ref){
        rc.add(ref);
    }

    /**
     * Method to search for references from a specific journal
     * @param journal
     * @return
     */
    public static String lookUpByJournal(String journal){
        ListIterator<RefJournal> iter = rcj.listIterator();
        String result = "";
        while(iter.hasNext()){
            RefJournal current = iter.next();
            while(current.getJournal()==journal){
                result = result + current.getCitation();
                break;
            }
            break;
        }
        if(result.equals("")){
            result = "There are no citations from the specified journal";
        }
        return result;
    }

    /**
     * Method to search for references from a specific conference venue
     * @param venue
     * @return
     */
    public static String lookUpByVenue(String venue){
        ListIterator<RefConference> iter = rcv.listIterator();
        String result = "";
        while(iter.hasNext()){
            RefConference current = iter.next();
            while(current.getVenue()==venue){
                result = result +current.getCitation();
                break;
            }
            break;
        }
        if(result.equals("")){
            result = "There are no citations from conferences at the specified venue";
        }
        return result;
    }

    /**
     * Method to search for references from a specific publisher
     * @param publisher
     * @return
     */
    public static String lookUpByPublisher(String publisher){
        ListIterator<Ref> iter = rc.listIterator();
        String result = "";
        while(iter.hasNext()){
            Ref current = iter.next();
            while(current.getPublisher()==publisher){
                result = current.getCitation();
                break;
            }
            break;
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