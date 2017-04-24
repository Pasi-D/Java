import java.util.Scanner;
class checkCrime{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the date : ");
		String strdate = scan.nextLine();
		
		int date = Integer.parseInt(strdate.substring(0,2));

		if (isPrime(date)) {
			System.out.println("There will be a crime !");
		}else{
			System.out.println("There will not be a crime !");
		}


	}

	private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
	}
}