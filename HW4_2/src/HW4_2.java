import java.util.Scanner;


public class HW4_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a;
		System.out.print("입력 : ");
		a=sc.nextLine();
		int[] b=new int[a.length()];
		char [] c=new char[a.length()];
		System.out.print("출력 : ");
		for(int i=0;i<a.length();i++){
			b[i]=(int)a.charAt(i);
			c[i]=a.charAt(i);
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			System.out.print((char)(b[i]-32));
			else if(c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
				System.out.print((char)(b[i]+32));
			else
				System.out.print((char)b[i]);
		
		}
	}

}
