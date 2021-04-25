package co.com.sofka.ddd.domain.reserva.command;

import co.com.sofka.ddd.domain.material.values.MaterialId;
import co.com.sofka.ddd.domain.reserva.values.ReservaId;
import co.com.sofka.ddd.domain.solicitante.values.PersonaId;
import co.com.sofka.domain.generic.Command;

public class CrearReserva implements Command {

    private final ReservaId reservaId;
    private final PersonaId personaId;
    private final MaterialId materialId;

    public CrearReserva(ReservaId reservaId, PersonaId personaId, MaterialId materialId) {
        this.reservaId = reservaId;
        this.personaId = personaId;
        this.materialId = materialId;
    }

    public ReservaId getReservaId() {
        return reservaId;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public MaterialId getMaterialId() {
        return materialId;
    }
}
