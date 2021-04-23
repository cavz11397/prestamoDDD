package co.com.sofka.ddd.domain.material.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Stock implements ValueObject<Integer> {
    private final Integer value;

    public Stock(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(value < 0){
            throw new IllegalArgumentException("El valor del stock no puede ser negativo");
        }
    }


    public Stock aumentar(Integer value){
        return new Stock(this.value + value);
    }

    @Override
    public Integer value() {
        return value;
    }
}