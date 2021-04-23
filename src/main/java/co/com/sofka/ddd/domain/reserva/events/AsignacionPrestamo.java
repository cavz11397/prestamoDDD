package co.com.sofka.ddd.domain.reserva.events;

import co.com.sofka.ddd.domain.reserva.Prestamo;
import co.com.sofka.ddd.domain.reserva.values.PrestamoId;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Date;

public class AsignacionPrestamo extends DomainEvent {

    private Prestamo prestamo;

    public AsignacionPrestamo(PrestamoId prestamoId, Boolean estado, Date fecha) {
        super("prestamos.reserva.asignacionprestamo");
        this.prestamo= new Prestamo(prestamoId,estado,fecha);
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }
}
