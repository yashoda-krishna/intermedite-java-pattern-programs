package pack1;

public class S4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			
			for(int j=0;j<=(5-i);j++) {
				
				System.out.print(' ');
			}
			
			for(int j=0;j<=i;j++) {
				char c =(char)('A'+j);
				
				System.out.print(c);
			}
			System.out.println();
		}
		/*  A
     	   AB
    	  ABC
   		 ABCD
  		ABCDE
 	   ABCDEF
 
 */

	}

}
