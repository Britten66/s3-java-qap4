import java.sql.*;

public class PatientDB {
 // url info and user / pass
    private static final String URL      = "jdbc:postgresql://localhost:5432/qap4";
    private static final String USER     = "postgres";
    private static final String PASSWORD = "";
    // starting connections
    // had bugs and needed to paste this over again
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // assigning values to statemtent requests
    // bug with connectino getConnection() was throwing exception was out of bounds
    public void savePatientToDB(Patient patient) {
        String sql = "INSERT INTO patients (patient_id, first_name, last_name, dob) VALUES (?, ?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement insertStatement = connection.prepareStatement(sql)) {
            insertStatement.setInt(1, patient.getPatientId());
            insertStatement.setString(2, patient.getPatientFirstName());
            insertStatement.setString(3, patient.getPatientLastName());
            insertStatement.setString(4, patient.getPatientDOB());
            insertStatement.executeUpdate();
            System.out.println("Patient saved to database.");
        } catch (SQLException e) {
            System.out.println("Error saving patient: " + e.getMessage());
        }
    }

    //displaying all patients

    public void displayAllPatients() {
        System.out.println("\n---- ALL PATIENTS ----");
        String sql = "SELECT * FROM patients";
        try (Connection connection = getConnection();
             PreparedStatement selectStatement = connection.prepareStatement(sql);
             ResultSet results = selectStatement.executeQuery()) {
            int count = 0;
            while (results.next()) {
                int id          = results.getInt("patient_id");
                String first    = results.getString("first_name");
                String last     = results.getString("last_name");
                String dob      = results.getString("dob");
                System.out.println("ID: " + id + " NAME: " + first + " " + last + " DOB: " + dob);
                count++;
            }
            if (count == 0) System.out.println("No patients found.");
        } catch (SQLException e) {
            System.out.println("Error reading patients: " + e.getMessage());
        }
    }
}