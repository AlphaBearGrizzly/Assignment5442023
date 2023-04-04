package assn05;

import java.util.ArrayList;
import java.util.List;

public class SimpleEmergencyRoom {
    private List<Patient> patients;

    public SimpleEmergencyRoom() {
        patients = new ArrayList<>();
    }

    // TODO: dequeue
    public Patient dequeue() {
// 1. Fill in the dequeue method to find the patient with the largest priority using
//a for loop. Return that patient and remove them from the list.
//2. Write some tests in Main.java to convince yourself that your implementation is working.
        private int i = 0;
        public int compareInt = 0;

        for (i <= (size()-1){
            if Patient(i).getPriority >= Patient(compareInt).getPriority{
                compareInt = i;
        }
            i++;
        }
        return remove(compareInt);
    }
    public Patient remove(int compareInt){
        public yeetedPatient = Patient(compareInt);
        for (i = compareInt, i <= size()-1, i++){
            Patient(i).setValue(i-1); // this should eliminate the compare int one
        }
        // need to set patients to decrease in size by 1
        patients--;
        return yeetedPatient;
    }

    public <V, P> void addPatient(V value, P priority) {
        Patient patient = new Patient(value, (Integer) priority);
        patients.add(patient);
    }

    public <V> void addPatient(V value) {
        Patient patient = new Patient(value);
        patients.add(patient);
    }

    public List getPatients() {
        return patients;
    }

    public void setSize(){

    }

    public int size() {
        return patients.size();
    }

}
