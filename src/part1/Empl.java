package part1;

public class Empl {
	
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
	}

	public static void main(String[] args) {
		
		// Creating object 1
		Employee emp = new Employee();
		emp.eid = 101;
		emp.ename = "Jhon";
		emp.job = "Test automation";
		emp.sal = 80.00;
		emp.deptno = 12;
		emp.display();
		
		// Creating object 2
		Employee emp1 = new Employee();
		emp1.eid = 102;
		emp1.ename = "Safwen";
		emp1.job = "Test automation Senior";
		emp1.sal = 90.00;
		emp1.deptno = 121;
		emp1.display();
	}

}
