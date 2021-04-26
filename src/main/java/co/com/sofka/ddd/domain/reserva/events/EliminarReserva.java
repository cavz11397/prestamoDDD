package co.com.sofka.ddd.domain.reserva.events;

import co.com.sofka.ddd.domain.reserva.values.ReservaId;
import co.com.sofka.domain.generic.DomainEvent;

public class EliminarReserva extends DomainEvent {
    private final ReservaId reservaId;

    public EliminarReserva(ReservaId reservaId) {
        super("nomemientan.ronda.rondafinalizada");
        this.reservaId = reservaId;
    }

    public ReservaId getReservaId() {
        return reservaId;
    }
}