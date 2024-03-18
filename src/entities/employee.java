package entities;

import java.util.Objects;

public class employee {

	private Integer id;
	private String name;
	private Double salary;
	
	public employee() {
	}

	public employee(Integer id, String name, Double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
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
	
	public void increseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Id: " + id + ", Name: " + name + ", Salary: " + String.format("%.2f", salary);
	}	
}