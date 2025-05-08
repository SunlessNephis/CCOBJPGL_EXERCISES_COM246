class Monitor {
    public void display(VGA vga) {
        System.out.println("Monitor expecting VGA input");
        vga.connectWithVGA();
        System.out.println("Displaying Content");
    }
}