import java.io.*;
import java.util.*;

public class two {
	
	public static void main(String[] args) throws IOException{
		try{
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in)); 
			String line;
			int[] list = new int[3];
			int listindex = 0;
			while ((line = stdin.readLine()) != null && line.length()!= 0){
				String[] input = line.split(", ");
				if (input.length == 3){
					list[listindex]	= Math.max(Math.max(Integer.valueOf(input[0]),Integer.valueOf(input[1])),Integer.valueOf(input[2]));		
					listindex += 1;
				}
			}
			System.out.println(Math.max(Math.max(list[0], list[1]), list[2]));
		}catch(NumberFormatException e){
			System.out.println("Error Noted");
			System.out.println(e.getMessage());
		}
	}	
}
