public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello there everybody!");
        DockingStation dockingStation = new DockingStation();
        Bike bike1 = new Bike();
        Bike bike2 = new Bike();
        System.out.println("This is bike1:");
        System.out.println(bike1);
        System.out.println("Is bike1 working?");
        System.out.println(bike1.getIsWorking());
        System.out.println("This is bike2:");
        System.out.println(bike2);
        System.out.println("Is bike2 working?");
        System.out.println(bike2.getIsWorking());
        System.out.println("This is the current contents of the docking station:");
        System.out.println(dockingStation.getBikesList());
        dockingStation.dock(bike2);
        dockingStation.dock(bike1);
        System.out.println("bike2 was docked, and then bike1 was docked.");
        System.out.println("This is the current contents of the docking station:");
        System.out.println(dockingStation.getBikesList());
        System.out.println("This is what you get when you release a bike:" + dockingStation.release());
        System.out.println("And this is what is left in the docking station:");
        System.out.println(dockingStation.getBikesList());
    }
}
