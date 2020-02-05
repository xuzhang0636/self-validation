package com.xuzhang.selfvalidation.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Robert 2020/2/5
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PersonNameNotMeConstraint.class)
public @interface PersonNameNotMe {
    String message();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
