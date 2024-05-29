package ru.sberbank.jd.lesson01;

import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class GreetingImpl implements Greeting{
    /**
     * Получение имени.
     */
    @Override
    public String getFirstName() {
        return "Даниил";
    }

    /**
     * Получение фамилии.
     */
    @Override
    public String getLastName() {
        return "Жилинский";
    }

    /**
     * Получение года рождения.
     */
    @Override
    public int getBirthYear() {
        return 1998;
    }

    /**
     * Получение набора хобби.
     */
    @Override
    public Collection<String> getHobbies() {
       return new ArrayList<>(Arrays.asList("sport", "reading", "meeting with friends", "travelling"));
    }

    /**
     * Получение имени репозитория.
     */
    @Override
    public String getRepoUrl() {
        return "https://github.com/ZhilinskiyDI?tab=repositories";
    }

    /**
     * Получение телефона.
     */
    @Override
    public String getPhone() {
        return "89*******55";
    }

    /**
     * Получение набора ожиданий от курса.
     */
    @Override
    public Collection<String> getCourseExpectations() {
        return new ArrayList<>(Arrays.asList("good knowledge in JAVA", "meeting new brain-frieds", "learn new stacks, like sockets, Kafka"));
    }
}
