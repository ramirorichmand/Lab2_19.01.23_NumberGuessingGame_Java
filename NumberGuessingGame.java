import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args){
        // random number generator between 1 and 20
        int secretNumber;
        secretNumber = (int) (Math.random() * 19 + 1);
        System.out.println("The Secret Number is " + secretNumber);

        // create Scanner object to read user input
        Scanner input = new Scanner(System.in);
        int guess;

        //read textbook on while loops -> allow user as many attempts required
        //while loop added from line 29
       do {

           //user input
           System.out.println("I am thinking of a number between 1 and 20: ");
           guess = input.nextInt();
           System.out.println("The number you have guessed is " + guess);

           //if and else if statements to check if user is correct
           if (guess == secretNumber)
               System.out.println("You are a wizard! Well done for finding the Secret Number");
           // if their guess is smaller
           if (secretNumber > guess)
               System.out.println("Your guess is unfortunately smaller than the Secret Number");
           // if their guess is larger
           if (secretNumber < guess)
               System.out.println("Your guess is unfortunately larger than the Secret Number");

           //close do while loop
       } while (guess != secretNumber);

        //

    }
}
