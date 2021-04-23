package co.com.sofka.ddd.domain.solicitante.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Prioridad implements ValueObject<String> {
    private final String value;

    public Prioridad(String name) {
        this.value = Objects.requireNonNull(name);
        if(name.isBlank()){
            throw new IllegalArgumentException("La prioridad no puede estar vacio");
        }
    }

    public String value() {
        return value;
    }
}