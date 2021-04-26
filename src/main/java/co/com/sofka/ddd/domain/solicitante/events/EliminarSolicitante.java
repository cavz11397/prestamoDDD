package co.com.sofka.ddd.domain.solicitante.events;

import co.com.sofka.ddd.domain.solicitante.values.PersonaId;
import co.com.sofka.domain.generic.DomainEvent;

public class EliminarSolicitante extends DomainEvent {
    private final PersonaId personaId;

    public EliminarSolicitante(PersonaId personaId) {
        super("nomemientan.ronda.rondafinalizada");
        this.personaId = personaId;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }
}
