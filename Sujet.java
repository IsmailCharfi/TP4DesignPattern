import java.util.*;

public class Sujet {

    public Etat etat;

    List<Observer> observers = new ArrayList<>();

    public void ajouter(Observer o) {
        this.observers.add(o);
    }

    public void supprimer(Observer o) {
        this.observers.remove(o);
    }

    public void notifier() {
        for (Observer o : observers)
            o.actualiser();
    }
}
