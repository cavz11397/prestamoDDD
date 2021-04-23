package co.com.sofka.ddd.domain.material.events;

import co.com.sofka.ddd.domain.material.Categoria;
import co.com.sofka.ddd.domain.material.values.CategoriaId;
import co.com.sofka.ddd.domain.material.values.Descripcion;
import co.com.sofka.ddd.domain.material.values.TiempoMaximoPrestamo;
import co.com.sofka.domain.generic.DomainEvent;

public class AsignacionCategoria extends DomainEvent {

    private Categoria categoria;

    public AsignacionCategoria(CategoriaId categoriaId, TiempoMaximoPrestamo tiempoMaximoPrestamo, Descripcion descripcion) {
        super("prestamos.material.assignacioncategoria");
        this.categoria= new Categoria(categoriaId,tiempoMaximoPrestamo,descripcion);
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
