package co.com.sofka.ddd.domain.material.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreMaterial implements ValueObject<String> {
    private final String value;

    public NombreMaterial(String name) {
        this.value = Objects.requireNonNull(name);
        if(name.isBlank()){
            throw new IllegalArgumentException("El nombre no puede esta vacio");
        }
    }

    public String value() {
        return value;
    }
}
