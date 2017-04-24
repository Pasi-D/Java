/*This is not the final java file. 
Please compile all java files first and run newStairs.java using 
java newStairs command in cli*/

class newStars extends Stars{
	public static void main(String[] args) {
		makemannedStars("    ");
	}

	static void makemannedStars(String init){
		for (int j = 0;j <= 4 ;j++ ) {
			System.out.print(init);			
			if(j == 4){				
				for (int i = 0;i <= 3;i++ ) {
					System.out.print(" * ");
				}
			}else if(j == 3){
				System.out.print("    / " + "\\" + "   " + "*");				
			}else if(j == 2){
				System.out.print("     |    " + "*");
			}else if(j == 1){
				System.out.print("    /|" + "\\" + "   " + "*");
			}else if(j == 0){
				System.out.print("     0    " + "*");
			}
			System.out.print("\n");
		}
	}
}