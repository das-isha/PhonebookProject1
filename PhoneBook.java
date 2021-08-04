import java.util.Iterator;

//This is the Phonebook ADT interface of type Person 
public interface PhoneBook<Person>  {
	int size();
	void insert(int i,Person person);
	Person remove(int i);
	Person lookup(int i) throws Exception;
	Iterator<Person> getIterator();
}