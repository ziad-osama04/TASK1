public class normal extends Queue{
    private double waitingTime;

    public normal(int patientId, double arrivalTime) {
        super(patientId, arrivalTime);
        this.waitingTime = getGaussianRandom(10, 3);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Normal Patient Waiting Time: " + waitingTime + " minutes");
    }
}
