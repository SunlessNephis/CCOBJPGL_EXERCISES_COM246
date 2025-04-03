import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    //     System.out.println("Enter your username:");

    //     Scanner loginScanner = new Scanner(System.in);

    //     String username_from_input = loginScanner.nextLine();

    //     System.out.println("Enter your password:");

    //     String password_from_input = loginScanner.nextLine();
    //     loginScanner.close(); 

    //     System.out.println("Your username is: " + username_from_input);
    //     System.out.println("Your password is: " + password_from_input);

    //     User me = new User(username_from_input, password_from_input);

    //     File myfile = new File("accounts.txt");

    //     Scanner fileScanner = new Scanner(myfile);
            
    //     Boolean accountexists = false;

    //     while (fileScanner.hasNextLine()) {
    //         String filedata = fileScanner.nextLine();
    //         String username_from_file = filedata.split(", ")[0];
    //         String password_from_file = filedata.split(", ")[1];
            
    //         if (username_from_input.equals(username_from_file) && password_from_input.equals(password_from_file)) {
    //          accountexists = true;
    //         break;
    //         }
    //     }

    //     if (accountexists) {
    //         System.out.println("Login successful, Hello "+ me.getUsername());
    //     } else {
    //         System.out.println("Account does not exist");
    //     }

    //     fileScanner.close();
    // }

    // DataScientist dataScientist1 = new DataScientist("John", null, null);
    // Researcher researcher1 = new Researcher("Jane", null, null);

    // System.out.println("His name is " + dataScientist1.name);
    // System.out.println("His work is " + dataScientist1.getwork());
    // System.out.println("His salary is " + dataScientist1.getsalary());
    
    // System.out.println("Her name is " + researcher1.name);
    // System.out.println("Her work is " + researcher1.getwork());
    // System.out.println("Her salary is " + researcher1.getsalary());

    Car myCar = new Car(6, "10kwh");

    System.out.println("My car has a " + myCar.getbattery() + "battery");
    System.out.println("and it also has " + myCar.getcylinder() + "cylinders");
}
}