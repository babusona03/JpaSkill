package test.learn.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import test.learn.entity.Employee;

@Transactional
@RequestScoped
public class EmployeeService {
	@PersistenceContext
	EntityManager entityManager;
	
	public Employee createEmployee(Employee employee) {
		entityManager.persist(employee);
		return employee;
	}
	public List<Employee> readEmployees(){
		return entityManager.createQuery("select E from Employee e",Employee.class).getResultList();		
	}
}
