/*This is the final java file. 
Compile all java files and run this by typing 
java newStairs in your cli*/

import java.util.Scanner;
class newStairs extends Stairs{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Which step do you want to place your human ?: ");
		int step = scan.nextInt();

		switch(step){
			case 1:
				makeStars("                                    ");
				makeStars("                           ");
				makeStars("                  ");
				makeStars("         ");
				makemannedStars("");
				break;
			case 2:
				makeStars("                                    ");
				makeStars("                           ");
				makeStars("                  ");
				makemannedStars("         ");
				makeStars("");
				break;
			case 3:
				makeStars("                                    ");
				makeStars("                           ");
				makemannedStars("                  ");
				makeStars("         ");
				makeStars("");
				break;
			case 4:
				makeStars("                                    ");
				makemannedStars("                           ");
				makeStars("                  ");
				makeStars("         ");
				makeStars("");
				break;
			case 5:
				makemannedStars("                                    ");
				makeStars("                           ");
				makeStars("                  ");
				makeStars("         ");
				makeStars("");
				break;
			default:
				System.out.println("The number you entered is too high");
		}
	}
} 