package me.invoicing;

import me.invoicing.factories.CustomerFactory;
import me.invoicing.factories.EstablishmentFactory;
import me.invoicing.factories.ProductFactory;
import me.invoicing.models.*;
import me.invoicing.services.InvoiceXMLSerializer;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        // Factory -- instance method.
        var customer = new CustomerFactory().build();

        var products = new ArrayList<Product>() {{
            add(ProductFactory.make());
            add(ProductFactory.make());
        }};

        // Factory -- static method.
        var establishment = EstablishmentFactory.make();

        var invoice = new Invoice("50980", establishment, customer, products);
        var serializer = new InvoiceXMLSerializer(invoice);
        var result = serializer.execute();


        if (result.isRight()) {
            System.out.println(result.get());
        } else {
            System.out.println(result.getLeft().getMessage());
        }
    }
}
