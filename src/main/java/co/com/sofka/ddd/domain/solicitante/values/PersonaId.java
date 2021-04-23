package co.com.sofka.ddd.domain.solicitante.values;

import co.com.sofka.domain.generic.Identity;

public class PersonaId extends Identity {
    private PersonaId(String uid) {
        super(uid);
    }

    public PersonaId(){}

    public static PersonaId of(String uid) {
        return new PersonaId(uid);
    }
}
