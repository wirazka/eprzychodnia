package pl.sda.eprzychodnia.type;

import lombok.*;

public enum Specialization {
    PEDRIATRICIAN("Pedriatria"),
    CARDILOGIST("Kardiologia"),
    OCULIST("Okulista"),
    INTERNIST("Internista"),
    GENERALPRACTITIONER("Rodzinny");


    @Getter
    @Setter
    String label;

    Specialization(String label) {
        this.label = label;
    }
}
