import java.util.*;

public class HashMain{

	public static void main(String[] args) {
		//saying hello to myself
		System.out.println("Hello Brendan");
		// creating HashMap of Account class objects
		Map<Integer, Account> accountMap = new HashMap<Integer, Account>();
		//initiating account1
		Account account1 = new Account();
		//setting values of account 1
		account1.setFirstName("Brendan");
		account1.setLastName("Greene");
		account1.setAddress("Kildare");
		//adding account 1 to map
		accountMap.put(1, account1);
		//initiating account 2 and setting values in one step
		Account account2 = new Account(){{setFirstName("caroline");setLastName("Greene");setAddress("Kildare");}};
		//adding account 2 to Map
		accountMap.put(2, account2);
		//initiating account 3 and using createAccount to set values
		Account account3 = new Account() {{createAccount("Tess","Greene","Turnings");}};
		// adding account 3 to map
		accountMap.put(3, account3);
		// adding account 4 to map initiating and setting values all in one step
		accountMap.put(4, new Account() {{createAccount("Medb","Greene","Turnings");}});
		System.out.println("first name of account 1 "+account1.getFirstName());
		System.out.println("last name of account 2 "+account2.getLastName());
		System.out.println("names and address of account 2 + 3");
		System.out.println("first name: "+account2.getFirstName()+", Last Name: "+account2.getLastName()+", Address: "+account2.getAddress());
		System.out.println("first name: "+account3.getFirstName()+", Last Name: "+account3.getLastName()+", Address: "+account3.getAddress());
		System.out.println("iterating through map and printing all values");
		for (Map.Entry<Integer, Account> entry : accountMap.entrySet()) {
			System.out.println("******");
			System.out.println("Account "+ entry.getKey());
			System.out.println("Name: "+ entry.getValue().getFirstName()+" "+entry.getValue().getLastName());
		    System.out.println("Address: "+entry.getValue().getAddress());
		    System.out.println("------------------------");
		}
	}

}
