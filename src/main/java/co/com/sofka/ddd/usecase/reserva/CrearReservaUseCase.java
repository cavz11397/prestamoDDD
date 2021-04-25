package co.com.sofka.ddd.usecase.reserva;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ddd.domain.reserva.Reserva;
import co.com.sofka.ddd.domain.reserva.command.CrearReserva;

public class CrearReservaUseCase extends UseCase<RequestCommand<CrearReserva>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearReserva> crearReservaRequestCommand) {

        var command = crearReservaRequestCommand.getCommand();
        var reserva = new Reserva(
                command.getReservaId(),
                command.getPersonaId(),
                command.getMaterialId());

        emit().onResponse(new ResponseEvents(
                reserva.getUncommittedChanges()
        ));

    }
}
