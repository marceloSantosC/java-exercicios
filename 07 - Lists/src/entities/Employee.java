package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
		return  String.format("%nName: %s %nId: %d %nSalary: U$ %.2f %n",name, id,salary);
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public void salaryIncrease (double quantity) {
		this.salary += (salary * (quantity/100));
	}

	

}
