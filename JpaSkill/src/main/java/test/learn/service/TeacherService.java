//package test.learn.service;
//
//import java.util.List;
//
//import javax.enterprise.context.RequestScoped;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//
//import test.learn.entity.Teacher;
//
//
//@Transactional
//@RequestScoped
//public class TeacherService {
//	
//		@PersistenceContext
//		EntityManager entityManager;
//		
//		public Teacher createTeacher(Teacher teacher) {
//			entityManager.persist(teacher);
//			return teacher;
//		}
//		
//		public List<Teacher> getTeachers(){
//			return entityManager.createQuery("select e from Teacher e", Teacher.class).getResultList();
//		}
//		
//		/*public Staff removeStaff(Staff staff) {
//			entityManager.remove(entityManager.contains(staff) ? staff : entityManager.merge(staff));
//			return null;
//		}*/
//}
