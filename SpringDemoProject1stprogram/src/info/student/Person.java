package info.student;

public class Person
{
private Integer pid;
private Double salary;


public Person()
{
	System.out.println("object created");
}

public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}


public void display()
{
	System.out.println(pid);
	System.out.println(salary);
}
}
