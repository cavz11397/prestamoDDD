package co.com.sofka.ddd.usecase.solicitante;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ddd.domain.solicitante.command.CrearSolicitante;
import co.com.sofka.ddd.domain.solicitante.events.SolicitanteCreado;
import co.com.sofka.ddd.domain.solicitante.values.*;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CrearSolicitanteUseCaseTest {

    @Test
    void crearNuevoSolicitante(){

        var personaId = new PersonaId();
        var nombre = new Nombre("Alejo");
        var correo = new Correo("cavz11397@gmail.com");
        var telefono = new Telefono("3148093298");
        var estado = new Estado(true);

        var command = new CrearSolicitante(personaId, nombre, correo, telefono, estado);

        var useCase = new CrearSolicitanteUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance().
                syncExecutor(useCase,new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        SolicitanteCreado event = (SolicitanteCreado) events.get(0);

        Assertions.assertEquals("Alejo", event.getNombre().value());
        Assertions.assertEquals("cavz11397@gmail.com", event.getCorreo().value());
        Assertions.assertEquals("3148093298", event.getTelefono().value());
        Assertions.assertEquals(true, event.getEstado().value());


    }
}