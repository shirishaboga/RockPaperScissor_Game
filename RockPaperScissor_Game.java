import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor_Game{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int userScore = 0;
        int computerScore = 0;

        System.out.println("===Game Rules===");
        System.out.println("Rock vs Paper = Paper Wins");
        System.out.println("Paper vs Scissor = Scissor Wins");
        System.out.println("Scissor vs Rock = Rock Wins\n");

        for(int round = 1; round <= 3; round++){

            System.out.println("----- Round " + round + " -----");

            int userInput = 0;

            do{
                System.out.println("Rock = 0\nPaper = 1\nScissor = 2");
                System.out.print("Choose your Option(0-2): ");

                while(!sc.hasNextInt()){
                    System.out.println("Please enter an integer!");
                    sc.next();
                }

                userInput = sc.nextInt();

                if(userInput < 0 || userInput > 2){
                    System.out.println("Enter choice between 0 - 2");
                }

            }while(userInput < 0 || userInput > 2);

            int computerInput = rd.nextInt(3);

            if(userInput == 0){
                System.out.println("\nYour choice: Rock");
            }else if(userInput == 1){
                System.out.println("Your choice: Paper");
            }else{
                System.out.println("Your choice: Scissor");
            }

            if(computerInput == 0){
                System.out.println("Computer choice: Rock");
            }else if(computerInput == 1){
                System.out.println("Computer choice: Paper");
            }else{
                System.out.println("Computer choice: Scissor");
            }

            if(userInput == computerInput){
                System.out.println("ROUND DRAW!");
            }else if((userInput == 0 && computerInput == 2) || 
                     (userInput == 1 && computerInput == 0) || 
                     (userInput == 2 && computerInput == 1)){
                System.out.println("YOU WON THIS ROUND!");
                userScore++;
            }else{
                System.out.println("COMPUTER WON THIS ROUND!");
                computerScore++;
            }

            System.out.println("Score -> You: " + userScore + 
                               " | Computer: " + computerScore + "\n");
        }

        System.out.println("===== FINAL RESULT =====");

        if(userScore > computerScore){
            System.out.println("YOU ARE THE HIGH SCORE WINNER!");
        }else if(computerScore > userScore){
            System.out.println("COMPUTER IS THE HIGH SCORE WINNER!");
        }else{
            System.out.println("MATCH DRAW!");
        }

        sc.close();
    }
}
