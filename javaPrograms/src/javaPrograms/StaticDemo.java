package javaPrograms;

class emp {
	// Static methods or objects doesn't require an object to call
	// Static variables can be declared only in static block
	int salary;
	String eid;
	static String ceo;

	static {
		ceo = "Ratan Tata";
	}

	public emp() {
		eid = "1011";
		salary = 2000;
	}

	public void show() {
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		emp mahesh = new emp();
		emp srinivas = new emp();
		srinivas.show();
		mahesh.show();
		System.out.println(emp.ceo);

	}

}
