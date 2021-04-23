package co.com.sofka.ddd.domain.material;

import co.com.sofka.ddd.domain.material.values.CategoriaId;
import co.com.sofka.ddd.domain.material.values.Descripcion;
import co.com.sofka.ddd.domain.material.values.TiempoMaximoPrestamo;
import co.com.sofka.domain.generic.Entity;

public class Categoria extends Entity<CategoriaId> {

    protected TiempoMaximoPrestamo tiempoMaximoPrestamo;
    protected Descripcion descripcion;

    public Categoria(CategoriaId entityId, TiempoMaximoPrestamo tiempoMaximoPrestamo, Descripcion descripcion) {
        super(entityId);
        this.tiempoMaximoPrestamo = tiempoMaximoPrestamo;
        this.descripcion = descripcion;
    }

    public TiempoMaximoPrestamo TiempoMaximoPrestamo() {
        return tiempoMaximoPrestamo;
    }

    public Descripcion Descripcion() {
        return descripcion;
    }
}
