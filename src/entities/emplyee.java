package entities;

import java.util.Objects;

public class emplyee {

	private Integer id;
	private String name;
	private Double salary;
	
	public emplyee() {
	}

	public emplyee(Integer id, String name, Double salary) {
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
		emplyee other = (emplyee) obj;
		return Objects.equals(id, other.id);
	}
}
