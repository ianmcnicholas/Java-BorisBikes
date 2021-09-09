import java.util.ArrayList;

public class DockingStation {

    private ArrayList<Bike> bikesList = new ArrayList<Bike>();

    public DockingStation() {
        this.bikesList = bikesList;
    }

    public ArrayList getBikesList() {
        return bikesList;
    }

    public void dock(Bike bike) {
        bikesList.add(bike);
    }

    public Bike release() {
        return bikesList.remove((bikesList.size() - 1)); // returns the last item in the ArrayList
    }
}
