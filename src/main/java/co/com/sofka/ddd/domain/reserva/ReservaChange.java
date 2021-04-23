package co.com.sofka.ddd.domain.reserva;

import co.com.sofka.ddd.domain.reserva.events.AsignacionPrestamo;
import co.com.sofka.ddd.domain.reserva.events.AsignacionTrabajador;
import co.com.sofka.ddd.domain.reserva.events.ReservaCreada;
import co.com.sofka.domain.generic.EventChange;

public class ReservaChange extends EventChange {
    public ReservaChange(Reserva reserva) {
        apply((ReservaCreada event)->{
            reserva.materialId=event.getMaterialId();
            reserva.personaId=event.getPersonaId();
        });

        apply((AsignacionTrabajador event) -> {
            reserva.trabajador=event.getTrabajador();
        });

        apply((AsignacionPrestamo event) -> {
            reserva.prestamo=event.getPrestamo();
        });
    }
}
