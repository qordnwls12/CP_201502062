import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount a=new BankAccount();
		BankAccount b=new BankAccount();
		
		System.out.println("���� 1 ���� �Է�");
		System.out.print("���� ��ȣ : ");
		a.accountNumber=sc.next();
		System.out.print("������ : ");
		a.owner=sc.next();
		System.out.print("�ʱ� �ܾ� : ");
		a.balance=sc.nextInt();
		
		System.out.println();
		
		System.out.println("���� 2 ���� �Է�");
		System.out.print("���� ��ȣ : ");
		b.accountNumber=sc.next();
		System.out.print("������ : ");
		b.owner=sc.next();
		System.out.print("�ʱ� �ܾ� : ");
		b.balance=sc.nextInt();
		
		System.out.println();
		
		System.out.println("���� 1���� ����2�� �۱��� �ݾ� : ");
		int amount = sc.nextInt();
		a.sendAccount(amount,b);
		
		
		

	}
}
