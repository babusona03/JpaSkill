package test.learn.model;

import java.time.LocalDate;

import javax.persistence.Embeddable;

@Embeddable
public class Qualification {
	private String qualificationName;
	private String institution;
	private LocalDate completionDate;
	
	
	public Qualification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getQualificationName() {
		return qualificationName;
	}
	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public LocalDate getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(LocalDate completionDate) {
		this.completionDate = completionDate;
	}
	

}
