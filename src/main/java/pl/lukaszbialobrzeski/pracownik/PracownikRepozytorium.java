package pl.lukaszbialobrzeski.pracownik;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface PracownikRepozytorium extends JpaRepository<Pracownik,Integer>{
   Pracownik findOneById(Integer id);
}
