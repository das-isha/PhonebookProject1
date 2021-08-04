import java.util.ArrayList;
import java.util.Iterator;

public class PhBArrayList<Person> implements PhoneBook<Person> {


	private ArrayList<Person> persons = new ArrayList<>();
	
	//It returns the current size of the PhBArrayList
	//Worst Case running time of this method: O(1)
	@Override
	public int size() {
		return persons.size(); 
	}

	// It inserts a new person at the end of the PhBArrayList,if index i is more than  the size of the PhBArrayList
	// It inserts a new person at index i in the PhBArrayList, if index i is less than the size of the PhBArrayList
	//Worst case running time of this method: O(n) 
	@Override
	public void insert(int i, Person person) {
		int size = persons.size(); 

		if (i > size) {
			persons.add(size, person); 
		} else {
			persons.add(i, person); 
		}
	}

	//It removes the ith  person in the PhBArrayList,if index i is less than  the size of the PhBArrayList
	//else it does nothing and returns null
	//Worst case running time of this method: O(n)
	@Override
	public Person remove(int i) {
		if(i < persons.size()) { 
			Person person = persons.remove(i); 
			return person; 
		} else {
			return null; 
		}

	}
	
	//It gets the ith  person in the PhBArrayList,if index i is less than  the size of the PhBArrayList
	//else it throws a new Exception that "The sequence has fewer than i components"
	//Worst case running time of this method: O(1)
	@Override
	public Person lookup(int i) throws Exception {
		if(i < persons.size()) { 
			Person person = persons.get(i); 
			return person; 
		} else {
			throw new Exception("The sequence has fewer than i components ");
		}

	}
	
	//Traverses through PhBArrayList   
	//Worst case running time of this method: O(n)
	@Override
	public Iterator<Person> getIterator() {
		return persons.iterator();
	}

}