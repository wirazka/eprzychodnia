package pl.sda.eprzychodnia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.eprzychodnia.entity.Doctor;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    List<Doctor> findBySpecialization(String searchedSpecialization);
    List<Doctor> findBySurname(String searchedSurname);
}
