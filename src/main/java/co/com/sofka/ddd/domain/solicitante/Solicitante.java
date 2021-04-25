package co.com.sofka.ddd.domain.solicitante;

import co.com.sofka.ddd.domain.reserva.values.PrestamoId;
import co.com.sofka.ddd.domain.reserva.values.ReservaId;
import co.com.sofka.ddd.domain.solicitante.events.AsignacionDeSancion;
import co.com.sofka.ddd.domain.solicitante.events.SolicitanteCreado;
import co.com.sofka.ddd.domain.solicitante.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Date;
import java.util.List;

public class Solicitante extends AggregateEvent<PersonaId> {

    protected Nombre nombre;
    protected Correo correo;
    protected Telefono telefono;
    protected Estado estado;
    protected Sancion sancion;

    public Solicitante(PersonaId entityId,Nombre nombre, Correo correo, Telefono telefono, Estado estado){
        super(entityId);
        appendChange(new SolicitanteCreado(nombre,correo,telefono,estado)).apply();
        //crear la solicitud
    }

    private Solicitante(PersonaId entityId) {
        super(entityId);
        subscribe(new SolicitanteChange(this));
    }

    public static Solicitante from(PersonaId entityId, List<DomainEvent> events) {
        var solicitante = new Solicitante(entityId);
        events.forEach(solicitante::applyEvent);
        return solicitante;
    }

    public void AsignacionSancion(SancionId sancionId, PrestamoId prestamoId, ReservaId reservaId, Date fechaInicio, Date fechaFin){
        appendChange(new AsignacionDeSancion(sancionId,prestamoId,reservaId,fechaInicio,fechaFin)).apply();
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

    public Sancion getSancion() {
        return sancion;
    }
}
