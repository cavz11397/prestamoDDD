package co.com.sofka.ddd.domain.reserva;

import co.com.sofka.ddd.domain.reserva.values.TrabajadorId;
import co.com.sofka.ddd.domain.solicitante.values.Correo;
import co.com.sofka.ddd.domain.solicitante.values.Nombre;
import co.com.sofka.domain.generic.Entity;

public class Trabajador extends Entity<TrabajadorId> {

    protected String dependencia;
    protected Nombre nombre;
    protected Correo correo;

    public Trabajador(TrabajadorId entityId, String dependencia, Nombre nombre, Correo correo) {
        super(entityId);
        this.dependencia = dependencia;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getDependencia() {
        return dependencia;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Correo getCorreo() {
        return correo;
    }
}
