package us.codingjobs.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name="posts")
public class PostEntity implements Serializable {

	private static final long serialVersionUID = -5400186814934480013L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name="post_id",nullable=false)
	private String postId;
	
	@Column(name="email_id",nullable=false,length=50)
	private String emailId;
	@Column(name="position",nullable=false,length=100)
	private String position;
	
	@Column(name="job_details",nullable=false)
	private String jobDetails;
	
	@Column(name="job_type",nullable=false)
	private String jobType;
	
	//converted from list.Seperated with comma
	@Column(name="core_technologies",nullable=false)
	private String coreTechnologies;
	
	@Column(name="apply_website",length=100)
	private String applyWebsite;
	@Column(name="collector_email",length=50)
	private String collectorEmail;
	
	@Column(name="company_info",length=300)
	private String companyInfo;
	
	@Column(name="state",length=50)
	private String state;
	
	@Column(name="city",length=50)
	private String city;
	
	@Column(name="zip_code",length=10)
	private String zipCode;
	
	
	private boolean isActive=false;
	
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_dt", updatable=false)
	private Date createdDt;
	
	@CreatedDate  // This field is not nullable, so it needs to be populated on insert
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updated_dt")
	private Date lastUpdtDt;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getJobDetails() {
		return jobDetails;
	}

	public void setJobDetails(String jobDetails) {
		this.jobDetails = jobDetails;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getCoreTechnologies() {
		return coreTechnologies;
	}

	public void setCoreTechnologies(String coreTechnologies) {
		this.coreTechnologies = coreTechnologies;
	}

	public String getApplyWebsite() {
		return applyWebsite;
	}

	public void setApplyWebsite(String applyWebsite) {
		this.applyWebsite = applyWebsite;
	}

	public String getCollectorEmail() {
		return collectorEmail;
	}

	public void setCollectorEmail(String collectorEmail) {
		this.collectorEmail = collectorEmail;
	}

	public String getCompanyInfo() {
		return companyInfo;
	}

	public void setCompanyInfo(String companyInfo) {
		this.companyInfo = companyInfo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public Date getLastUpdtDt() {
		return lastUpdtDt;
	}

	public void setLastUpdtDt(Date lastUpdtDt) {
		this.lastUpdtDt = lastUpdtDt;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	
}
