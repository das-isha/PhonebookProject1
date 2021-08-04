import java.util.Iterator;
import java.util.LinkedList;

public class PhBLinkedList<Person> implements PhoneBook<Person> {

	// Creates a private field persons i.e.the type of linked list of persons
	private LinkedList<Person> persons = new LinkedList<>();
	
	//It returns the current size of the PhBLinkedList
	//Worst case running time of this method: O(1)
	@Override
	public int size() {
		return persons.size();
	}

	// It inserts a new person at the end of the PhBLinkedList,if index i is more than  the size of the PhBLinkedList
	// It inserts a new person at index i in the PhBLinkedList, if index i is less than the size of the PhBLinkedList
	///Worst case running time of this method: O(1)
	@Override
	public void insert(int i, Person person) {
		if (i >= persons.size()) { 
			persons.add(persons.size(), person); 
		} else {
			persons.add(i, person); 
		}
	}

	// It removes the ith  person in the PhBLinkedList,if index i is less than  the size of the PhBLinkedList
	//else it does nothing and returns null
	//Worst case running time of this method: O(1)
	@Override
	public Person remove(int i) {
		if(i < persons.size()) { 
			Person person = persons.remove(i); 
			return person;
		} else {
			return null;
		}
	}
	
	//It gets the ith  person in the PhBLinkedList,if index i is less than  the size of the PhBLinkedList
	//else it throws a new Exception that "The sequence has fewer than i components"
	//Worst case running time of this method: O(n)
	@Override
	public Person lookup(int i) throws Exception {
		if(i < persons.size()) { 

			Person person = persons.get(i); 
			return person; 

		} else {
			throw new Exception("The sequence has fewer than i components ");
			
		}
	}
	
	//Traverses through PhBLinkedList  
	//Worst case running time of this method: O(n)
	@Override
	public Iterator<Person> getIterator() {
		
		return persons.iterator();
	}

}