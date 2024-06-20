package pack1;

public class S9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=6;i>=0;i--) {
			for(int j=0;j<=(i - 1);j++) {
				System.out.print(i);
			}
			for(int j=0;j<=(5-i);j++) {
				System.out.print(' ');
			}
			System.out.println();
		}
		 /*666666
		    55555 
			 4444  
			  333   
			   22    
			    1
*/

	}

}
