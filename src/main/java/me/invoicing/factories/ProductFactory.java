package me.invoicing.factories;


import com.github.javafaker.Faker;
import me.invoicing.models.Product;

public class ProductFactory {
    public static Product make() {
        var faker = new Faker();
        return new Product(
                faker.lorem().word(),
                2.99
        );
    }
}