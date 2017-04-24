import java.util.Scanner;
class Decrypt{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the encrypted String : ");

		String encrString = scan.nextLine();

		decrypt(encrString);


	}

	static void decrypt(String encrString){
		String decrString = "";

		char alphabet[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		char revAlphabet[] = {'Z', 'Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R', 'Q', 'P', 'O', 'N', 'M', 'L', 'K', 'J', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A'};
		

		for (int j = 0;j < (encrString.length()) ;j++ ) {
			char letter = encrString.charAt(j);
			
			for (int i = 0; (i < alphabet.length); i++) {
		        if (alphabet[i] == letter) {		        	
		          	decrString = decrString.concat("" + revAlphabet[i]);		          			          	  
		        }
	    	}
		}

	    System.out.println(decrString);
	}
}