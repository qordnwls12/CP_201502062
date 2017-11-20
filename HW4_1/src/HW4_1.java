import java.util.Scanner;


public class HW4_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a;
		int m=0,n=0;
		System.out.print("문자열을 입력하시오. ");
		a=sc.nextLine();
		for(int i=0;i<a.length();i++)
		switch(a.charAt(i)){
		case 'a': case 'e': case 'i': case 'o': case 'u':
		case 'A': case 'E': case 'I': case 'O': case 'U':
		m++;
		break;
		case 'b': case 'c': case 'd': case 'f': case 'g':
		case 'h': case 'j': case 'k': case 'l': case 'm':
		case 'n': case 'p': case 'q': case 'r': case 's':
		case 't': case 'v': case 'w': case 'x': case 'y': case 'z':
		case 'B': case 'C': case 'D': case 'F': case 'G':
		case 'H': case 'J': case 'K': case 'L': case 'M':
		case 'N': case 'P': case 'Q': case 'R': case 'S':
		case 'T': case 'V': case 'W': case 'X': case 'Y': case 'Z':
		n++;
		}
		System.out.println("자음의 갯수 : "+n);
		System.out.println("모음의 갯수 : "+m);
	}

}
