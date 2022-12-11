package me.invoicing.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "invoice")
public record Invoice(
        String id,
        Establishment establishment,
        Customer customer,
        @JacksonXmlElementWrapper(localName = "products")
        @JsonProperty("product")
        List<Product> products) {
}