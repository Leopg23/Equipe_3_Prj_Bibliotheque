package gestionnaireBibliotheque;

import java.util.Objects;

public class Utilisateur{
    private int id;
    private String nom;
    private ListeEmprunts  empruntsEnCours;
    private ListeEmprunts empruntsTermines;
    private FilePrioriteReservations reservations;
    public static final int MAX_RESERVATIONS = 10;

    public Utilisateur(int id,  String nom) {
        this.id = id;
        this.nom = nom;
        this.empruntsEnCours = new ListeEmprunts();
        this.reservations = new FilePrioriteReservations();
        this.empruntsTermines = new ListeEmprunts();
    }

    public void ajouterEmpruntEnCours(Emprunt emprunt) {
    this.empruntsEnCours.ajouter(emprunt);
    }

    public void ajouterEmpruntTermines(Emprunt emprunt) {
        this.empruntsTermines.ajouter(emprunt);
    }


}
