package com.vitelco.training.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonTest {

    @Test
    @DisplayName("Merhaba Irem Testi")
    public void shouldReturnHelloIrem() {
        Person person = new Person("irem");
        Assertions.assertEquals("Merhaba irem", person.sayHello());
    }

    @Test
    @DisplayName("shouldReturnEight")
    public void shouldReturnEight() {
        Person person = new Person();
        Assertions.assertEquals(8f, person.timesTwo(4f));
    }

    @Test
    @DisplayName("divideTest")
    public void divideTest() {
        Person person = new Person();
        Assertions.assertEquals(50f, person.divide(2f));
    }
}
