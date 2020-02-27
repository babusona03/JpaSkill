package test.learn.producer;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

import test.learn.entity.Employee;
//import test.learn.entity.Teacher;


@RequestScoped			//Required, else Injection Point was not getting resolved. 
public class TeacherProducer {
	//@Produces	
	//private Teacher teacher;
	
	@Produces
	private Employee employee;
	/*@Produces
	@PersistenceContext
	EntityManager entityManager;*/
}
