import java.util.Random;
import java.util.Scanner;

class Guessinggame {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rdm = new Random();
        boolean playAgain = true;
        
         System.out.println("                                   ");
         System.out.println("     ——————————————————————————————");
         System.out.println("      🎮 Guess the number (1-100)!");
            
        while (playAgain) {
            int tryCount = 0;
            int randomNumber = rdm.nextInt(100) + 1; 
           
                System.out.println("     ——————————————————————————————");
                System.out.println("       Enter Your Guess - (1-100): ");
                System.out.println("     ——————————————————————————————");
                System.out.println("                                   ");
                System.out.println("                                   ");
              
                while (true) {
                System.out.print("     ");   
                if (!scnr.hasNextInt()) {
                    System.out.println("     🤔 Oops! Enter a valid number.");
                    scnr.next();
                    continue;
                }

                int playerGuess = scnr.nextInt();
                  if (playerGuess < 1 || playerGuess > 100) {
                    System.out.println("    (⁠●⁠´⁠⌓⁠`⁠●⁠) Between 1 and 100 only");
                    continue;
                }

                tryCount++; 
                    
                    

                if (playerGuess == randomNumber) { 
                    
                    System.out.println("  ====================================");
                    System.out.println("     You did it!(⁠☞⁠^⁠o⁠^⁠)⁠ ⁠☞ You Win!!^°^");
                    System.out.println("     It took you " + tryCount + " tries^°^");
                    break;
                } else if (playerGuess < randomNumber) {
                    System.out.println("     Nice try! But make it HIGHER🔼");
                } else {
                    System.out.println("     Sorry but the Number is LOWER🔽");
                }
            }

            System.out.println("     Play again? (1 = Yes, 2 = No)");
            System.out.println("  ====================================");
            System.out.print("     "); 
                
            int choice = scnr.nextInt();
            if (choice == 1) {
                playAgain = true;
            } else if (choice == 2) {
                playAgain = false;
            } else {
                System.out.println("   ಠ⁠∀⁠ಠ Invalid choice. Exiting game.");
                playAgain = false;
                 
            }
        }

        scnr.close();
        System.out.println("   Ok Bye! Thanks for playing!! (⁠ ⁠⚈̥̥̥̥̥́⁠⌢⁠⚈̥̥̥̥̥̀⁠)");
    }
}