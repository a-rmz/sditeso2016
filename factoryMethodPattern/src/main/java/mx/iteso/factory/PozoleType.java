package mx.iteso.factory;

/**
 * Created by a-rmz on 10/6/16.
 */
public enum PozoleType {
    CACHETE("Cachete"),
    CAMARON("Camaron"),
    MENUDO("Menudo"),
    OREJA("Oreja"),
    PIERNA("Pierna"),
    POLLO("Pollo"),
    POZOLE_ROJO("Pozole Rojo"),
    POZOLE_VERDE("Pozole Verde"),
    POZOLE_BLANCO("Pozole Blanco"),
    POZOLILLO("Pozolillo"),
    RES("Res"),
    TROMPA("Trompa");

    private String name;

    PozoleType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}

/*
    POZOLE_BLANCO_CACHETE,
    POZOLE_BLANCO_CAMARON,
    POZOLE_BLANCO_OREJA,
    POZOLE_BLANCO_PIERNA,
    POZOLE_BLANCO_POLLO,
    POZOLE_BLANCO_RES,
    POZOLE_BLANCO_TROMPA,
    POZOLE_ROJO_CACHETE,
    POZOLE_ROJO_CAMARON,
    POZOLE_ROJO_OREJA,
    POZOLE_ROJO_PIERNA,
    POZOLE_ROJO_POLLO,
    POZOLE_ROJO_RES,
    POZOLE_ROJO_TROMPA,
    POZOLE_VERDE_CACHETE,
    POZOLE_VERDE_CAMARON,
    POZOLE_VERDE_OREJA,
    POZOLE_VERDE_PIERNA,
    POZOLE_VERDE_POLLO,
    POZOLE_VERDE_RES,
    POZOLE_VERDE_TROMPA,
 */
