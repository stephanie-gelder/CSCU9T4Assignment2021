package com.stir.cscu9t4assignment2021;

//import java.util.Collection;
import java.io.*;
import java.util.*;

public class RefCollection {
    private static List<Ref> rc;
    private static List<RefJournal> rcj;
    private static List<RefConference> rcv;
    private static List<RefBookChapter> rcb;

    public RefCollection(){
        rc = new ArrayList<>();
        rcj = new ArrayList<>();
        rcv = new ArrayList<>();
        rcb = new ArrayList<>();
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
            if (current.getJournal().equals(journal)){
                result = result + current.getCitation();

            }
            if(result.equals("")){
                result = "There are no citations from the specified journal";
            }
            break;
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
            if (current.getVenue().equals(venue)){
                result = result +current.getCitation();
            }
            if(result.equals("")){
                result = "There are no citations from conferences at the specified venue";
            }
            break;
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
            if (current.getPublisher().equals(publisher)){
                result = current.getCitation();
            }
            if(result.equals("")){
                result = "There are no citations from the specified publisher";
            }
            break;
        }
        return result;    }

    /**
     * Method to get the total number of each type of reference
     * @param type
     */
    public int getNumberOfRefs(String type){
        int results = 0;
        if(type == "journal"){ //if the type of reference is a journal then...
            results = rcj.toArray().length; //assigns the length of the ArrayList to the variable results as an integer
                //nothing is added to the rcj ArrayList so the method will return 0
        }
        else if(type == "book"){ //if the type of reference is a book then...
            results = rcb.toArray().length; //assigns the length of the ArrayList to the variable results as an integer
                //nothing is added to the rcb ArrayList so the method will return 0
        }
        else if(type == "conference"){ //if the type of reference is a conference then...
            results = rcv.toArray().length; //assigns the length of the ArrayList to the variable results as an integer
                //nothing is added to the rcv ArrayList so the method will return 0
        }
        else{ //other wise...
            results = rc.toArray().length; //assigns the length of the ArrayList to the variable results as an integer
                            //should return the total number of references as no type was specified
        }
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
                FileWriter fw = new FileWriter(outputFile, true); //true will append data to text file
                fw.write(String.valueOf(rc)); //appends the contents of the rc ArrayList to the .txt file
                fw.write("\n"); //new line
                fw.close();
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
                FileWriter fw = new FileWriter(outputFile, true); //true will append data to text file
                fw.write(String.valueOf(rcj)); //appends the contents of the rcj ArrayList to the .txt file
                //fw.write(REfCollection.lookUpByJournal());
                fw.write("\n"); //new line
                fw.close();
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
                FileWriter fw = new FileWriter(outputFile, true); //true will append data to text file
                fw.write(String.valueOf(rc)); //appends the contents of the rcj ArrayList to the .txt file
                                        //Not correct as will append the full reference list rather than just the
                                        //references that match the publisher
                //fw.write(RefCollection.lookUpByPublisher());
                fw.write("\n"); //new line
                fw.close();
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
                FileWriter fw = new FileWriter(outputFile, true); //true will append data to text file
                fw.write(String.valueOf(rcv)); //appends the contents of the rcv ArrayList to the .txt file
                //fw.write(RefCollection.lookUpByVenue());
                fw.write("\n"); //new line
                fw.close();
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