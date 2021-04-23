package co.com.sofka.ddd.domain.solicitante;

import co.com.sofka.ddd.domain.reserva.values.PrestamoId;
import co.com.sofka.ddd.domain.reserva.values.ReservaId;
import co.com.sofka.ddd.domain.solicitante.values.SancionId;
import co.com.sofka.domain.generic.Entity;

import java.util.Date;

public class Sancion extends Entity<SancionId> {

    private PrestamoId prestamoId;
    private ReservaId reservaId;
    private Date fechaInicio;
    private Date fechaFin;

    public Sancion(SancionId sancionId, PrestamoId prestamoId, ReservaId reservaId, Date fechaInicio, Date fechaFin) {
        super(sancionId);
        this.prestamoId = prestamoId;
        this.reservaId = reservaId;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public PrestamoId PrestamoId() {
        return prestamoId;
    }

    public ReservaId ReservaId() {
        return reservaId;
    }

    public Date FechaInicio() {
        return fechaInicio;
    }

    public Date FechaFin() {
        return fechaFin;
    }
}
