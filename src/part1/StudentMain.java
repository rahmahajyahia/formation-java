package part1;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu1 = new Student(101, "Marwa", 'A');
		//1 Assign values to variables by using reference variable
		stu1.sid = 101010;
		stu1.sname = "Ikram";
		stu1.grade = 'A';
		stu1.display();
		
		
		//2 Assign values to variable by using method
		stu1.getValues(101, "Fatma", 'A');
		stu1.display();
		
		
		//3 Assign values to variables by using constructor
		stu1.display();
	}

}
