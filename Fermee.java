public class Fermee extends Etat {

    Fermee(Porte p) {
        super(p);
    }

    @Override
    public Etat etatSuivant() {
        return new Ouverture(p);
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
