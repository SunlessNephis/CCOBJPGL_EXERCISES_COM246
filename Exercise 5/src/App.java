public class App {
    public static void main(String[] args) {
        // Old VGA
        Vga oldconnector = new Vga();

        // Adapter to make it compatible with HDMI port
        Hdmi connector = new VgatoHDMI(oldconnector);

        // Monitor uses Vga as if it's an Hdmi cord
        Monitor monitor = new Monitor();
        monitor.connect(connector);
    }
}