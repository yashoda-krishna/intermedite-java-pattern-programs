package pack1;

public class S7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=(i-1);j++) {
				
				System.out.print(' ');
			}
			
			for(int j=1;j<=(5+1-i);j++) {
				
				System.out.print(j);
			}
			System.out.println();
		}
		/*12345
 		   1234
  			123
   			 12
    		  1
    */

	}

}
