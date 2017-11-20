package hw03_1;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		int m=0;
		for(int i=1;i<=7;i++) {
			int a = (int)(Math.random()*10)+1;
			String b;
			b=sc.nextLine();
			if(b.equals("¹ÙÀ§")) {
				if(a==1||a==4||a==7) {
					System.out.println("ÀÌ°å´Ù!");
					n++;
				}
				else if(a==2||a==5||a==8)
					System.out.println("ºñ°å´Ù!");
				else {
					System.out.println("Á³´Ù!");
					m++;
				}
			}
			if(b.equals("°¡À§")) {
				if(a==1||a==4||a==7)
					System.out.println("ºñ°å´Ù!");
				else if(a==2||a==5||a==8) {
					System.out.println("Á³´Ù!");
					m++;
				}
				else {
					System.out.println("ÀÌ°å´Ù!");
					n++;
				}
			}
			if(b.equals("º¸")) {
				if(a==1||a==4||a==7) {
					System.out.println("Á³´Ù!");
					m++;
				}
				else if(a==2||a==5||a==8) {
					System.out.println("ÀÌ°å´Ù!");
					n++;
				}
				else
					System.out.println("ºñ°å´Ù!");
			}
			System.out.println("stage "+i+" > user : "+n+"½Â vs computer : "+m+"½Â");
		}
		if(n>m)
			System.out.println("user");
		else if(m>n)
			System.out.println("computer");
		else
			System.out.println("draw");

	}

}
