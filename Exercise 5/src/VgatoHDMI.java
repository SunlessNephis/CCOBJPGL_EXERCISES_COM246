class VGAtoHDMI implements VGA{
    private HDMI hdmi;

    public VGAtoHDMI (HDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void connectWithVGA() {
        System.out.println("Adapting HDMI to VGA");
        hdmi.connectWithHDMI();
    }
}