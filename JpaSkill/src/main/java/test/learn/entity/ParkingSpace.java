package test.learn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PARKING_SPACE")
public class ParkingSpace {
	@Id
	@Column(name = "PSP_ID")
	private Integer pspId;
	
	@OneToOne
	@JoinColumn(name = "EMP_ID",unique = true)
	private Employee employee; 
	
}
