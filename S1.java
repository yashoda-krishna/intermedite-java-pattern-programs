package pack1;

public class S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=(rows - i);j++) {
				System.out.print(' ');
			}
			for(int j=1; j<=i;j++) {
			System.out.print("*");
			}
			System.out.println();
		}

	}
	
/* 	    *
	   **
	  ***
	 ****
	*****
	                 */

}
