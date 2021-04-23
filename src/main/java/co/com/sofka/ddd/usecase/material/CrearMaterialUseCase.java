package co.com.sofka.ddd.usecase.material;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ddd.domain.material.Material;
import co.com.sofka.ddd.domain.material.command.CrearMaterial;

public class CrearMaterialUseCase extends UseCase<RequestCommand<CrearMaterial>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearMaterial> crearMaterialRequestCommand) {

        var command = crearMaterialRequestCommand.getCommand();
        var material = new Material(command.getMaterialId(), command.getStock(),command.getNombreMaterial());

        emit().onResponse(new ResponseEvents(material.getUncommittedChanges()

        ));
    }
}
