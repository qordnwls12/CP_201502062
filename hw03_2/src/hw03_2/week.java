package hw03_2;

import java.util.Scanner;

public class week {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,d;
		d=0;
		System.out.print("년 : ");
		a=sc.nextInt();
		System.out.print("월 : ");
		b=sc.nextInt();
		System.out.print("일 : ");
		c=sc.nextInt();

		for(int i=1900;i<a;i++) {
			if((i%4==0&&i%100!=0)||i%400==0)
				d=d+366;
			else
				d=d+365;
		}
		//전년도까지의 일수 합
		for(int j=1;j<b;j++)
			switch(j) {
			case 4: case 6: case 9: case 11:
				d=d+30;
				break;
			case 2:
				if((a%4==0&&a%100!=0)||a%400==0)
					d=d+29;
				else
					d=d+28;
				break;
			default:
				d=d+31;
			}
		//전월 까지의 일수 합
		d=d+c;
		//현재 일수 합
		switch(d%7) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		case 0:
			System.out.println("일요일");
			break;
		}

	}

}
