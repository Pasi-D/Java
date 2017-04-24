import java.util.Scanner;


public class one{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);	
		int num;
		System.out.println("------------Java SquareNumGenerator------------\n");
		System.out.print("Enter a number: ");
		num = scan.nextInt();
		System.out.println("Square Numbers: (< " + num + ")" );
		printSquares(num);
	}	

	static void printSquares(int num){
		try{
			if (num > 0) {
			int i = 1;
			while(i < num){
				System.out.print(i*i + " ");
				i++;
			}
			}else{
				throw new invalidValueException("The value is negative");
			}
		}catch(invalidValueException e){
			System.out.println(e.getMessage());
		}
	}
}