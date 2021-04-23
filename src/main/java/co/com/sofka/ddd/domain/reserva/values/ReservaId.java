package co.com.sofka.ddd.domain.reserva.values;

import co.com.sofka.domain.generic.Identity;

public class ReservaId extends Identity {
    private ReservaId(String uid) {
        super(uid);
    }

    public ReservaId(){}

    public static ReservaId of(String uid) {
        return new ReservaId(uid);
    }
}
