package lab4_2;

import java.util.Scanner;

public class alphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���ĺ��� �Է��Ͻÿ� : ");
		char a;
		a=sc.next().charAt(0);
		switch(a) {
		case 'a':  case 'e': case 'i': case 'o': case 'u':
			System.out.println("����");
			break;
		default:
		System.out.println("����");
		}

	}

}
