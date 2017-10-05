package lesson3.labs.prob1;

public class PersonWithJob {
	
	private Person person;
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		//super(n);
		person = new Person(n);
		salary = s;
	}
	
	public Person getPerson()
	{
		return person;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		//if(!(aPerson instanceof PersonWithJob)) return false;
		//PersonWithJob p = (PersonWithJob)aPerson;
		//if(!(aPerson instanceof Person)) return false;
		if(aPerson instanceof Person)
		{	
			Person p = (Person)aPerson;
			boolean isEqual = person.getName().equals(p.getName());// && this.getSalary()==p.getSalary();
			return isEqual;
		}
		
		if(aPerson instanceof PersonWithJob)
		{
			PersonWithJob p = (PersonWithJob)aPerson;
			boolean isEqual = person.getName().equals(p.person.getName()) && this.getSalary()==p.getSalary();;
			return isEqual;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		//Person p1 = new PersonWithJob("Joe", 30000);
		Person p1 = new Person("Joe");
		PersonWithJob p2 = new PersonWithJob("Joe", 30000);
		//PersonWithJob p3 = new PersonWithJob("Joe", 30000);
		//PersonWithJob p4 = new PersonWithJob("Joe", 50000);
		Person p5 = new Person("John");
		
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
		/*System.out.println("p2.equals(p3)? " + p2.equals(p3));
		System.out.println("p1.equals(p4)? " + p1.equals(p4));
		System.out.println("p2.equals(p4)? " + p2.equals(p4));
		System.out.println("p5.equals(p1)? " + p5.equals(p1));
		System.out.println("p5.equals(p2)? " + p5.equals(p2));*/
	}


}
