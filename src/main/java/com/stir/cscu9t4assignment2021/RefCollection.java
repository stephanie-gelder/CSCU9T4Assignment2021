package com.stir.cscu9t4assignment2021;

//import java.util.Collection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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

    /**
     * Method to get the total number of each type of reference
     * @param type
     */
    public int getNumberOfRefs(String type){
        int results = 0;
        return results;
    }

    /**
     * Method to export all stored citations to a text file
     * @return
     */
    public String exportAll(){
        String results = "";
        try {
            File outputFile = new File("all_citations.txt");
            if(outputFile.createNewFile()){
                System.out.println("File " + outputFile.getName() + " created in: " + outputFile.getAbsolutePath());
            } else
                System.out.println("output file already exists");;
        }catch (IOException e){
            e.printStackTrace();
        }
        return results;
    }

    /**
     * Method to export all the journal citations, found by the users search, to a text file
     * @return
     */
    public String exportJSearch(){
        String results = "";
        try {
            File outputFile = new File("journal_citations.txt");
            if(outputFile.createNewFile()){
                System.out.println("File " + outputFile.getName() + " created in: " + outputFile.getAbsolutePath());
            } else
                System.out.println("output file already exists");;
        }catch (IOException e){
            e.printStackTrace();
        }
        return results;
    }

    /**
     * Method to export all citations found by the users search for a publisher to a text file
     * @return
     */
    public String exportPSearch(){
        String results = "";
        try {
            File outputFile = new File("publisher_citations.txt");
            if(outputFile.createNewFile()){
                System.out.println("File " + outputFile.getName() + " created in: " + outputFile.getAbsolutePath());
            } else
                System.out.println("output file already exists");;
        }catch (IOException e){
            e.printStackTrace();
        }
        return results;
    }

    /**
     * Method to export all citations found by the users search for a conference venue to a text file
     * @return
     */
    public String exportCVenSearch(){
        String results = "";
        try {
            File outputFile = new File("conf_ven_citations.txt");
            if(outputFile.createNewFile()){
                System.out.println("File " + outputFile.getName() + " created in: " + outputFile.getAbsolutePath());
            } else
                System.out.println("output file already exists");;
        }catch (IOException e){
            e.printStackTrace();
        }
        return results;
    }

    /**
     * Method to import multiple citations, as strings, from a csv file
     * @param filePath
     * @return
     */
    public static String importMany(String filePath){
        String row = "";
        try{
            BufferedReader csvReader = new BufferedReader(new FileReader("all_data_corrected.csv"));
            while ((row = csvReader.readLine()) != null){
                String[] data = row.split(",");
                System.out.println("Title: "+data[0] + ", authors: "+data[1]
                        + ", year published: "+data[2] + ", publisher: "+data[3]
                        + ", DOI number: " +data[4] + ", date added: "+data[5]);
            }
            csvReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return filePath;
    }
}