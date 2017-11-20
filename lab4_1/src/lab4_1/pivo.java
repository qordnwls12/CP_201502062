package lab4_1;

public class pivo {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=10;i++) {
			c=a+b;
			if(i==1)
				System.out.print(a+" ");
			else if(i==2)
				System.out.print(b+" ");
			else {
				System.out.print(c+" ");
				a=b;
				b=c;
			}

		}

	}
}