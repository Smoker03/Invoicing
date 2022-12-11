package me.invoicing.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.vavr.control.Either;
import me.invoicing.models.Invoice;

public class InvoiceXMLSerializer implements InvoiceSerializer {
    private final Invoice invoice;

    public InvoiceXMLSerializer(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public Either<Exception, String> execute() {
        var mapper = new XmlMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {
            return Either.right(mapper.setProperty(invoice, System.out));
        } catch (JsonProcessingException e) {
            return Either.left(e);
        }
    }
}
