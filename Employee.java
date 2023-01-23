package javatraining1;

import java.util.Objects;

public class Employee {

	private int empid;
	private double salary;
	private String ename;
	
	public Employee(){
		
	}
	
	public Employee(int empid,double salary,String ename){
		this.empid = empid;
		this.salary = salary;
		this.ename = ename;
		
	}
	

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", ename=" + ename + "]";
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empid, ename, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid && Objects.equals(ename, other.ename)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	
	
}