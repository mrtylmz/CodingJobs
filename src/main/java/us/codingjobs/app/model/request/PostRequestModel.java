package us.codingjobs.app.model.request;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

public class PostRequestModel {

	//this should be corporate email address. Not public email provider
	@Email
	private String emailId;
	
	//Sr. Java Developer etc...
	@Size(min=5,max=100,message="Position must be between 5 to 100 characters")
	private String position;
	
	@Size(min=100,message="Job Details must be more than 100 characters")
	private String jobDetails;
	
	//fulltime, contractor, remote
	@Size(min=2,message="Job Type must be more than 2 characters")
	private String jobType;
	
	//java, spring, selenium, nodejs, hibernate
	@NotEmpty
	@Size(max=12,message="Core Techonologies must be maximum 12")
	private List<String> coreTechnologies;
	
	//job post's webpage, if exists
	@URL
	private String applyWebsite;
	
	//all applications should go to this email
	@Email
	private String collectorEmail;
	
	private CompanyRequestModel companyInfo;
	private AddressRequestModel address;
	
	
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
	public List<String> getCoreTechnologies() {
		return coreTechnologies;
	}
	public void setCoreTechnologies(List<String> coreTechnologies) {
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
	public CompanyRequestModel getCompanyInfo() {
		return companyInfo;
	}
	public void setCompanyInfo(CompanyRequestModel companyInfo) {
		this.companyInfo = companyInfo;
	}
	public AddressRequestModel getAddress() {
		return address;
	}
	public void setAddress(AddressRequestModel address) {
		this.address = address;
	}
	
	
}
