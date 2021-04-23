package co.com.sofka.ddd.domain.material.values;

import co.com.sofka.domain.generic.Identity;

public class MaterialId extends Identity {
    private MaterialId(String uid) {
        super(uid);
    }

    public MaterialId(){}

    public static MaterialId of(String uid) {
        return new MaterialId(uid);
    }
}
