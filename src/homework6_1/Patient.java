package homework6_1;

public class Patient {
    private final int treatPlan;
    private Doctor doctor;

    public Patient(int treatmentPlan) {
        this.treatPlan = treatmentPlan;
    }

    public int getTreatmentPlan() {
        return treatPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
