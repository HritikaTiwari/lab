package collectionEx;

public class AccountD {
	
	private String Ename;
	public AccountD(String ename, String accountType, int balance) {
		super();
		this.Ename = ename;
		this.accountType = accountType;
		this.Balance = balance;
	}
	public AccountD(String ename2, int i, String balance2) {
		// TODO Auto-generated constructor stub
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	private String accountType;
	private int Balance;
	@Override
	public String toString() {
		return "Ename=" + Ename + ", accountType=" + accountType + ", Balance=" + Balance ;
	}

}
