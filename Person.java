
public class Person<PersonID, PhoneNum> {

	// a field to store the personID string
	public PersonID personID;

	// a field to store the phoneNum string
	public PhoneNum phoneNum;

	// a constructor to make an Person with the given personID and phoneNum
	public Person(PersonID personID, PhoneNum phoneNum) {
		this.personID = personID;
		this.phoneNum = phoneNum;
	}

	// method to get the ID of the person
	public PersonID getPersonID() {
		return personID;
	}

	// method to set the ID of the person
	public void setPersonId(PersonID personID) {
		this.personID = personID;
	}

	// method to get the phone number of the person
	public PhoneNum getPhoneNum() {
		return phoneNum;
	}

	// method to set the phone number of the person
	public void setPhoneNum(PhoneNum phoneNum) {
		this.phoneNum = phoneNum;
	}

	// It returns true or false whether the two objects of type Person(ID and NUM)
	// are the same or not
	// Worst case running time of this method: O(1)
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Person<?, ?> person = (Person<?, ?>) o;

		if (personID != null ? !personID.equals(person.personID) : person.personID != null)
			return false;
		if (phoneNum != null ? !phoneNum.equals(person.phoneNum) : person.phoneNum != null)
			return false;

		return true;
	}

}