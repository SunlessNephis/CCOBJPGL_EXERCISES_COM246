public class App {
    public static void main(String[] args) throws Exception {
       
        // HybridVehicle car1 = new HybridSedan("HybridSedan");
        // HybridVehicle car2 = new HybridPickup("HybridPickup");

        // System.out.println(car1.getcarname());
        // System.out.println(car2.getcarname());
        HybridVehicle car1 = new HybridSedan();
        car1.carname = "Hybrid Sedan";
        
        HybridVehicle car2 = new HybridPickup();
        car2.carname = "Hybrid Pickup";
        
        Carwash wash1 = new Carwash();
        Carwash wash2 = new Carwash();

        wash1.wash(car1);
        wash2.wash(car2);
    }
}
