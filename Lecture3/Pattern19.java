package Lecture3;

public class Pattern19 {
	public static void main(String[] args) {
		int n = 7;
		int nst1 = (n / 2);
		int nst2 = n / 2;
		int nsp=1;
		
		int row=0;
		
		while(row<n) {
			
			//star
			for(int i=0;i<nst1;i++) {
				System.out.print("* ");
			}
			
			//space
			for(int i=0;i<nsp;i++) {
				System.out.print("  ");
			}
			
			//star
		
			for(int i=0;i<nst2;i++) {
				System.out.print("* ");
			}
			
			if(row<n/2) {
				nst1--;
				nst2--;
				nsp+=2;
			}else {
				nst1++;
				nst2++;
				nsp-=2;
			}
			
			row++;
			System.out.println();
		}
		
		
	}
}
