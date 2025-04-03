
public class CriticalPatient {
    int patientId;
    private double waitingTime;
    private double treatmentTime;
    private double departureTime;
    int priority; // 0 normal or 1 critical
    private double arrivalTime;
    CriticalPatient(int patientId, double arrivalTime,int priority){
        this.patientId = patientId;
        this.arrivalTime = arrivalTime;
        this.priority = priority;
        this.treatmentTime = 0;
        this.departureTime = 0;
        this.waitingTime = 0;
    }

    public double geTreatmentTime() {
        return treatmentTime;
    }

    public void setTreatmentTime(double treatmentTime) {
        this.treatmentTime = treatmentTime;
    }
    public double getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public double getServiceTime() {
        return treatmentTime;
    }

    public void setServiceTime(double serviceTime) {
        this.treatmentTime = serviceTime;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public void setWaitingTime(double waitingTime) {
        this.waitingTime = waitingTime;
    }

    public double getWaitingTime() {
        return waitingTime;
    }

    public void displayInfo() {
        System.out.println("PatientID " + patientId +
                         ", Arrival Time: " + arrivalTime +
                ", Waiting Time: " + waitingTime +
                ", Treatment Time: " + treatmentTime +
                 ", Departure Time: " + departureTime+
                 ", Priority: " + (priority == 1 ? "Critical" : "Normal"));
    }
}

