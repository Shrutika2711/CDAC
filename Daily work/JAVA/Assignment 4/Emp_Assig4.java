package CDAC;

import java.util.Scanner;

class Employee{
private	int empid;
private String name;
private float salary;

public void Accept() {
Scanner sc = new Scanner(System.in);

System.out.print("Employee id : " );
this.empid = sc.nextInt();

System.out.println("Employee name : " );
this.name = sc.next();

System.out.print("Employee salary :");
this.salary = sc.nextFloat();


}
public void printDetails(){
System.out.println(this.empid+ " "+this.name+ " " +this.salary);
}
}
class Emp_Assig4 {

public static void main(String[] args) {
Employee e = new Employee();
e.Accept();
e.printDetails();

}
}


