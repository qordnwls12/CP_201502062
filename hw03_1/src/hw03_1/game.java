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
			if(b.equals("����")) {
				if(a==1||a==4||a==7) {
					System.out.println("�̰��!");
					n++;
				}
				else if(a==2||a==5||a==8)
					System.out.println("����!");
				else {
					System.out.println("����!");
					m++;
				}
			}
			if(b.equals("����")) {
				if(a==1||a==4||a==7)
					System.out.println("����!");
				else if(a==2||a==5||a==8) {
					System.out.println("����!");
					m++;
				}
				else {
					System.out.println("�̰��!");
					n++;
				}
			}
			if(b.equals("��")) {
				if(a==1||a==4||a==7) {
					System.out.println("����!");
					m++;
				}
				else if(a==2||a==5||a==8) {
					System.out.println("�̰��!");
					n++;
				}
				else
					System.out.println("����!");
			}
			System.out.println("stage "+i+" > user : "+n+"�� vs computer : "+m+"��");
		}
		if(n>m)
			System.out.println("user");
		else if(m>n)
			System.out.println("computer");
		else
			System.out.println("draw");

	}

}
