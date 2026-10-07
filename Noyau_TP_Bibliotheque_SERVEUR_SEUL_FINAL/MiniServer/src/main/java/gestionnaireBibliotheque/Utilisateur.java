package gestionnaireBibliotheque;

import java.util.Objects;

public abstract class  Utilisateur{
    private int id;
    private String nom;
    private ListeEmprunts empruntsEnCours =  new ListeEmprunts();
    private ListeEmprunts empruntsTermines = new ListeEmprunts();
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
    //add pour ajouter a l array list
        this.empruntsEnCours.add(emprunt);

    }

    public void ajouterEmpruntTermines(Emprunt emprunt) {
        this.empruntsTermines.add(emprunt);
    }

    public Emprunt supprimerEmpruntEnCours( int idEmprunt){
        return this.empruntsEnCours.supprimer(idEmprunt);
    }

    public Emprunt rechercherEmpruntEnCours(int idEmprunt){
         return this.empruntsEnCours.rechercher(idEmprunt);
    }

    public Emprunt rechercherEmpruntTermines(int idEmprunt){
        return this.empruntsTermines.rechercher(idEmprunt);
    }


    public boolean aDesEmpruntsEnCours(){
        if (this.empruntsEnCours.taille() >= 1){
            return true;
        }
        return false;
    }

    public abstract int nombreMaxEmprunts();

    public boolean peutEmprunter(){
        if (this.empruntsEnCours.taille()<=MAX_RESERVATIONS){
            return true;
        }
        return false;
    }
//6.12
    public boolean possedeReservationEnAttentePourLivre (int idLivre){
      //  if (this.reservations)
    }


}
