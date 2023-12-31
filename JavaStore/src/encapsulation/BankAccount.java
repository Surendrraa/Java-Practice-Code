package encapsulation;

public class BankAccount {

private int accountNumber;
private String accountType;
private Double amount;
public int getAccountNumber() {
    return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}


	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.setAccountNumber(10435);
		account.setAccountType("savings Account");
		account.setAmount(1000.0);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getAccountType());
		System.out.println(account.getAmount());
	}
}
