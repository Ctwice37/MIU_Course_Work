package miu.edu.mystudentmgmtapp.repository;

import miu.edu.mystudentmgmtapp.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepo extends JpaRepository<Classroom, Long> {
}
