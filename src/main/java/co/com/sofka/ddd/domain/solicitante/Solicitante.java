package co.com.sofka.ddd.domain.solicitante;

import co.com.sofka.ddd.domain.solicitante.events.SolicitanteCreado;
import co.com.sofka.ddd.domain.solicitante.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

public class Solicitante extends AggregateEvent<PersonaId> {

    protected Nombre nombre;
    protected Correo correo;
    protected Telefono telefono;
    protected Estado estado;

    public Solicitante(PersonaId entityId,Nombre nombre, Correo correo, Telefono telefono, Estado estado){
        super(entityId);
        appendChange(new SolicitanteCreado(nombre,correo,telefono,estado)).apply();
        //crear la solicitud
    }

    private Solicitante(PersonaId entityId) {
        super(entityId);
        subscribe(new SolicitanteChange(this));
    }

    public void modificarNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public void modificarCorreo(Correo correo) {
        this.correo = correo;
    }

    public void modificarTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public void modificarEstado(Estado estado) {
        this.estado = estado;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Correo Correo() {
        return correo;
    }

    public Telefono Telefono() {
        return telefono;
    }

    public Estado Estado() {
        return estado;
    }
}
