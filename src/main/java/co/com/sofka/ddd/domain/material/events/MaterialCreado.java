package co.com.sofka.ddd.domain.material.events;

import co.com.sofka.ddd.domain.material.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class MaterialCreado extends DomainEvent {
    private final Stock stock;
    private final NombreMaterial nombreMaterial;

    public MaterialCreado(Stock stock, NombreMaterial nombreMaterial) {
        super("prestamos.material.materialcreado");
        this.stock = stock;
        this.nombreMaterial = nombreMaterial;
    }

    public Stock getStock() {
        return stock;
    }

    public NombreMaterial getNombreMaterial() {
        return nombreMaterial;
    }

}
