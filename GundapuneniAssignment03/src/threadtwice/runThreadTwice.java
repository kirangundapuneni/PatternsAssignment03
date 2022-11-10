package threadtwice;

public class runThreadTwice extends Thread {

	public void run() {
		System.out.println("Thread started running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		runThreadTwice t1 = new runThreadTwice();
		t1.start();
		t1.start();

	}

}
