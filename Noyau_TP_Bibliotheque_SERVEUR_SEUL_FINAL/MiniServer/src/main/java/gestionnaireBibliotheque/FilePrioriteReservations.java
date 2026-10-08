package gestionnaireBibliotheque;
import java.util.PriorityQueue;

public class FilePrioriteReservations {
    private PriorityQueue<Reservation> file;

    public FilePrioriteReservations() {
        this.file = new PriorityQueue<>();
    }

    public PriorityQueue<Reservation> getFile() {
        return this.file;
    }

    public int taille() {
        return 0;
    }

    public boolean ajouter(Reservation reservation) {
        return true;
    }
}
