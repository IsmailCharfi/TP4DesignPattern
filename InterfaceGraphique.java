public class InterfaceGraphique implements Observer {

    Porte porte;

    InterfaceGraphique(Porte p) {
        this.porte = p;
    }

    @Override
    public void actualiser() {
        System.out.println("| new state is : " + porte.etat + "       ");
    }

}
