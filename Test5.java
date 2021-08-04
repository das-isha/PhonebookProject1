import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class Test5 {

	public Test5() {

		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("zero");
		list.add("one");
		list.add("two");

		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String m1 = itr.next();
			System.out.println(m1);
		}
		List<String> list1 = new ArrayList<String>();
		list1.add("three");
		list1.add("one");
		list1.add("four");
		Iterator<String> it2 = list1.iterator();
		while(it2.hasNext()) {

			String m2 = it2.next();
			System.out.println(m2);
		}
		itr = list.iterator();		
		
		while(itr.hasNext())
		{
			String m1 = itr.next();
			//   System.out.println(m1);
			//Iterator<String> it2 = list1.iterator();
			it2 = list1.iterator();
			
			while(it2.hasNext()) {

				String m2 = it2.next();
				// System.out.println(m2);
				if(m1.equals(m2))
					it2.remove();
			}
		}
		//it2 = list1.iterator();
		//  Iterator<String> it2 = list1.iterator();
		it2 = list1.iterator();
		while(it2.hasNext()) {
			String m1 = it2.next();
			System.out.println(m1);

		}
	}
}