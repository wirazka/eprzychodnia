package pl.sda.eprzychodnia.dto.doctor;

import jdk.nashorn.internal.runtime.Specialization;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SpecializationDTO {
    private Specialization id;
    private String name;
}
