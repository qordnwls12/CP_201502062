import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount a=new BankAccount();
		BankAccount b=new BankAccount();
		
		System.out.println("계좌 1 정보 입력");
		System.out.print("계좌 번호 : ");
		a.accountNumber=sc.next();
		System.out.print("예금주 : ");
		a.owner=sc.next();
		System.out.print("초기 잔액 : ");
		a.balance=sc.nextInt();
		
		System.out.println();
		
		System.out.println("계좌 2 정보 입력");
		System.out.print("계좌 번호 : ");
		b.accountNumber=sc.next();
		System.out.print("예금주 : ");
		b.owner=sc.next();
		System.out.print("초기 잔액 : ");
		b.balance=sc.nextInt();
		
		System.out.println();
		
		System.out.println("계좌 1에서 게좌2로 송금할 금액 : ");
		int amount = sc.nextInt();
		a.sendAccount(amount,b);
		
		
		

	}
}
