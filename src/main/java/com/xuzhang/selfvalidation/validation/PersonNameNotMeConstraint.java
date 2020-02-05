package com.xuzhang.selfvalidation.validation;

import com.xuzhang.selfvalidation.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Robert 2020/2/5
 */
public class PersonNameNotMeConstraint implements ConstraintValidator<PersonNameNotMe, Object> {
    @Autowired
    private PersonService personService;

    @Override
    public void initialize(PersonNameNotMe constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
        return personService.checkPersonNameIsMe((String) value);
    }
}
