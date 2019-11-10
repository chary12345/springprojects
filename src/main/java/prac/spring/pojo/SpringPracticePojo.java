package prac.spring.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class SpringPracticePojo {
	private String name;
	@Id
	private long mobile;
	private String city;
	private String country;
	@OneToOne
	@JoinColumn(name = "mailId")
	private SpringPracPojo sp1;
	
	public SpringPracPojo getSp1() {
		return sp1;
	}
	public void setSp1(SpringPracPojo sp1) {
		this.sp1 = sp1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
