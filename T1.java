package pack1;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=(i-1);j++) {
				
				System.out.print(' ');
			}
			
			for(int j=0;j<=(5+1-i);j++) {
				char c =(char)('A'+j);
				System.out.print(c);
			}
			System.out.println();
		}/*ABCDEFG
 			ABCDEF
  			 ABCDE
   			  ABCD
    		   ABC
     			AB
      			 A
      */

	}

}
