package studentski.servis.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	private Student student;

	private String reason_for_payment;
	
	private String receiver;
	
	private double amount;
	
	private String recieversAccount;
	
	private int model;
	
	private String pozivNaBroj;
	
	private Date paymentDate;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getReason_for_payment() {
		return reason_for_payment;
	}

	public void setReason_for_payment(String reason_for_payment) {
		this.reason_for_payment = reason_for_payment;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getRecieversAccount() {
		return recieversAccount;
	}

	public void setRecieversAccount(String recieversAccount) {
		this.recieversAccount = recieversAccount;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int modela) {
		this.model = modela;
	}

	public String getPozivNaBroj() {
		return pozivNaBroj;
	}

	public void setPozivNaBroj(String pozivNaBroj) {
		this.pozivNaBroj = pozivNaBroj;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Payment(Long id, Student student, String reason_for_payment, String receiver, double amount,
			String recieversAccount, int modela, String pozivNaBroj, Date paymentDate) {
		super();
		this.id = id;
		this.student = student;
		this.reason_for_payment = reason_for_payment;
		this.receiver = receiver;
		this.amount = amount;
		this.recieversAccount = recieversAccount;
		this.model = modela;
		this.pozivNaBroj = pozivNaBroj;
		this.paymentDate = paymentDate;
	}

	public Payment() {
		super();
	}
}
