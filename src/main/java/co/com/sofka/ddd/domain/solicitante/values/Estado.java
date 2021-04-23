package co.com.sofka.ddd.domain.solicitante.values;

import co.com.sofka.domain.generic.ValueObject;

public class Estado implements ValueObject<Boolean> {

    private final Boolean value;

    public Estado(Boolean estado) {
        this.value = estado;
    }

    public Boolean value() {
        return value;
    }
}
