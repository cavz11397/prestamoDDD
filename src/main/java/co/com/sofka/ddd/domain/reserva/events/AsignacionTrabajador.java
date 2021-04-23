package co.com.sofka.ddd.domain.reserva.events;

import co.com.sofka.ddd.domain.reserva.Trabajador;
import co.com.sofka.ddd.domain.reserva.values.TrabajadorId;
import co.com.sofka.ddd.domain.solicitante.values.Correo;
import co.com.sofka.ddd.domain.solicitante.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class AsignacionTrabajador extends DomainEvent {

    private Trabajador trabajador;

    public AsignacionTrabajador(TrabajadorId trabajadorId, String dependencia, Nombre nombre, Correo correo) {
        super("prestamos.reserva.asignaciontrabajador");
        this.trabajador=new Trabajador(trabajadorId,dependencia,nombre,correo);
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }
}
