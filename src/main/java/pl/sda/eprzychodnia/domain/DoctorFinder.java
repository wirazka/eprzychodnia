package pl.sda.eprzychodnia.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.eprzychodnia.repository.DoctorRepository;
import pl.sda.eprzychodnia.entity.Doctor;
import pl.sda.eprzychodnia.repository.DoctorRepository;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DoctorFinder {

    private final DoctorRepository doctorRepository;

    public List<DoctorDTO> findBySpecialization(String specialization) {
        return doctorRepository.findBySpecialization(specialization)
                .stream()
                .map(Doctor::toDto)
                .collect(Collectors.toList());
    }

    public DoctorDTO findById(Long id) {
        return doctorRepository.findById(id)
                .map(Doctor::toDto)
                .orElseThrow(() -> new IllegalStateException("Nie istnieje taki lekarz"));
    }

    public DoctorDTO findBySurname(String surname) {
        return doctorRepository.findBySurname(surname)
                .stream()
                .map(Doctor::toDto)
                .collect(Collectors.toList());
    }
}
