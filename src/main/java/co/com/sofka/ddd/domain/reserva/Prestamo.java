package co.com.sofka.ddd.domain.reserva;

import co.com.sofka.ddd.domain.reserva.values.PrestamoId;
import co.com.sofka.domain.generic.Entity;

import java.util.Date;

public class Prestamo extends Entity<PrestamoId> {

    private Boolean estado;
    private Date fecha;

    public Prestamo(PrestamoId entityId,Boolean estado, Date fecha) {
        super(entityId);
        this.estado = estado;
        this.fecha = fecha;
    }

    public Boolean Estado() {
        return estado;
    }

    public Date Fecha() {
        return fecha;
    }
}
