package lesson3.labs.prob1;


public class Person {

	private String name;
	Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		//if(!(aPerson instanceof Person)) return false;
		if(aPerson instanceof PersonWithJob)
		{
			PersonWithJob p = (PersonWithJob) aPerson;
			boolean isEqual = this.name.equals(p.getPerson().getName());
			return isEqual;
		}
		if(aPerson instanceof Person)
		{
			Person p = (Person)aPerson;
			boolean isEqual = this.name.equals(p.getName());
			return isEqual;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		//result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	
	public static void main(String[] args) {
		
	}

}
