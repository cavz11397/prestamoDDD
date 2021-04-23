package co.com.sofka.ddd.usecase.material;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ddd.domain.material.command.CrearMaterial;
import co.com.sofka.ddd.domain.material.events.MaterialCreado;
import co.com.sofka.ddd.domain.material.values.MaterialId;
import co.com.sofka.ddd.domain.material.values.NombreMaterial;
import co.com.sofka.ddd.domain.material.values.Stock;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CrearMaterialUseCaseTest {

    @Test
    void crearNuevoMaterial(){

        var id= new MaterialId();
        var stock= new Stock(10);
        var nombre= new NombreMaterial("portatil");

        var command = new CrearMaterial(id,stock,nombre);

        var useCase = new CrearMaterialUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance().
                syncExecutor(useCase,new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        MaterialCreado event = (MaterialCreado) events.get(0);

        Assertions.assertEquals("portatil", event.getNombreMaterial().value());
        Assertions.assertEquals(10, event.getStock().value());
    }

}