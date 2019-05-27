package us.codingjobs.app.model.request;

import javax.validation.constraints.Size;

public class CompanyRequestModel {
	
	@Size(min=3,max=100,message="Company name must be between 3 to 100 characters")
	private String companyName;
	private String companyWebsite;
	private String companyLogoPath; //http://webpath....
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyWebsite() {
		return companyWebsite;
	}
	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}
	public String getCompanyLogoPath() {
		return companyLogoPath;
	}
	public void setCompanyLogoPath(String companyLogoPath) {
		this.companyLogoPath = companyLogoPath;
	}
	@Override
	public String toString() {
		return getCompanyName()+"|"+getCompanyWebsite()+"|"+getCompanyLogoPath();
	}
	
	
	
}
