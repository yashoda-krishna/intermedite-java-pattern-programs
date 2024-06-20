package pack1;

public class S8 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=(i - 1);j++) {
				System.out.print(' ');
			}
			for(int j=1;j<=(6-i);j++) {
				System.out.print(j);
			}
			System.out.println();
		}/* 12345
 			 1234
  			  123
   			   12
    		    1
    		*/
		

	}

}
