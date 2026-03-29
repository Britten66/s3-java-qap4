
import java.util.Scanner;



public class Main {

public static void main(String[] args) {


// creating file database handlers
    DrugFileIO drugFileIO = new DrugFileIO();

    // here is the scanner ! for the user input

    Scanner sc = new Scanner(System.in);
    // setting this to 0 to leave it as empty
    int choice = 0;


    // here we start a while loop

    while (choice != 5) {

        // menu output
        // this will have all the options the user will pick from

        System.out.println("--- MENU ---");
        System.out.println("1. Save Drug to File");
        System.out.println("2. Read Drugs from File");
        System.out.println("Save Patient to Database");
        System.out.println("Read Patients from Database");
        System.out.println("Exit");
        System.out.println("Pick From One Of The Following Options");

        // this will assign the choice to the next entry as an int
        // and following it im adding a nextLine

        choice = sc.nextInt();
        sc.nextLine();

        // if statement here
        // using this for the handler section

        if (choice == 1 ) {

            // same process with these lines and user input
            // saving here
            System.out.println("Enter Drug ID");
            int id = nextInt();
            sc.nextLine();


            System.out.println("Enter Drug Name");
            String name = nextLine();


            System.out.print("Enter Drug Cost: ");
            double cost = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Dosage: ");
            String dosage = sc.nextLine();

            Drug drug = new Drug(id, name, cost, dosage);
            drugFileIO.saveDrugToFile(drug);


        } else if ( choice == 2) {

            drugFileIO.displayAllDrugs();

        } else if ( ( choice == 3 ))  {
            System.out.println("Patient database not running");
        } else if (choice == 4) {

            System.out.println(" not filled in here yet" );
        } else if (choice == 5){

            System.out.println(("exiting"));{

            }else {
                System.out.println("Cannot read entry try again.");
            }
        }

sc.close();
    }













}

}
