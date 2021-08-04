import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		//added try-catch to handle generic exceptions 
		try {
			// Create new instances of Person (p1,p2,p3,p4,p5,p6,p7,p8)
			Person<String, String> p1 = new Person<>("Tom", "4121234567");
			Person<String, String> p2 = new Person<>("Jane", "8603334444");
			Person<String, String> p3 = new Person<>("Izzy", "8601113333");
			Person<String, String> p4 = new Person<>("Maya", "412338766");			
			Person<String, String> p5 = new Person<>("Isha", "8605678900");
			Person<String, String> p6 = new Person<>("Ted", "4567890000"); 										
			Person<String, String> p7 = new Person<>("Jeff", "8601113333");
			Person<String, String> p8 = new Person<>("Rosie", "2312424553");

			// Creates a new instance of PhBArrayList (phone book 1)
			PhBArrayList<Person> phBArrayList = new PhBArrayList<Person>();

			// Added persons (p1,p2,p3,p4,p5) to the phBArrayList of type arraylist in the index of 0,1,2,3,4
			// In an arraylist the execution time is minmized when inserted sequentially 0,1,2,3,4... 
			// as ArrayList in java shifts the elements to make room for the element at the insertion index
			// This means that inserting at the last index would be best so that no shifting is required 
			//(so in this case the next insert of a person would be at the 5th postion so to minimize the execution time)
			phBArrayList.insert(0, p1);
			phBArrayList.insert(1, p2);
			phBArrayList.insert(2, p3);
			phBArrayList.insert(3, p4);
			phBArrayList.insert(4, p5);

			// Creates a new instance of PhBLinkedList (phone book 2)
			PhBLinkedList<Person> phBLinkedList = new PhBLinkedList<Person>();

			//Added persons (p5,p6,p7,p8) to the phBLinkedList of type linkedlist in the index of 0,1,1,2,5
			//in the linkedlist the positions inserted at does not matter inorder to minimize the execution time
			//no matter where an element is inserted, no shifting is required that it why elements are inserted at random
			//& unsequential positions
			phBLinkedList.insert(0, p5); //person 5 (Isha) added again
			phBLinkedList.insert(1, p6);
			phBLinkedList.insert(1, p7);
			phBLinkedList.insert(2, p8);
			phBLinkedList.insert(5, p3);//person 3 (Izzy) added again


			System.out.println("======================================================================");
			System.out.println("Before removing the duplicates from Phonebook 2");
			System.out.println("\n");
			System.out.println("PhoneBook1:");

			// Traverses through phonebook1 (phBArrayList) which is of type array list using iterator and prints the personID & number
			//before removing the duplicates from Phonebook2 
			Iterator<Person> phBArrayListIt = phBArrayList.getIterator();
			while (phBArrayListIt.hasNext()) {
				Person p = phBArrayListIt.next();
				String s = String.format("PersonID: %s and Phone Number: %s", p.personID, p.phoneNum);
				System.out.println(s);
			}


			System.out.println("\n");
			System.out.println("PhoneBook2");

			//Traverses through phonebook2 (phBLinkedList) which is of type linked list using iterator and prints the personID & number
			//before removing the duplicates from Phonebook2 
			Iterator<Person> phBLinkedListIt = phBLinkedList.getIterator();
			while (phBLinkedListIt.hasNext()) {
				Person p = phBLinkedListIt.next();
				String s = String.format("PersonID: %s and Phone Number: %s", p.personID, p.phoneNum);
				System.out.println(s);
			}
			System.out.println("======================================================================");


			//This method removes duplicates between two phonebooks as person 5 (p5)-("Isha", "8605678900") and person 3 (p3)-("Izzy","8601113333")
			//are added in both phonebook 1(phBArrayList) and phonebook 2(phBLinkedList)
			//It removes the duplicates from Phonebook 2 (phBLinkedList)which is of type LinkedList 
			//It can pass any type of list in phonebook 1 and 2 and the method will remove the duplicates from the second list
			removeDuplicates(phBArrayList,phBLinkedList);

			System.out.println("After removing the duplicates from Phonebook2");
			System.out.println("\n");
			System.out.println("PhoneBook1: ");

			// Traverses through phonebook1 (phBArrayList) after removing the duplicates from phonebook 2(phBLinkedList)
			//and prints the unchanged phonebook 1
			phBArrayListIt = phBArrayList.getIterator();
			while (phBArrayListIt.hasNext()) {
				Person p = phBArrayListIt.next();
				String s = String.format("PersonID: %s and Phone Number: %s", p.personID, p.phoneNum);
				System.out.println(s);
			}

			System.out.println("\n");
			System.out.println("PhoneBook2: ");

			// Traverses through phonebook 2(phBLinkedList) and prints the new phonebook 2 with the duplicates removed
			phBLinkedListIt = phBLinkedList.getIterator();
			while (phBLinkedListIt.hasNext()) {
				Person p = phBLinkedListIt.next();
				String s = String.format("PersonID: %s and Phone Number: %s", p.personID, p.phoneNum);
				System.out.println(s);
			}
			System.out.println("======================================================================");
		} catch (Exception e) {
			System.out.println("Exception(s): " + e);
		}

	}

	// This method checks if there are common elements between the two and removes the duplicate persons in phonebook2 
	// Worst case running time of this method: O(n*m)--The n is the length of the phonebook1(pb1) list  
	// & the m is the length of the phonebook2(pb2) list
	public static void removeDuplicates(PhoneBook<Person> pb1, PhoneBook<Person> pb2) {
		//added try-catch to handle generic exceptions 
		try {
			//creates an iterator for phonebook1
			Iterator<Person> pb1Itr = pb1.getIterator();
			while (pb1Itr.hasNext()) {
				Person p1 = pb1Itr.next();
				//creates an iterator for phonebook2
				Iterator<Person> pb2Itr = pb2.getIterator();
				while (pb2Itr.hasNext()) {
					Person p2 = pb2Itr.next();
					if (p1.equals(p2))
						pb2Itr.remove();
				}
			}

		} catch (Exception e) {
			System.out.println("Exception(s) : " + e);
		}
	}

}
