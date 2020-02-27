//package test.learn.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "TEACHER")
//public class Teacher {
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tsqs")
//	@SequenceGenerator(name = "tsqs",sequenceName = "TEACHER_SEQ",allocationSize = 1)	
//	@Column(name = "TEACHER_ID")
//	private Integer teacherId;
//	
//	@Column(name = "TEACHER_NAME")
//	private String teacherName;
//	
//	@Column(name = "SUBJECT")
//	private String subject;
//	
//	public Teacher() {
//		super();
//		
//	}
//	public Integer getTeacherId() {
//		return teacherId;
//	}
//	public void setTeacherId(Integer teacherId) {
//		this.teacherId = teacherId;
//	}
//	public String getTeacherName() {
//		return teacherName;
//	}
//	public void setTeacherName(String teacherName) {
//		this.teacherName = teacherName;
//	}
//	public String getSubject() {
//		return subject;
//	}
//	public void setSubject(String subject) {
//		this.subject = subject;
//	} 
//
//}
