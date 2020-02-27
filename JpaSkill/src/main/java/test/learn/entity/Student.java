//package test.learn.entity;
//
//import java.util.Collection;
//import java.util.List;
//import java.util.Map;
//
//import javax.persistence.CollectionTable;
//import javax.persistence.Column;
//import javax.persistence.ElementCollection;
//import javax.persistence.Embedded;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.MapKeyColumn;
//import javax.persistence.MapKeyEnumerated;
//import javax.persistence.OrderColumn;
//import javax.persistence.Table;
//
//import test.learn.model.Address;
//import test.learn.model.PhoneType;
//import test.learn.model.Qualification;
//
//@Entity
//@Table(name = "STUDENT")
//public class Student {
//	@Id
//	@Column(name = "STUDENT_ID")
//	private Integer studentId;
//	@Column(name = "STUDENT_NAME")
//	private String Name;
//	@Column(name = "STUDENT_STREAM")
//	private String Stream;
//	@Embedded
//	private Address address;	
//	/*
//	 * Heres the sql
//	 * create table STUDENT (STUDENT_ID number(10,0) not null, STUDENT_NAME varchar2(255 char), 
//	 * STUDENT_STREAM varchar2(255 char), city varchar2(255 char), houseNo number(10,0), 
//	 * streetName varchar2(255 char), primary key (STUDENT_ID))
//	 */
//	@ElementCollection
//	@CollectionTable(name = "QUALIFICATION",joinColumns = @JoinColumn(name="STUDENT_ID"))	
//	@OrderColumn(name = "QUAL_POS")
//	private List<Qualification> qualifications;
//	/*
//	 * Heres the sql
//	 * create table Student_qualifications (Student_STUDENT_ID number(10,0) not null, 
//	 * completionDate date, institution varchar2(255 char), qualificationName varchar2(255 char));
//	 * alter table Student_qualifications add constraint FKi5aqrlx82n052el5s59qxeg8l foreign key (Student_STUDENT_ID) references STUDENT
//	 * 
//	 * after adding @CollectionTable
//	 * create table QUALIFICATION (STUDENT_ID number(10,0) not null, completionDate date, institution varchar2(255 char), qualificationName varchar2(255 char))
//	 * 
//	 * After Adding@OrderColumn
//	 * create table QUALIFICATION (STUDENT_ID number(10,0) not null, completionDate date, institution varchar2(255 char), qualificationName varchar2(255 char), 
//	 * qualifications_ORDER number(10,0) not null, primary key (STUDENT_ID, qualifications_ORDER))
//	 * 
//	 * create table QUALIFICATION (STUDENT_ID number(10,0) not null, completionDate date, institution varchar2(255 char), qualificationName varchar2(255 char), 
//	 * QUAL_POS number(10,0) not null, primary key (STUDENT_ID, QUAL_POS))
//	 * */
//	
//	@ElementCollection
//	@CollectionTable(name = "STUDENT_PHONE_NOS")
//	@MapKeyColumn(name = "PHONE_TYPE")
//	@Column(name = "PHONE_NO")
//	//private Map<String, String> phoneNumbers;
//	@MapKeyEnumerated(EnumType.STRING)
//	private Map<PhoneType, String> phoneNumbers;
//	/*
//	 * create table STUDENT (STUDENT_ID number(10,0) not null, STUDENT_NAME varchar2(255 char), STUDENT_STREAM varchar2(255 char), city varchar2(255 char), 
//	 * houseNo number(10,0), streetName varchar2(255 char), primary key (STUDENT_ID))
//	 * create table Student_phoneNumbers (Student_STUDENT_ID number(10,0) not null, phoneNumbers varchar2(255 char), phoneNumbers_KEY varchar2(255 char) not null,
//	 * primary key (Student_STUDENT_ID, phoneNumbers_KEY))
//	 * 
//	 * create table STUDENT (STUDENT_ID number(10,0) not null, STUDENT_NAME varchar2(255 char), STUDENT_STREAM varchar2(255 char), city varchar2(255 char),
//	 * houseNo number(10,0), streetName varchar2(255 char), primary key (STUDENT_ID))
//	 * create table STUDENT_PHONE_NOS (Student_STUDENT_ID number(10,0) not null, PHONE_NO varchar2(255 char), PHONE_TYPE varchar2(255 char) not null, 
//	 * primary key (Student_STUDENT_ID, PHONE_TYPE))
//	 * alter table STUDENT_PHONE_NOS add constraint FKb6rktejckkwrmfu600sd6x4on foreign key (Student_STUDENT_ID) references STUDENT
//	 * 
//	 * create table STUDENT_PHONE_NOS (Student_STUDENT_ID number(10,0) not null, PHONE_NO varchar2(255 char), PHONE_TYPE number(10,0) not null, primary key (Student_STUDENT_ID, PHONE_TYPE))
//	 * create table STUDENT_PHONE_NOS (Student_STUDENT_ID number(10,0) not null, PHONE_NO varchar2(255 char), PHONE_TYPE varchar2(255 char) not null, primary key (Student_STUDENT_ID, PHONE_TYPE))
//	 * */
//	
//	
//	public Map<PhoneType, String> getPhoneNumbers() {
//		return phoneNumbers;
//	}
//	public void setPhoneNumbers(Map<PhoneType, String> phoneNumbers) {
//		this.phoneNumbers = phoneNumbers;
//	}
//	public void setQualifications(List<Qualification> qualifications) {
//		this.qualifications = qualifications;
//	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	
//	public Collection<Qualification> getQualifications() {
//		return qualifications;
//	}
//	
//	public Integer getStudentId() {
//		return studentId;
//	}
//	public void setStudentId(Integer studentId) {
//		this.studentId = studentId;
//	}
//	public String getName() {
//		return Name;
//	}
//	public void setName(String name) {
//		Name = name;
//	}
//	public String getStream() {
//		return Stream;
//	}
//	public void setStream(String stream) {
//		Stream = stream;
//	}
//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//}
