package test.learn.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;



@Entity
@Table(name="DEPARTMENT")
public class Department {
	@Id
	@TableGenerator(name = "Dep_Gen",table = "EMP_ID_GEN",pkColumnName = "GEN_NAME",valueColumnName = "GEN_VALUE",allocationSize = 1)
	@GeneratedValue(generator = "Dep_Gen")
	@Column(name="DEPT_ID")
	private Integer deptId;
	@Column(name = "DEPT_NAME")
	private String deptName;
	
	//@OneToMany(mappedBy = "department")
	@OneToMany
	private List<Employee> employee;
	

	public List<Employee> getEmployee() {
		return employee;
	}


	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}


	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Integer getDeptId() {
		return deptId;
	}


	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}


	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}
