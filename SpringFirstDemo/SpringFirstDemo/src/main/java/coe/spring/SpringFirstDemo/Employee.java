package coe.spring.SpringFirstDemo;

public class Employee {
     private int emp_id;
     private String emp_Name;
     private String emp_Dept;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public String getEmp_Dept() {
		return emp_Dept;
	}
	public void setEmp_Dept(String emp_Dept) {
		this.emp_Dept = emp_Dept;
	}
	public Employee(int emp_id, String emp_Name, String emp_Dept) {
		super();
		this.emp_id = emp_id;
		this.emp_Name = emp_Name;
		this.emp_Dept = emp_Dept;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_Name=" + emp_Name + ", emp_Dept=" + emp_Dept + "]";
	}
     
     
     
}
