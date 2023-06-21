class BankAccount {
    String accNumber;
    String ssNumber;
	int balance = 0;     // 예금 잔액
    
	// 개발자가 생성자 함수를 만들지 않으면 컴파일러가 기본적으로 생성한다.
	// 그렇게 만들어진 생성자 함수를 default 생성자라고 한다.
	// 생성자를 개발자가 한 개라도 만들면 컴파일러가 default를 생성하지 않는다.
	    BankAccount(){
	    	System.out.println("start!");
	    }
	    BankAccount(int balance){
//	    	 this는 두가지 용도 = 객체가 생성되었을 때 자기 자신을 뜻함.
//	    	 this 생성자 = 다른 생성자에서 생성자 호출 할때는 this();
	    	this.balance = balance;
	    	System.out.println("creator function start!");
	    }
  

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }    

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("잔액 : " + balance);
        return balance;
    }
    
    public void initAccount(String acc, String ss, int bal) {
    	accNumber = acc;
    	ssNumber = ss;
    	balance = bal;
    }
}

public class PassingRef {
	public static void check(BankAccount acc) {
		acc.checkMyBalance();
	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount(50000);
		
		account.checkMyBalance();
		// 1. null -> 참조형에만 넣을수 있음.
		// 2. 아무것도 가리키지 않는 상태
		// 3. 활용 : 참조형에 null로 지정하게 되면 JVM으로 하여금 할당된 메모리를 회수 하라는 의미
	}

}
