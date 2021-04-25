package co.com.sofka.ddd.domain.solicitante.command;

import co.com.sofka.ddd.domain.reserva.values.PrestamoId;
import co.com.sofka.ddd.domain.reserva.values.ReservaId;
import co.com.sofka.ddd.domain.solicitante.values.*;
import co.com.sofka.domain.generic.Command;

import java.util.Date;

public class CrearSancion implements Command {

    private final SancionId sancionId;
    private final PrestamoId prestamoId;
    private final ReservaId reservaId;
    private final Date fechaInicio;
    private final Date fechaFin;

    public CrearSancion(SancionId sancionId, PrestamoId prestamoId, ReservaId reservaId, Date fechaInicio, Date fechaFin){

        this.sancionId = sancionId;
        this.prestamoId = prestamoId;
        this.reservaId = reservaId;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public SancionId getSancionId() {
        return sancionId;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
    }

    public ReservaId getReservaId() {
        return reservaId;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }
}
