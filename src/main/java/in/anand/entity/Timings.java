package in.anand.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Timings {
	
	@Id
	@Column(name="TIMING_ID")
	private Integer timingID;
	@Column(name="TIMING_NAME")
	private String timingName;
	public Integer getTimingID() {
		return timingID;
	}
	public void setTimingID(Integer timingID) {
		this.timingID = timingID;
	}
	public String getTimingName() {
		return timingName;
	}
	public void setTimingName(String timingName) {
		this.timingName = timingName;
	}
	
	

}
