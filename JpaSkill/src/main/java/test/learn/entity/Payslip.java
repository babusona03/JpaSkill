package test.learn.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "PAYSLIP")
public class Payslip {
	@Id
	@TableGenerator(name = "Psp_Gen",table = "EMP_ID_GEN",pkColumnName = "GEN_NAME",valueColumnName = "GEN_VALUE",allocationSize = 1)
	@GeneratedValue(generator = "Psp_Gen")
	@Column(name = "PAYSLIP_ID")
	private Integer payslipId;
	@Column(name = "PAY_PERIOD")
	private LocalDate payPeriod;
	@Column(name = "PAY_DETAILS")
	private String payDetails;
	
	public Payslip() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getPayslipId() {
		return payslipId;
	}
	public void setPayslipId(Integer payslipId) {
		this.payslipId = payslipId;
	}
	public LocalDate getPayPeriod() {
		return payPeriod;
	}
	public void setPayPeriod(LocalDate payPeriod) {
		this.payPeriod = payPeriod;
	}
	public String getPayDetails() {
		return payDetails;
	}
	public void setPayDetails(String payDetails) {
		this.payDetails = payDetails;
	}
	
}
