class Car implements InternalCombustion, Electric, Hybrid {

    Integer cylinder;
    String battery;

    Car(Integer cyl, String bat) {
        this.cylinder = cyl;
        this.battery = bat;
    }

    public Integer getbattery() {
        return this.battery;
    }
    
    public Integer getcylinder() {
        return this.cylinder;
    }
}