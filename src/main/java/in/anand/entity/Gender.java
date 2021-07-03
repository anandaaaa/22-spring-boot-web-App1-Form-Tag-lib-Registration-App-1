package in.anand.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gender {
	
	@Id
	@Column(name="GENDER_ID")
	private Integer genderID;
	@Column(name="GENDER_TYPE")
	private String genderType;
	public Integer getGenderID() {
		return genderID;
	}
	public void setGenderID(Integer genderID) {
		this.genderID = genderID;
	}
	public String getGenderType() {
		return genderType;
	}
	public void setGenderType(String genderType) {
		this.genderType = genderType;
	}
	
	
}
