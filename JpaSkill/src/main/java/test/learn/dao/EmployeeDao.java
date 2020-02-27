package test.learn.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import test.learn.entity.Employee;
import test.learn.service.EmployeeService;

@Named
@RequestScoped
public class EmployeeDao {
	@Inject
	private Employee employee;
	
	private List<Employee> empList;
	
	@Inject
	private EmployeeService employeeService;

	public Employee getEmployee() {
		return employee;
	}

	
	public List<Employee> getEmpList() {
		return empList;
	}


	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	public void createEmployee() {
		this.getEmployeeService().createEmployee(this.getEmployee());
		this.setEmployee(null);
	}
	
	public List<Employee> readEmployee(){
		this.setEmpList(this.getEmployeeService().readEmployees());
		return this.getEmpList();
	}
	@PostConstruct
	public void init() {
		employee= new Employee();//its here becoz injection is done by cotainer, on demand. we need it here, cant depend on container.
	}
}
