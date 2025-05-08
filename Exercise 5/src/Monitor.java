class Monitor {
    public void connect(Hdmi connector) {
        System.out.println("Monitor expecting HDMI connector...");
        connector.connectWithHDMI();
        System.out.println("Connection established.");
    }
}