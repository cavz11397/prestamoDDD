package co.com.sofka.ddd.domain.solicitante.events;

import co.com.sofka.ddd.domain.solicitante.values.Correo;
import co.com.sofka.ddd.domain.solicitante.values.Estado;
import co.com.sofka.ddd.domain.solicitante.values.Nombre;
import co.com.sofka.ddd.domain.solicitante.values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class SolicitanteCreado extends DomainEvent {
    private final Nombre nombre;
    private final Correo correo;
    private final Telefono telefono;
    private final Estado estado;

    public SolicitanteCreado(Nombre nombre, Correo correo, Telefono telefono, Estado estado) {
        super("prestamos.solicitante.solicitantecreado");
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Correo getCorreo() {
        return correo;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Estado getEstado() {
        return estado;
    }
}
