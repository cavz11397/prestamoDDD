package co.com.sofka.ddd.domain.material.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TiempoMaximoPrestamo implements ValueObject<Long> {
    private final Long value;

    public TiempoMaximoPrestamo(Long value) {
        this.value = Objects.requireNonNull(value);
        if(value < 0){
            throw new IllegalArgumentException("El valor del stock no puede ser negativo");
        }
    }


    public TiempoMaximoPrestamo aumentar(Long value){
        return new TiempoMaximoPrestamo(this.value + value);
    }

    @Override
    public Long value() {
        return value;
    }
}