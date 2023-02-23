package part1;

public class EmployeeMain {

	public static void main(String[] args) {
		
		// Creating object 1
		Employee emp1 = new Employee();
		emp1.eid = 101;
		emp1.ename = "Jhon";
		emp1.job = "Test automation";
		emp1.sal = 80.00;
		emp1.deptno = 12;
		emp1.display();
		
		// Creating object 2
				Employee emp2 = new Employee();
				emp2.eid = 102;
				emp2.ename = "Safwen";
				emp2.job = "Test automation Senior";
				emp2.sal = 90.00;
				emp2.deptno = 12;
				emp2.display();

	}

}
