package me.invoicing.factories;

import com.github.javafaker.Faker;
import me.invoicing.models.Establishment;

public class EstablishmentFactory {

    public static Establishment make() {
        var faker = new Faker();
        return new Establishment(
                faker.code().imei(),
                faker.lordOfTheRings().character(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.address().fullAddress()
        );
    }
}
