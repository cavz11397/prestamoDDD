package co.com.sofka.ddd.usecase.solicitante;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ddd.domain.solicitante.Sancion;
import co.com.sofka.ddd.domain.solicitante.Solicitante;
import co.com.sofka.ddd.domain.solicitante.command.CrearSancion;
import co.com.sofka.ddd.domain.solicitante.values.SancionId;

public class CrearSancionUseCase extends UseCase<RequestCommand<CrearSancion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearSancion> crearSancionRequestCommand) {

        var command = crearSancionRequestCommand.getCommand();
        var sancion = new Sancion(
                command.getSancionId(),
                command.getPrestamoId(),
                command.getReservaId(),
                command.getFechaInicio(),
                command.getFechaFin());
        /*
        emit().onResponse(new ResponseEvents(
                sancion.getUncommittedChanges()
        ));*/

    }
}
