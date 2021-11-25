public abstract class Etat {

    Porte p;

    Etat(Porte p) {
        this.p = p;
    }

    public abstract Etat etatSuivant();

    public abstract void ouvrir();

    public abstract void fermer();
}