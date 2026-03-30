import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // creating file and database handlers
        DrugFileIO drugFileIO = new DrugFileIO();
        PatientDB writtenPatientDB = new PatientDB();

        // scanner for user input
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {

            System.out.println("--- MENU ---");
            System.out.println("1. Save Drug to File");
            System.out.println("2. Read Drugs from File");
            System.out.println("3. Save Patient to Database");
            System.out.println("4. Read Patients from Database");
            System.out.println("5. Exit");
            System.out.println("Pick From One Of The Following Options");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.println("Enter Drug ID");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Drug Name");
                String name = sc.nextLine();

                System.out.print("Enter Drug Cost: ");
                double cost = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter Dosage: ");
                String dosage = sc.nextLine();

                Drug drug = new Drug(id, name, cost, dosage);
                drugFileIO.saveDrugToFile(drug);

            } else if (choice == 2) {

                drugFileIO.displayAllDrugs();

            } else if (choice == 3) {

                System.out.println("Enter Patient ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter First Name: ");
                String firstName = sc.nextLine();

                System.out.println("Enter Last Name: ");
                String lastName = sc.nextLine();

                System.out.println("Enter DOB (YYYY-MM-DD): ");
                String dob = sc.nextLine();

                Patient writtenPatient = new Patient(id, firstName, lastName, dob);
                writtenPatientDB.savePatientToDB(writtenPatient);

            } else if (choice == 4) {

                writtenPatientDB.displayAllPatients();

            } else if (choice == 5) {

                System.out.println("Exiting. Goodbye!");

            } else {
                System.out.println("Cannot read entry try again.");
            }
        }

        sc.close();
    }
}