package gestionnaireBibliotheque;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Iterator;



public class ListesLivres implements IListeLivres, Iterable<Livre>
 {


    private ArrayList<Livre> livres =  new ArrayList<>();


    public ListesLivres(ArrayList<Livre> livres) {
        this.livres = livres;
    }

    //methodes
    public boolean ajouter(Livre livre){
        if (livres.add(livre)){
            return true;
        }
        return false;
    }



    public Livre supprimer(int idLivre){
        for (Livre livre : livres) {
            if (idLivre ==  livre.getId()){
                livres.remove(livre);
                return livre;
            }
        }
        return null;
    }

    public Livre rechercher(int idLivre) {
     for (Livre livre : livres) {
         if (idLivre == livre.getId()) {
             return livre;
         }
     }
     return null;
 }

    public boolean contient(int idLivre){
        for (Livre livre : livres) {
            if (idLivre ==  livre.getId()){
                return true;
            }
        }
        return false;
    }

    public int taille(){
        return livres.size();
    }
    public boolean estVide(){
        return livres.isEmpty();
    }

    public  Iterator<Livre> iterator(){

        return livres.iterator();
    }

    public String toString(){
        return livres.toString();
    }
}
