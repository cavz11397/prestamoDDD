package co.com.sofka.ddd.domain.solicitante.command;

import co.com.sofka.ddd.domain.solicitante.values.*;
import co.com.sofka.domain.generic.Command;

public class CrearSolicitante implements Command {

    private final PersonaId personaId;
    private final Nombre nombre;
    private final Correo correo;
    private final Telefono telefono;
    private final Estado estado;

    public CrearSolicitante(PersonaId personaId, Nombre nombre, Correo correo, Telefono telefono, Estado estado){

        this.personaId = personaId;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
    }

    public PersonaId getPersonaId() {
        return personaId;
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
