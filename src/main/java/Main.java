public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello there everybody!");
        DockingStation dockingStation = new DockingStation();
        Bike bike1 = new Bike();
        dockingStation.dock(bike1);
        System.out.println(dockingStation.getBikesList());
    }
}
