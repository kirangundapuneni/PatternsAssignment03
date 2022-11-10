package methodsToCreateThread;

public class runnable implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runnable r = new runnable();
		Thread t = new Thread(r);
		t.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("Thread by implementing runnable interface");

	}

}
