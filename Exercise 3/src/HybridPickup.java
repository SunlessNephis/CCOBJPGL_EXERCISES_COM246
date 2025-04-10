class HybridPickup extends HybridVehicle {
    // @Override
    // public String getcarname2() {
    //     return this.carname2;
    //   }

    //  HybridPickup(String namecar2) {
    //     this.carname2 = namecar2;
    
    @Override
    public void getCarName() {
        System.out.println("This Vehicle is a " + this.carname);
    }
}