package validation;

import java.lang.annotation.Annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;

public class IsNotNullImpl implements ConstraintValidator<IsNotNull, String> {

	@Override
	public void initialize(IsNotNull constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean retVal = true;
		
		if (value == null || value == "") {
			retVal = false;
		}
		
		return retVal;
	}

}
