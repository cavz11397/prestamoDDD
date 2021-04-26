package co.com.sofka.ddd.domain.material.events;

import co.com.sofka.ddd.domain.material.values.MaterialId;
import co.com.sofka.domain.generic.DomainEvent;

public class EliminarMaterial extends DomainEvent {
    private final MaterialId materialId;

    public EliminarMaterial(MaterialId materialId) {
        super("nomemientan.ronda.rondafinalizada");
        this.materialId = materialId;
    }

    public MaterialId getMaterialId() {
        return materialId;
    }
}