import java.util.InputMismatchException;
import java.util.Scanner;

public class AnimalPicker{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Would you like to see: 1. a dog 2. a cat.");
        System.out.println("Please select the number of the animal you would like to see.");
        int selection = -1;

do{
    try {
        int userInput = scanner.nextInt();

        if(userInput == 1){
            selection = userInput - 1;
            System.out.println("            __\r\n" + //
                                "(\\,--------'()'--o\r\n" + //
                                " (_    ___    /~\"\r\n" + //
                                "  (_)_)  (_)_)");
        }
        else if(userInput == 2){
            selection = userInput - 1;
            System.out.println("|\\---/|\r\n" + //
                                "| o_o |\r\n" + //
                                " \\_^_/");
        }
        else {
            System.out.println("Error: That number does not correspond with an animal, please try again.");
        }
    }
            catch(InputMismatchException e) {
                System.out.println("Error: That is not a valid number, please try again.");
                scanner.nextLine();
            }
        } while(selection<0);
    }
}