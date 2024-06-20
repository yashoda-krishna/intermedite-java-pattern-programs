package pack1;

public class S5 {
	public static void main(String[] args) {
for(int i=0;i<=5;i++) {
			
			for(int j=0;j<=(5-i);j++) {
				
				System.out.print(' ');
			}
			
			for(int j=0;j<=i;j++) {
				char c =(char)('A'+i);
				
				System.out.print(c);
			}
			System.out.println();
		}
/*
      A
     BB
    CCC
   DDDD
  EEEEE
 FFFFFF
 */
		
	}

}
