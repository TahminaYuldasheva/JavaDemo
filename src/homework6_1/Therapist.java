package homework6_1;

public class Therapist extends Doctor {
    public void heal() {
        System.out.println("Терапевт осматривает пациента. Назначает врача.");
    }

    public void treatmentPlan(Patient patient) {
        if (patient.getTreatmentPlan() == 1) {
            patient.setDoctor(new Surgeon());
        } else if (patient.getTreatmentPlan() == 2) {
            patient.setDoctor(new Dentist());
        } else {
            patient.setDoctor(new Therapist());
        }
        patient.getDoctor().heal();
    }
}
