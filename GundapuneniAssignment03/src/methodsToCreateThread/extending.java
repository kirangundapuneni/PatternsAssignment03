package methodsToCreateThread;

public class extending extends Thread {

	public void run() {
		System.out.println("Thread by extending thread class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extending ext = new extending();
		ext.start();
		ext.run(); // both work the same instead of start

	}

}
