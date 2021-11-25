public class Ouverture extends Etat {

    Ouverture(Porte p) {
        super(p);
    }

    @Override
    public Etat etatSuivant() {
        return new Ouverte(p);
    }

    @Override
    public void ouvrir() {

    }

    @Override
    public void fermer() {
        System.out.println("le moteur est en train de fermer la porte. ");
        this.p.etatSuivant();
    };

}
