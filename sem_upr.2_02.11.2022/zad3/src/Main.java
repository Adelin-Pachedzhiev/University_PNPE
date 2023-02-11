public class Main {
    public static void main(String[] args) {

        SickPatient patient = new SickPatient("ivan", "sofia", "112231231", "drug 12", "sick", 120);
        System.out.println(patient.getName());
        System.out.println(patient.getAddress());
        System.out.println(patient.getDayOfSickness());
        patient.setAddress("vraca");
        System.out.println(patient.getAddress());

        patient.cure("paracetamol", 20);
        System.out.println(patient.getSummary());

    }
}