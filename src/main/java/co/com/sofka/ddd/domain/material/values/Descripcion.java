package co.com.sofka.ddd.domain.material.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {
    private final String value;
    private final Tipo tipo;

    public Descripcion(String name, Tipo tipo) {
        this.value = Objects.requireNonNull(name);
        this.tipo = tipo;
        if(name.isBlank()){
            throw new IllegalArgumentException("La descripcion no puede estar vacia");
        }
    }

    public String value() {
        return value;
    }
}