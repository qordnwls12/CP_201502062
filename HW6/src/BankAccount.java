
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
		return "잔액 : "+balance;
	}
	public int sendAccount(int amount,BankAccount otherAccount) {
		if(balance>=amount) {
		balance=balance-amount;
		otherAccount.balance=otherAccount.balance+amount;
		System.out.println("=============================");
		System.out.println("계좌 1");
		System.out.println("계좌번호 : "+accountNumber);
		System.out.println("예금주 : "+owner);
		System.out.println(tostring());
		System.out.println();
		System.out.println("계좌 2");
		System.out.println("계좌번호 : "+otherAccount.accountNumber);
		System.out.println("예금주 : "+otherAccount.owner);
		System.out.println(otherAccount.tostring());
		}
		else
			System.out.println("금액 초과!");
		return 0;
		
	}

}
