import java.util.Scanner;


public class testDate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Date date=new Date();
		System.out.print("���� �Է� : ");
		date.year=sc.nextInt();
		System.out.print("�� �Է� : ");
		date.month=sc.nextInt();
		System.out.print("�� �Է� : ");
		date.day=sc.nextInt();
		date.printEastern();
		date.printWestern();
		
		

	}

}
