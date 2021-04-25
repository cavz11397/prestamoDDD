package co.com.sofka.ddd.domain.solicitante;

import co.com.sofka.ddd.domain.solicitante.events.AsignacionDeSancion;
import co.com.sofka.ddd.domain.solicitante.events.SolicitanteCreado;
import co.com.sofka.domain.generic.EventChange;

public class SolicitanteChange extends EventChange {
    public SolicitanteChange(Solicitante solicitante) {
        apply((SolicitanteCreado event )-> {
            solicitante.nombre= event.getNombre();
            solicitante.correo= event.getCorreo();
            solicitante.telefono= event.getTelefono();
            solicitante.estado= event.getEstado();
        });

        apply((AsignacionDeSancion event)->{
            solicitante.sancion= event.getSancion();
        });
    }
}
