
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EventModel {
	
	
	@Id
	private int eventId;
	private String evaneName;
	private String applicantName;
	private String applicantAddress;
	private String applicantMobile;
	private String applicantEmail;
	private String eventAddress;
	private Date eventDate;
	private LocalDateTime eventTime;
	private int eventMenuId;
	private int addOnId;
	private String eventCost;
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEvaneName() {
		return evaneName;
	}
	public void setEvaneName(String evaneName) {
		this.evaneName = evaneName;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantAddress() {
		return applicantAddress;
	}
	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}
	public String getApplicantMobile() {
		return applicantMobile;
	}
	public void setApplicantMobile(String applicantMobile) {
		this.applicantMobile = applicantMobile;
	}
	public String getApplicantEmail() {
		return applicantEmail;
	}
	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}
	public String getEventAddress() {
		return eventAddress;
	}
	public void setEventAddress(String eventAddress) {
		this.eventAddress = eventAddress;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public LocalDateTime getEventTime() {
		return eventTime;
	}
	public void setEventTime(LocalDateTime eventTime) {
		this.eventTime = eventTime;
	}
	public int getEventMenuId() {
		return eventMenuId;
	}
	public void setEventMenuId(int eventMenuId) {
		this.eventMenuId = eventMenuId;
	}
	public int getAddOnId() {
		return addOnId;
	}
	public void setAddOnId(int addOnId) {
		this.addOnId = addOnId;
	}
	public String getEventCost() {
		return eventCost;
	}
	public void setEventCost(String eventCost) {
		this.eventCost = eventCost;
	}
	
	
	

}
