package generics;

class Generic<G> {

	G obj;

	Generic(G obj) {
		this.obj = obj;
	}

	public G getObject() {
		return this.obj;
	}
}

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Generic<Integer> k = new Generic<Integer>(8);
		System.out.println(k.getObject());

		Generic<String> gr = new Generic<String>("Testing Generic");
		System.out.println(gr.getObject());

	}

}
