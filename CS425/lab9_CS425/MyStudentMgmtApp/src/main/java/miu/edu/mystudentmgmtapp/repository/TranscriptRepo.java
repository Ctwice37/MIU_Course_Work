package miu.edu.mystudentmgmtapp.repository;

import miu.edu.mystudentmgmtapp.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranscriptRepo extends JpaRepository<Transcript, Integer> {
}
