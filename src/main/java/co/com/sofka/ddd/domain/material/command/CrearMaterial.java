package co.com.sofka.ddd.domain.material.command;

import co.com.sofka.ddd.domain.material.values.MaterialId;
import co.com.sofka.ddd.domain.material.values.NombreMaterial;
import co.com.sofka.ddd.domain.material.values.Stock;
import co.com.sofka.domain.generic.Command;

public class CrearMaterial implements Command {

    private final MaterialId materialId;
    private final Stock stock;
    private final NombreMaterial nombreMaterial;

    public  CrearMaterial(MaterialId entityId, Stock stock, NombreMaterial nombreMaterial){
        materialId = entityId;
        this.stock = stock;
        this.nombreMaterial = nombreMaterial;
    }

    public MaterialId getMaterialId() {
        return materialId;
    }

    public Stock getStock() {
        return stock;
    }

    public NombreMaterial getNombreMaterial() {
        return nombreMaterial;
    }
}
