import java.util.Scanner;


public class testDate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Date date=new Date();
		System.out.print("연도 입력 : ");
		date.year=sc.nextInt();
		System.out.print("월 입력 : ");
		date.month=sc.nextInt();
		System.out.print("일 입력 : ");
		date.day=sc.nextInt();
		date.printEastern();
		date.printWestern();
		
		

	}

}
