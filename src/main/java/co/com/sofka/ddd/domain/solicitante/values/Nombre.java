package co.com.sofka.ddd.domain.solicitante.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    private final String value;

    public Nombre(String name) {
        this.value = Objects.requireNonNull(name);
        if(name.isBlank()){
            throw new IllegalArgumentException("El nombre no puede esta vacio");
        }
    }

    public String value() {
        return value;
    }
}