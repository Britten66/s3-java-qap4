public class Patient {


    // variables

    private int patientId;
    private String patientFirstName;
    private String patientLastName;
    private String patientDOB;


  public Patient(int patientId, String patientFirstName, String patientLastName, String patientDOB){
    this.patientId = patientId;
    this.patientFirstName = patientFirstName;
    this.patientLastName = patientLastName;
    this.patientDOB = patientDOB;
  }


  // Getters here


    public int getPatientId() {
        return patientId;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public String getPatientDOB() {
        return patientDOB;
    }


    //setters here


    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public void setPatientDOB(String patientDOB) {
        this.patientDOB = patientDOB;

    }


    @Override
    public String toString() {
        return patientId + "," + patientFirstName + "," + patientLastName + "," + patientDOB;
    }


}
