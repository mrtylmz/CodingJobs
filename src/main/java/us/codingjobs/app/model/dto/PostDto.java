package us.codingjobs.app.model.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;

import us.codingjobs.app.business.validation.WebsiteOrCollectorEmailNonNull;
import us.codingjobs.app.model.request.AddressRequestModel;
import us.codingjobs.app.model.request.CompanyRequestModel;

//(applywebsite or collectorwebsite) should be nonNull
@WebsiteOrCollectorEmailNonNull(website="applyWebsite",collectorEmail="collectorEmail")
public class PostDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String postId;
	private String email;
	private String position;
	private String jobDetails;
	private String jobType;
	private List<String> coreTechnologies;
	private String applyWebsite;
	private String collectorEmail;
	private CompanyRequestModel companyInfo;
	private AddressRequestModel address;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
