package test.learn.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PROJECT")
public class Project {
	@Id
	@Column(name = "PROJECT_ID")
	private Integer projectId;
	@Column(name = "PROJECT_NAME")	
	private String projectName;
	
	@ManyToMany
	@JoinTable(name = "EMP_PJ",joinColumns = @JoinColumn(name = "PROJECT_ID"),inverseJoinColumns = @JoinColumn(name="EMP_ID"))
	private Collection<Employee> employees;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
}
