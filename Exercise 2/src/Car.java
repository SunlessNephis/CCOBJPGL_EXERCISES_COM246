class Car implements Hybrid, Electric, InternalCombustion {

    Integer cylinder;
    Integer battery;

    Car(Integer cyl, Integer bat) {
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