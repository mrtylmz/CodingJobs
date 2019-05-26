package us.codingjobs.app.business.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;

public class WebsiteOrCollectorEmailNonNullValidator implements ConstraintValidator<WebsiteOrCollectorEmailNonNull, Object> {

	 private String websiteField;
	 private String emailField;
	 
	 @Override
	public void initialize(WebsiteOrCollectorEmailNonNull constraintAnnotation) {
		this.websiteField=constraintAnnotation.website();
		this.emailField=constraintAnnotation.collectorEmail();
	}
	
	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		if(value==null)
			return false;
		BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(value);
		String websiteFieldValue = (String) beanWrapper.getPropertyValue(websiteField);
        String emailFieldValue = (String) beanWrapper.getPropertyValue(emailField);
        if(websiteFieldValue != null && !websiteFieldValue.isEmpty() 
        	||
        	emailFieldValue!=null && !emailFieldValue.isEmpty())
        {
        	return true;
        }
		return false;
	}

}
