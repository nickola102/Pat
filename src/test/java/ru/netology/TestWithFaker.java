package ru.netology;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class TestWithFaker {

    private static Faker faker;

    @BeforeAll
    static void setUpAll() {
        faker = new Faker(new Locale("ru"));
    }

    @Test
    void shouldGenerateTestData() {
        String name = faker.name().fullName();
        String phone = faker.phoneNumber().phoneNumber();
        String cardNumber = faker.finance().creditCard(CreditCardType.MASTERCARD);
        System.out.println(name);
        System.out.println(phone);
        System.out.println(cardNumber);
    }

}

