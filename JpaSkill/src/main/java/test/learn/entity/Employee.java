package test.learn.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	
	@TableGenerator(name = "Emp_Gen",table = "EMP_ID_GEN",pkColumnName = "GEN_NAME",valueColumnName = "GEN_VALUE",allocationSize = 1)
	@GeneratedValue(generator = "Emp_Gen")
//	create table EMP_ID_GEN (GEN_NAME varchar2(255 char) not null, GEN_VALUE number(19,0), primary key (GEN_NAME))
//	insert into EMP_ID_GEN(GEN_NAME, GEN_VALUE) values ('EMPLOYEE',0)
//	create table EMPLOYEE (EMP_ID number(10,0) not null, EMP_DEPT varchar2(255 char), EMP_NAME varchar2(255 char), primary key (EMP_ID))
	//the emp_id_gen table will have 2 cols,gen_name and Gen_value,will have a single row.EMPLOEE(the table name that needs the pk) and the pk value
	//unless the allocation size is explicitely specified,the default series of values will be kept in memory.Only after those values get exhausted,database would-
	// -be queried again for next values.last allocation value will be in gen_value column.
	//many entities can use the same table for pk generation.there would be one row for each table, (table name, last referenced vpkvalue) 

	@Id
	@Column(name = "EMP_ID")
	private Integer empId;
	@Column(name = "EMP_NAME")	
	private String name;
	@Column(name = "EMP_DEPT")
	private String dept;
	
	@ManyToOne
	@JoinColumn(name = "DEPT_ID")
	//this will add dept_id in employee table and the corresponding FK constrint		
	private Department department;
	
	@OneToOne
	@JoinColumn(name = "PAYSLIP_ID",unique = true)//needed to provide the uniquenessfeat,else,hibernate wont discriminate btn 121& n21,the generated DDL wont have uniqueness 
	private Payslip payslip;
	
	//@OneToOne(mappedBy = "employee")
	@OneToOne
	@JoinColumn(name = "PSP_ID",unique = true)
	private ParkingSpace parkingSpace;
	
	@ManyToMany(mappedBy = "employees")
	private Collection<Project> projects;
	
	
	public Employee() {
		super();	
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}	
}
