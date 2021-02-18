package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateFirstName("Vinayak");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateFirstName("Vi");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateLastName("Chavan");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateLastName("ch");
        Assert.assertEquals(false,result);
    }
}