package me.invoicing.factories;

import com.github.javafaker.Faker;
import me.invoicing.models.Customer;

public class CustomerFactory implements Factory<Customer> {

    // Static method.
    public static Customer make() {
        var faker = new Faker();

        return new Customer(
                faker.code().isbn10(),
                faker.name().firstName(),
                faker.name().lastName()
        );
    }

    @Override
    public Customer build() {
        var faker = new Faker();

        return new Customer(
                faker.code().isbn10(),
                faker.name().firstName(),
                faker.name().lastName()
        );
    }
}
