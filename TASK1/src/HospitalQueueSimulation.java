import java.util.Random;

public class HospitalQueueSimulation {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 1; i <= 5; i++) {
            double arrivalTime = Queue.getPoissonRandom(5);

                normal np = new normal(i, arrivalTime);
                np.displayInfo();

        }
    }
}
