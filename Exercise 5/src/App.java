public class App {
    public static void main(String[] args) {
        
        HDMI old = new HDMI();

        VGA adapter = new VGAtoHDMI(old);

        Monitor monitor = new Monitor();
        monitor.display(adapter);
    }
}