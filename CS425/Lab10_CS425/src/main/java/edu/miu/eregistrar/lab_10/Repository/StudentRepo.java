package edu.miu.eregistrar.lab_10.Repository;

import edu.miu.eregistrar.lab_10.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
}
