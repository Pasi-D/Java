import java.io.*;
import java.util.*;

public class four {
	
	public static void main(String[] args) throws IOException{
			try{
				File file = new File("primes.txt");
				BufferedWriter outputWriter = null;
				System.out.println("Start typing the inputs seperated by commas and make sure not to put , at the end of each line \n-----------------------------------------------------------------------------------------------");
				BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
				String line;
				int[] list = new int[20];
				int listindex = 0;
				while ((line = stdin.readLine()) != null && line.length()!= 0){
					String[] input = line.split(", ");
					if (input.length == 5){
						for (int j=0;j < 5 ;j++ ) {
							int tempnum = Integer.valueOf(input[j]);
							if (checkPrime(tempnum)) {
								list[listindex] = tempnum;
								listindex += 1;
							}
						}
					}
				}
				outputWriter = new BufferedWriter(new FileWriter(file));
				for (int i=0;i < listindex ; i++ ) {
					outputWriter.write(Integer.toString(list[i]));
    				outputWriter.newLine();
				}
				outputWriter.flush();  
  				outputWriter.close();
			}catch(NumberFormatException e){
				System.out.println("Error Noted");
				System.out.println(e.getMessage());
			}
	}

	static boolean checkPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;

	}
}