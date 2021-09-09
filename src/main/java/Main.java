public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello there everybody!");
        DockingStation dockingStation = new DockingStation();
        Bike bike1 = new Bike();
        System.out.println(dockingStation.getBikesList());
        dockingStation.dock(bike1);
        System.out.println(dockingStation.getBikesList());
    }
}
