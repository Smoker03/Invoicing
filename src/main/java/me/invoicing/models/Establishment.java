package me.invoicing.models;

public record Establishment(
        String ruc,
        String name,
        String email,
        String phone,
        String address
) {
}
