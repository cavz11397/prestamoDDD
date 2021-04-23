package co.com.sofka.ddd.domain.reserva.values;

import co.com.sofka.domain.generic.Identity;

public class TrabajadorId extends Identity {
    private TrabajadorId(String uid) {
        super(uid);
    }

    public TrabajadorId(){}

    public static TrabajadorId of(String uid) {
        return new TrabajadorId(uid);
    }
}