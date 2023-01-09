
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House house = new House();
        String[] residents = new String[3];

        System.out.println("Who lives in this house?");
        System.out.println("(Input names separated by commas)");

            for (int i = 0; i < residents.length; i++) {
                residents[i] = scanner.nextLine();


                System.out.println("This house in " + house.getAddress() +
                        " has " + house.getNumberOfFloors() + " floors" +
                        " and " + residents[i] + " lives here!");

        }
    }
}
