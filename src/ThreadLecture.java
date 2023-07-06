import javax.swing.JOptionPane;

class ThreadInput extends Thread {
	public void run() {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
	}
}

class ThreadCount extends Thread {
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class Account {
	int balance = 1000;

	public synchronized void withdraw(int money) {
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			balance -= money;
		}
	}
}

class RunnableAccount implements Runnable {
	Account acc = new Account();

	@Override
	public void run() {
		while (acc.balance > 0) {

			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("::balance " + acc.balance);
		}
	}

}

public class ThreadLecture {

	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableAccount(), "First");
		Thread t2 = new Thread(new RunnableAccount(), "Second");

		t1.start();
		t2.start();
//		ThreadInput ti = new ThreadInput();
//		ThreadCount tc = new ThreadCount();
//		
//		ti.start();
//		tc.start();

		String name = Thread.currentThread().getName();
		// Multi Thread
//		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();

		Runnable th1 = new MyThread1();
		Thread th3 = new Thread(th1);
//		th3.start();
//		th1.start(); // run을 바로 실행시키면 안
//		th2.start();

//		System.out.println();

		// Single Thread
//		for (int i = 0; i < 300; i++) {
//			System.out.print("-");
//		}
//		for (int i = 0; i < 300; i++) {
//			System.out.print("|");
//		}

	}

}

//class MyThread1 extends Thread {
//	public void run() {
//		System.out.println(getName());
//		
//		for (int i = 0; i < 200; i++) {
//			System.out.print("S");
//		}
//	}
//}
class MyThread1 implements Runnable {

	public void run() {

		for (int i = 0; i < 200; i++) {
			System.out.print("S");
		}
	}
}

class MyThread2 extends Thread {
	public void run() {

		for (int i = 0; i < 200; i++) {
			System.out.print("V");
		}
	}
}