/*This is not the final java file. 
Please compile all java files first and run newStairs.java using 
java newStairs command in cli*/

class Stars{
	public static void main(String[] args) {
		makeStars("");	
	}
	static void makeStars(String init){
		for (int j = 0;j <= 4 ;j++ ) {
			System.out.print(init);
			if(j == 4){				
				for (int i = 0;i <= 3;i++ ) {
					System.out.print(" * ");
				}
			}else{

				for (int i=0;i <= 3;i++ ) {
					if(i == 3){
						System.out.print(" * ");
					}else{
						System.out.print("   ");
					}
				}
			}
			System.out.print("\n");
		}
	}
}