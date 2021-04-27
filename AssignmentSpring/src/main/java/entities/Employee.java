package entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
@Entity
//@Table(name = "emp_table")
@Table(name = "emp_table")
public class Employee {
	
	@Id //primary key
	@Column(name= "emp_id")
	private int id;
	
	//@Column(name = "emp_name")
	@Column(name = "emp_name")
	private String name;
	
	@Column(name = "emp_email")
	private String email;
	
	public Employee() {
		
	}

	public Employee(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}