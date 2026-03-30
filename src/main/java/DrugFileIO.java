

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// this was needed for some reason ?? many errors and have questions on this
import java.io.IOException;




public class DrugFileIO {

    private String fileName = "drugs.txt";

    public void saveDrugToFile(Drug drug) {

        try {

            // here the file appends true and wont overwrite anything

            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);

            //writing them out now

            bw.write(drug.toString());
            bw.newLine();

            bw.close();
            System.out.println("Drug Saved To File.");
        } catch (IOException e ){
            // validating if something throws an error here
            System.out.println("Err Saving Drug To File-Try Again");
        }

    }


    // readiung all drugs from the file

    public List<Drug> readDrugsFromFile() {
        List<Drug> drugs = new ArrayList<>();

try{

    FileReader fr = new FileReader(fileName);
    BufferedReader br = new BufferedReader(fr);

    String line;

    /// iterating through weach line until there are none left
// here the lines got split by a commma to keep it seperate
    while((line = br.readLine()) != null){
        String[] parts = line.split(",");


        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        double cost = Double.parseDouble(parts[2]);
        String dosage = parts[3];

        Drug drug = new Drug(id, name, cost, dosage);
        drugs.add(drug);

    }
    br.close();
} catch(IOException e) {
    System.out.println("Err Reading File Try Again.");
}

return drugs;


    }

    public void displayAllDrugs(){

        List<Drug> drugs = readDrugsFromFile();
        if(drugs.isEmpty()) {
            System.out.println("No Drugs In File Please Try Again");
            return;
        }

        System.out.println(" ---- ALL DRUGS ---- ");
            // looping through here
        for(Drug drug : drugs) {
            System.out.println("ID: " + drug.getDrugId() + " NAME " + drug.getDrugName() + " COST " + drug.getDrugCost() + " DOSE " + drug.getDosage());
        }
    }








}