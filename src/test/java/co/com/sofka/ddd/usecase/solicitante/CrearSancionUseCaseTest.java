package co.com.sofka.ddd.usecase.solicitante;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ddd.domain.reserva.values.PrestamoId;
import co.com.sofka.ddd.domain.reserva.values.ReservaId;
import co.com.sofka.ddd.domain.solicitante.command.CrearSancion;
import co.com.sofka.ddd.domain.solicitante.events.AsignacionDeSancion;
import co.com.sofka.ddd.domain.solicitante.values.*;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;


class CrearSancionUseCaseTest {

    @Test
    void crearNuevaSancion(){

        var sancionId = new SancionId();
        var prestamoId = new PrestamoId();
        var reservaId = new ReservaId();
        var fechaInicio = new Date();
        var fechaFin = new Date();

        var command = new CrearSancion(sancionId, prestamoId, reservaId, fechaInicio, fechaFin);

        var useCase = new CrearSancionUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance().
                syncExecutor(useCase,new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        AsignacionDeSancion event = (AsignacionDeSancion) events.get(0);

        Assertions.assertEquals("Alejo", event.getSancion());


    }
}