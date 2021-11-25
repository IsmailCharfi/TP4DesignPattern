public class Porte extends Sujet {

    Porte() {
        super();
        this.etat = new Fermee(this);
    }

    public void etatSuivant() {
        this.etat = etat.etatSuivant();
        this.notifier();
    }

    public void ouvrir() {
        this.etat.ouvrir();
    }

    public void fermer() {
        this.etat.fermer();
    }

    public static void main(String[] args) {
        Porte porte = new Porte();
        InterfaceGraphique interfaceGraphique = new InterfaceGraphique(porte);
        porte.ajouter(interfaceGraphique);

        porte.fermer();
        porte.ouvrir();
        porte.fermer();
        porte.fermer();
        porte.fermer();
        porte.ouvrir();
        porte.ouvrir();

    }

}