package gestionnaireBibliotheque;
import java.util.PriorityQueue;

public class FilePrioriteReservations {
    private PriorityQueue<Reservation> file;

    public FilePrioriteReservations() {
        this.file = new PriorityQueue<>();
    }
}
