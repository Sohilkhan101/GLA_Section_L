package Lecture4;

public class PrimeNumbers {
	public static void main(String[] args) {
		int n=20;
		for(int num=2;num<=n;num++) {
			boolean flag= true;
			int  i =2;
			while(i<num) {
				if(num%i==0) {
					flag=false;
					break;
				}
				i++;
			}
			if(flag==true) {
				System.out.println(num);
			}
		}
	}

}
