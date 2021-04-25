package co.com.sofka.ddd.usecase.reserva;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ddd.domain.material.values.MaterialId;
import co.com.sofka.ddd.domain.reserva.command.CrearReserva;
import co.com.sofka.ddd.domain.reserva.events.ReservaCreada;
import co.com.sofka.ddd.domain.reserva.values.ReservaId;
import co.com.sofka.ddd.domain.solicitante.values.PersonaId;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class CrearReservaUseCaseTest {

    @Test
    void crearNuevaReserva(){

        var reservaId = new ReservaId();
        var personaId = new PersonaId();
        var materialId = new MaterialId();

        var command = new CrearReserva(reservaId,personaId,materialId);

        var useCase = new CrearReservaUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance().
                syncExecutor(useCase,new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        ReservaCreada event = (ReservaCreada) events.get(0);

        Assertions.assertEquals(materialId,event.getMaterialId());


    }
}