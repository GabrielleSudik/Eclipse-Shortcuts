public class Person {

	private String name;
	private int id;

	// get getters and setters by
	// rt click -- source -- generate Gs and Ss:

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//make constructors with 
	//rt click -- source -- generate constructors:
	
	public Person(String name, int id) {
		super(); //this line can often be deleted
		this.name = name;
		this.id = id;
	}

	//add override methods by
	//rt click - source - create override methods
	//you don't know if override methods are the same each time
	//or if they vary based on properties or whatever
	
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
