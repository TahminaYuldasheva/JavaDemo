package homework6_1;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient(3);
        Therapist therapist = new Therapist();
        therapist.treatmentPlan(patient);
    }
}
