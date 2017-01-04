package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.validator.routines.EmailValidator;

public class ValidEmailImpl implements ConstraintValidator<ValidEmail, String> {
	private int min;
	private String message;

	@Override
	public void initialize(ValidEmail constraintAnnotation) {
		min = constraintAnnotation.min();
		message = constraintAnnotation.message();
	}

	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		boolean retVal = false;
		if ((email.length() >= min) && (email.indexOf("@") != -1)) {
			retVal = true;
		}

		if (email.indexOf("@") == 0 || email.indexOf("@") == email.length() - 1) {
			message = "\"@\" cannot cannot be the first and last character.";
			retVal = false;
		}

		return retVal;
	}

}
