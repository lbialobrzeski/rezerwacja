package pl.lukaszbialobrzeski.samochod;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface SamochodRepozytorium extends JpaRepository<Samochod, Integer> {

    Samochod findOneById(Integer id);
}
