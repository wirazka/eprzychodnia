package pl.sda.eprzychodnia.entity;

import lombok.*;
import pl.sda.eprzychodnia.dto.doctor.DoctorDTO;
import javax.persistence.*;
import java.util.Set;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "first_name")
    private String name;
    @Column(name = "second_name")
    private String surname;
    private String specialization;

    @OneToMany
    private Set<DoctorAvailability> availabilities;

    public DoctorDTO toDto() {
        return DoctorDTO.builder()
                .id(id)
                .name(name)
                .surname(surname)
                .specialization(specialization)
                .build();
    }
}
