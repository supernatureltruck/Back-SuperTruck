package cap.capgemini.poe.aston.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cap.capgemini.poe.aston.entities.Home;

@Repository
public interface IHomeRepository  extends JpaRepository<Home, Long> {

}
