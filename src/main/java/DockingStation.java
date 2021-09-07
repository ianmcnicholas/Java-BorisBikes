import java.util.ArrayList;

public class DockingStation {

    private ArrayList<Bike> bikesList = new ArrayList<Bike>();
    private Bike bike;

    public DockingStation() {
        this.bikesList = bikesList;
    }

    public ArrayList getBikesList() {
        return bikesList;
    }

    public void dock(Bike bike) {
        bikesList.add(bike);
    }
}
