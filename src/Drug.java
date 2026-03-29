public class Drug {

    // requirements are drug ID , drug Name, drug Cost , and dosage

    private int drugId;

    private double drugCost;


    private String drugName;
    private String dosage;


    // parameteriszed constructor here

    public Drug(int drugId, String drugName, double drugCost, String dosage){

        this.drugId = drugId;
        this.drugCost = drugCost;
        this.drugName = drugName;
        this.dosage = dosage;
    }


    //  getters here

    public  int getDrugId(){

        return  drugId;
    }

    public String getDosage() {
        return dosage;
    }

    public String getDrugName() {
        return drugName;
    }

    public double getDrugCost() {
        return drugCost;
    }

// setters are here


    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public void setDrugCost(double drugCost) {
        this.drugCost = drugCost;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return drugId + "," + drugName + ", " + drugCost + ", " + dosage;
    }
}
