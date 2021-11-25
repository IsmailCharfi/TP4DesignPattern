public class Fermeture extends Etat {

    Fermeture(Porte p) {
        super(p);
    }

    @Override
    public Etat etatSuivant() {
        return new Fermee(p);
    }

    @Override
    public void ouvrir() {
        System.out.println("le moteur est en train d'ouvrir la porte. ");
        this.p.etatSuivant();
    }

    @Override
    public void fermer() {

    }

}
