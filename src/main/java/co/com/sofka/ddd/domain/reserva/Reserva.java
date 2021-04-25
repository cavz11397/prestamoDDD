package co.com.sofka.ddd.domain.reserva;

import co.com.sofka.ddd.domain.material.events.AsignacionCategoria;
import co.com.sofka.ddd.domain.material.values.*;
import co.com.sofka.ddd.domain.reserva.events.AsignacionPrestamo;
import co.com.sofka.ddd.domain.reserva.events.AsignacionTrabajador;
import co.com.sofka.ddd.domain.reserva.events.ReservaCreada;
import co.com.sofka.ddd.domain.reserva.values.PrestamoId;
import co.com.sofka.ddd.domain.reserva.values.ReservaId;
import co.com.sofka.ddd.domain.reserva.values.TrabajadorId;
import co.com.sofka.ddd.domain.solicitante.Solicitante;
import co.com.sofka.ddd.domain.solicitante.values.Correo;
import co.com.sofka.ddd.domain.solicitante.values.Nombre;
import co.com.sofka.ddd.domain.solicitante.values.PersonaId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Date;
import java.util.List;

public class Reserva extends AggregateEvent<ReservaId> {

    protected PersonaId personaId;
    protected MaterialId materialId;
    protected Trabajador trabajador;
    protected Prestamo prestamo;


    public Reserva(ReservaId entityId, PersonaId personaId, MaterialId materialId) {
        super(entityId);
        appendChange(new ReservaCreada(personaId,materialId)).apply();
    }

    private Reserva(ReservaId entityId) {
        super(entityId);
        subscribe(new ReservaChange(this));
    }

    public static Reserva from(ReservaId entityId, List<DomainEvent> events) {
        var reserva = new Reserva(entityId);
        events.forEach(reserva::applyEvent);
        return reserva;
    }

    public void asignarPrestamo(PrestamoId prestamoId, Boolean estado, Date fecha){
        appendChange(new AsignacionPrestamo(prestamoId,estado,fecha)).apply();
    }

    public void asignarTrabajador(TrabajadorId trabajadorId, String dependencia, Nombre nombre, Correo correo){
        appendChange(new AsignacionTrabajador(trabajadorId,dependencia,nombre,correo)).apply();
    }

    public PersonaId PersonaId() {
        return personaId;
    }

    public MaterialId MaterialId() {
        return materialId;
    }

}
