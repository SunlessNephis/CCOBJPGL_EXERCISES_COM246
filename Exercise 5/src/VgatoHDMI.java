class VgatoHDMI implements Hdmi {
    private Vga vga;

    public VgatoHDMI(Vga vga) {
        this.vga = vga;
    }

    @Override
    public void connectWithHDMI() {
        System.out.println("Adapting Vga to HDMI...");
        vga.connectWithVga();
    }
}