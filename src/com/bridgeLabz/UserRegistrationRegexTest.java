package com.bridgeLabz;


import org.testng.annotations.Test;
import static org.junit.Assert.*;
import static org.testng.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationRegexTest {
    @Test
    void first_name_starts_with_Cap_has_minimum_three_characters() {
        UserRegistrationRegex firstNameObj = new UserRegistrationRegex();
        boolean result = firstNameObj.firstName("Gopal");
        assertTrue(result);

    }

    @Test
    void last_name_starts_with_Cap_has_minimum_three_characters() {
        UserRegistrationRegex lastNameObj = new UserRegistrationRegex();
        boolean result = lastNameObj.lastName("Das");
        assertTrue(result);
    }
    @Test
    void checking_Email_of_user() {
        UserRegistrationRegex emailObj = new UserRegistrationRegex();
        boolean result = emailObj.email("gopalkrdas.1997@gamil.com");
        assertTrue(result);
    }
    @Test
    void checking_mobile_number_should_ten_digit_number() {
        UserRegistrationRegex mobileNumberObj = new UserRegistrationRegex();
        boolean result = mobileNumberObj.mobileNumber("+91 8756676462");
        assertTrue(result);
    }
    @Test
    void checking_password_of_the_user_at_least_eight_character() {
        UserRegistrationRegex passwordObj = new UserRegistrationRegex();
        boolean result =  passwordObj.password("G@542das");
        assertTrue(result);
    }
}