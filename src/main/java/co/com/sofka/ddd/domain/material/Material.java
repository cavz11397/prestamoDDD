package co.com.sofka.ddd.domain.material;

import co.com.sofka.ddd.domain.material.events.AsignacionCategoria;
import co.com.sofka.ddd.domain.material.events.MaterialCreado;
import co.com.sofka.ddd.domain.material.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

public class Material extends AggregateEvent<MaterialId> {

    protected Stock stock;
    protected NombreMaterial nombreMaterial;
    protected Categoria categoria;

    //No se debe pasar la entidad por el constructor, hay que hacerlo a traves de eventos
    //No settear los estados en el constructor, sino a traves de eventos


    public Material(MaterialId entityId, Stock stock, NombreMaterial nombreMaterial) {
        super(entityId);
        appendChange(new MaterialCreado(stock,nombreMaterial)).apply();
    }

    private Material(MaterialId entityId){
        super(entityId);
        subscribe(new MaterialChange(this));
    }

    public void asignarCategoria(CategoriaId categoriaId, TiempoMaximoPrestamo tiempoMaximoPrestamo,
                                 Descripcion descripcion){
        appendChange(new AsignacionCategoria(categoriaId,tiempoMaximoPrestamo,descripcion)).apply();
    }

    public Stock Stock() {
        return stock;
    }

    public NombreMaterial NombreMaterial() {
        return nombreMaterial;
    }

    public Categoria Categoria() {
        return categoria;
    }
}
