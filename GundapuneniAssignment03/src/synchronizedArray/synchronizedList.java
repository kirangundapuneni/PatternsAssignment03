package synchronizedArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class synchronizedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list =
		           Collections.synchronizedList(new ArrayList<String>());
		list.add("testing");
		list.add("Array");
		list.add("with synchronization");
		
		synchronized (list) {
			
			Iterator t = list.iterator();
			
			while (t.hasNext()) {
				System.out.println(t.next());
				
			}
			
		}

	}

}
