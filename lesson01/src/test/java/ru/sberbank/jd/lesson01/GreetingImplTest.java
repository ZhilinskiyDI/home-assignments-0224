
package ru.sberbank.jd.lesson01;

import org.junit.Assert;
import org.junit.Test;

public class GreetingImplTest {
    static GreetingImpl greeting = new GreetingImpl();

    @Test
    public void getFirstNameTest() {
        Assert.assertEquals("Даниил", greeting.getFirstName());
    }

    @Test
    public void getLastNameTest() {
        Assert.assertEquals("Жилинский", greeting.getLastName());
    }

    @Test
    public void getPhoneNumberTest() {
        Assert.assertEquals("89*******55", greeting.getPhone());
    }

    @Test
    public void getBirthYearTest() {
        Assert.assertEquals(1998, greeting.getBirthYear());
    }

    @Test
    public void getRepoUrlTest() {
        Assert.assertEquals("https://github.com/ZhilinskiyDI?tab=repositories", greeting.getRepoUrl());
    }

    @Test
    public void getHobbiesTest() {
        Assert.assertEquals(4, greeting.getHobbies().size());
        Assert.assertFalse(greeting.getHobbies().isEmpty());
    }
    @Test
    public void getCourseExpectationsTest() {
        Assert.assertEquals(3, greeting.getCourseExpectations().size());
        Assert.assertFalse(greeting.getHobbies().isEmpty());
    }


}
