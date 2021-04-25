package co.com.sofka.ddd.usecase.reserva;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ddd.domain.reserva.command.CrearReserva;
import co.com.sofka.ddd.domain.reserva.events.ReservaCreada;

public class CrearReservaUseCase extends UseCase<RequestCommand<CrearReserva>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearReserva> crearReservaRequestCommand) {
    }
}
