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
        boolean result = userValidater.validateFirstName("Ch");
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
        boolean result = userValidater.validateLastName("Ch");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateEmail("abc.xyz@bl.co.in");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_WhenNotProper_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateEmail("vinayak@.com");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhone_WhenProper_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePhone("9172184715");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhone_WhenNotProper_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePhone("8180086639");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePassword("hcdgcF@#fg0");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_WhenNotProper_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePassword("vvsavh0cgc");
        Assert.assertEquals(false,result);
    }
}