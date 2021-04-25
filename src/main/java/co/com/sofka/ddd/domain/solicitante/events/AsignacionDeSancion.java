package co.com.sofka.ddd.domain.solicitante.events;

import co.com.sofka.ddd.domain.reserva.values.PrestamoId;
import co.com.sofka.ddd.domain.reserva.values.ReservaId;
import co.com.sofka.ddd.domain.solicitante.Sancion;
import co.com.sofka.ddd.domain.solicitante.values.SancionId;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Date;

public class AsignacionDeSancion extends DomainEvent {

    private Sancion sancion;

    public AsignacionDeSancion(SancionId sancionId, PrestamoId prestamoId, ReservaId reservaId, Date fechaInicio, Date fechaFin) {
        super("prestamos.solicitante.asignacionsancion");
        this.sancion= new Sancion(sancionId,prestamoId,reservaId,fechaInicio,fechaFin);
    }

    public Sancion getSancion() {
        return sancion;
    }
}
