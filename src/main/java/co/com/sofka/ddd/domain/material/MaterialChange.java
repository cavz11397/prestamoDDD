package co.com.sofka.ddd.domain.material;

import co.com.sofka.ddd.domain.material.events.AsignacionCategoria;
import co.com.sofka.ddd.domain.material.events.MaterialCreado;
import co.com.sofka.domain.generic.EventChange;

public class MaterialChange extends EventChange {
    public MaterialChange(Material material) {
        apply((MaterialCreado event)->{
            material.nombreMaterial= event.getNombreMaterial();
            material.stock= event.getStock();
        });

        apply((AsignacionCategoria event)->{
            material.categoria= event.getCategoria();
        });
    }
}
