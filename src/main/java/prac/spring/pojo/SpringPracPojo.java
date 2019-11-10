package prac.spring.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class SpringPracPojo {
	

	@Id
	private String mailId;
	private char result;
	@OneToOne
	private SpringPracticePojo sp;
	
	public SpringPracticePojo getSp() {
		return sp;
	}
	public void setSp(SpringPracticePojo sp) {
		this.sp = sp;
	}
	
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public char getResult() {
		return result;
	}
	public void setResult(char result) {
		this.result = result;
	}
	
	

}
