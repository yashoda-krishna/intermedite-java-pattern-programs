package pack1;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=6;i++) {
			char c =(char)('E'-i);
			for(int j=0;j<=(i-1);j++) {
				
				System.out.print(' ');
			}
			
			for(int j=0;j<=(5+1-i);j++) {
				System.out.print(c);
			}
			System.out.println();
		}/* EEEEEEE
		 	 DDDDDD
			  CCCCC
			   BBBB
		    	AAA
		     	 @@
		      	  ?
		      */

	}

}
