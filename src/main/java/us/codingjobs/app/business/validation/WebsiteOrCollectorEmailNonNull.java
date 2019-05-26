package us.codingjobs.app.business.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=WebsiteOrCollectorEmailNonNullValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WebsiteOrCollectorEmailNonNull {
	//check the website,field1
	public String website();
	//submitting email,field2
	public String collectorEmail();
	//default error message
	public String message() default "Application Form website or Email Address should be Non Null";

	public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
