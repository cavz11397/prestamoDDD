package co.com.sofka.ddd.usecase.solicitante;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ddd.domain.solicitante.Solicitante;
import co.com.sofka.ddd.domain.solicitante.command.CrearSolicitante;
import co.com.sofka.ddd.domain.solicitante.events.SolicitanteCreado;
import co.com.sofka.ddd.domain.solicitante.values.Correo;
import co.com.sofka.ddd.domain.solicitante.values.Estado;
import co.com.sofka.ddd.domain.solicitante.values.Nombre;
import co.com.sofka.ddd.domain.solicitante.values.Telefono;

import java.util.List;

public class CrearSolicitanteUseCase extends UseCase<RequestCommand<CrearSolicitante>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearSolicitante> crearSolicitanteRequestCommand) {

        var command = crearSolicitanteRequestCommand.getCommand();
        var solicitante = new Solicitante(
                command.getPersonaId(),
                command.getNombre(),
                command.getCorreo(),
                command.getTelefono(),
                command.getEstado());

        emit().onResponse(new ResponseEvents(
                solicitante.getUncommittedChanges()
        ));
    }
}
