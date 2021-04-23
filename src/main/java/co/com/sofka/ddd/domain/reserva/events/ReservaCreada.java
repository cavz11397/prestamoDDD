package co.com.sofka.ddd.domain.reserva.events;

import co.com.sofka.ddd.domain.material.values.MaterialId;
import co.com.sofka.ddd.domain.solicitante.values.PersonaId;
import co.com.sofka.domain.generic.DomainEvent;

public class ReservaCreada extends DomainEvent {
    private final PersonaId personaId;
    private final MaterialId materialId;

    public ReservaCreada(PersonaId personaId, MaterialId materialId) {
        super("prestamos.reserva.reservacreada");
        this.personaId = personaId;
        this.materialId = materialId;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public MaterialId getMaterialId() {
        return materialId;
    }
}
