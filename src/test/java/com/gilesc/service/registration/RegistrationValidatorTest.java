package com.gilesc.service.registration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RegistrationValidatorTest {
    private RegistrationFormValidator validator;

    @Before
    public void setUp() throws Exception {
        this.validator = new RegistrationFormValidator();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void it_lets_us_validate_input() {
//        Assert.assertTrue(this.validator.validate());
    }
}
