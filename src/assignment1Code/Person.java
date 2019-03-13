package assignment1Code;

public class Person {
	// using enum to accepting only 'M' or 'F'
	public enum Gender{ 
		FEMALE('F'), 
		MALE('M');
		private char gender;
		
		private Gender(char gender) {
			this.gender = gender;
		}
		
		public char getGender() {
			return gender;
		}
		
		public void setGender(char gen) {
			this.gender = gen;
		}
	}
	String firstName;
	String lastName;
	//char gender;
	int telNum;
	
	//constructor WITHOUT parameter
	public Person() {};
	
	//constructor with parameters 
	public Person(String fName, String lName, /*char gen,*/ int tNum) {
		firstName = fName;
		lastName = lName;
		telNum = tNum;
	}
	
	//getter methods
	public String getFname() {
		return firstName;
	}
	
	public String getLname() {
		return lastName;
	}
	
	public int getTelNum() {
		return telNum;
	}
	
	//setter methods
	public void setFname(String fName) {
		firstName = fName;
	}
	
	public void setLname(String lName) {
		lastName = lName;
	}
	
	public void setTelNum(int tNum) {
		telNum = tNum;
	}
	
	//Adding method to calculate age
	public int calculateAge(int month, int day, int year) {
		return 2019 - year;
	}
	
	//Method to get fullName
	public String getFullName(String firstName, String lastName) {
		return firstName +" "+ lastName;
	}
	
	//method to display person details
	public void print() {
		System.out.println("First Name: " + getFname());
		System.out.println("Last Name: "+ getLname());
		//System.out.println("Gender: "+ getGender());
		System.out.println("Telephone Number: "+ getTelNum());	
	}

	//main method
	public static void main(String[] args) {
		//First Part (a-c)
		Person p1 = new Person("Rosa","Water",/*'F',*/1234567890); // creating an object with constructor with arguments
		Gender g1 = Gender.FEMALE;
		g1.setGender('F');
		p1.print();
		System.out.println("Gender: " + g1.getGender());
		
		System.out.println();
		System.out.println();
		
		//Second Part(d-f)
		Person p2 = new Person(); //creating new object for second part
		System.out.println(p2.getFullName("Vicky", "Newt") + " is " + p2.calculateAge(6, 27, 1994) + " years old!");		
	}
}
