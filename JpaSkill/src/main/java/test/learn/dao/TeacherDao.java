//package test.learn.dao;
//
//import java.util.List;
//
//import javax.annotation.PostConstruct;
//import javax.enterprise.context.RequestScoped;
//import javax.inject.Inject;
//import javax.inject.Named;
//
//import test.learn.entity.Teacher;
//import test.learn.service.TeacherService;
//
//
//@Named
//@RequestScoped
//
//public class TeacherDao {
//	@Inject
//	private Teacher teacher;
//	private List<Teacher> teacherList;
//	@Inject
//	private TeacherService teacherService;
//	
//	public TeacherDao() {
//		super();		
//		this.setTeacherList(null);
//	}
//	public Teacher getTeacher() {		
//		return teacher;
//	}	
//	public void setTeacher(Teacher teacher) {		
//		this.teacher = teacher;
//	}
//	public TeacherService getTeacherService() {
//		return teacherService;
//	}
//	public void setTeacherService(TeacherService teacherService) {
//		this.teacherService = teacherService;
//	}
//	
//	public List<Teacher> getTeacherList() {
//		return teacherList;
//	}
//	public void setTeacherList(List<Teacher> teacherList) {
//		this.teacherList = teacherList;
//	}
//	@PostConstruct
//	public void init() {
//		teacher= new Teacher();
//	}
//	
//	public void createTeacher() {
//		System.out.println("Teacher Name : "+this.getTeacher().getTeacherName());
//		System.out.println("Teacher Subject: "+this.getTeacher().getSubject());
//		//this.getStaff().setStaffId(7);//dummy set value;to satisfy JPA as Pk cant be null		
//		this.getTeacherService().createTeacher(teacher);
//		this.setTeacher(null);
//	}	
//	public List<Teacher> readTeacher() {
//		//System.out.println("Staff Name : "+this.getStaff().getStaffName());
//		//System.out.println("Staff designation: "+this.getStaff().getDesignation());
//		this.setTeacherList(this.getTeacherService().getTeachers());
//		//this.getStaffService().createStaff(this.getStaff());
//		return this.getTeacherList();
//	}
//}
