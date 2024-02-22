import java.util.Scanner;

public class AnimalPicker{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Would you like to see: 1. a dog 2. a cat.");
        System.out.println("Please select the number of the animal you would like to see.");

        int userInput = scanner.nextInt();

        if(userInput == 1){
            System.out.println("DOG ASCII ART HERE");
        }
        else if(userInput == 2){
            System.out.println("CAT ASCII ART HERE");
        }
    }
}