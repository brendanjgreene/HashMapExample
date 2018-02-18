
public class Account {
	private String firstName;
	private String lastName;
	private String accountNumber;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAcctNo() {
		return accountNumber;
	}
	public void setacctNo(String address) {
		this.accountNumber = address;
	}
	
	public void createAccount(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = address;
	}

}
