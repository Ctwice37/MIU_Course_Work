package miu.edu.mystudentmgmtapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "transcripts")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Transcript {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transcriptId;
    private String degreeTitle;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "FK_StudentId")
    private Student student;

    public Transcript(Long transcriptId, String degreeTitle) {
        this.transcriptId = transcriptId;
        this.degreeTitle = degreeTitle;


    }
}
