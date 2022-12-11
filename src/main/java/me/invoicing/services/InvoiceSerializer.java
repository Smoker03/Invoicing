package me.invoicing.services;

import io.vavr.control.Either;

public interface InvoiceSerializer {
    Either<Exception, String > execute();
}
