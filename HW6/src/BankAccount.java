
public class BankAccount {
	String accountNumber;
	String owner;
	int balance;
	void deposit(int amount) {
		balance=balance+amount;
	}
	void withdraw(int amount) {
		balance=balance-amount;
	}
	public String tostring() {
		return "�ܾ� : "+balance;
	}
	public int sendAccount(int amount,BankAccount otherAccount) {
		if(balance>=amount) {
		balance=balance-amount;
		otherAccount.balance=otherAccount.balance+amount;
		System.out.println("=============================");
		System.out.println("���� 1");
		System.out.println("���¹�ȣ : "+accountNumber);
		System.out.println("������ : "+owner);
		System.out.println(tostring());
		System.out.println();
		System.out.println("���� 2");
		System.out.println("���¹�ȣ : "+otherAccount.accountNumber);
		System.out.println("������ : "+otherAccount.owner);
		System.out.println(otherAccount.tostring());
		}
		else
			System.out.println("�ݾ� �ʰ�!");
		return 0;
		
	}

}
