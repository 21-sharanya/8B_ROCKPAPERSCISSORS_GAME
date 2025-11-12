import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random random = new Random;

		int userScore=0;
		int ComputerScience = 0;
		int rounds = 3;

System.out.println("Welcome to Rock,Paper,Scissors Game!);
System.out.println("You will play"+ "rounds against the computer\n");
		

		for (int i = 0; i <= rounds; i++) {
			System.out.println("Round" +i+ ":");
			System.out.println("Enter your choice(rock,paper,scissors):");
			String userChoice = sc.nextLine().toLowerCase();
			
		//computer's choice
		int compNum = random.nextInt(3);
		String computerChoice = (compNum == 0)? "rock":(compNum ==1)?"paper":"scissors";
		System.out.println("Computer Chose:" + computerChoice);

			// determine the winner
	         if (userChoice.equals(computerChoice)){ 
				 System.out.println("Its a tie!\n");
			 } else if (
				 (userChoice.equals("rock")&& computerChoice.equals("scissors"))
				 (userChoice.equals("paper")&& computerChoice.equals("rock")
				  (userChoice.equals("scissors")&& computerChoice.equals("paper"))
				 ){
				 System.out.println("You win this round!\n"
				userScore++;
			 } else {
				 System.out.Println("computer wins this round!\n"
				 computerScore++;
			 }
		}

			//final result
			System.out.println("-----FINAL SCORE-----");
			System.out.println("You: "+ userScore + |Computer: "+ computerScore)

			if (userScore> computerScore)
				System.out.println("Congragulations! You are the overall winner!")
			else if (computerScore > userScore)
					System.out.println("Computer wins the game!")
            sc.close();
		}
	}
				

				
		

	



