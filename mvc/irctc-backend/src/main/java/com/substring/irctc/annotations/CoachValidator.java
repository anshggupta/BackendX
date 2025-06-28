package com.substring.irctc.annotations;

// Importing Jakarta Bean Validation APIs used to create custom constraint validators
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

// 'CoachValidator' implements the ConstraintValidator interface for a custom annotation @ValidCoach
// First type parameter: The annotation class being validated (ValidCoach)
// Second type parameter: The type of data it is applied to (Integer)
public class CoachValidator implements ConstraintValidator<ValidCoach, Integer> {

    // This is the core method that runs when validation occurs.
    // It returns true if the value is valid, false otherwise.
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {

        System.out.println("validating coach numbers");

        // Business logic: Coach number is valid only if it's greater than 100
        if (value > 100) {
            return true; // valid coach number
        }

        // If coach number is 100 or less, it's invalid
        return false;
    }
}
