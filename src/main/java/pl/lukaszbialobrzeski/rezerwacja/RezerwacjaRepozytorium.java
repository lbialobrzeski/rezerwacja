package pl.lukaszbialobrzeski.rezerwacja;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;


@Transactional
public interface RezerwacjaRepozytorium extends JpaRepository<Rezerwacja, Integer> {

    Rezerwacja findOneById(Integer id);
}
