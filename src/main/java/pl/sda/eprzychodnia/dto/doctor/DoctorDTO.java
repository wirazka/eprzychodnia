package pl.sda.eprzychodnia.dto.doctor;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DoctorDTO {
    private Long id;
    private String name;
    private String surname;
    private String type;
    private String specialization;

}