package miu.edu.mystudentmgmtapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "classrooms")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classroomId;
    private String buildingName;
    private String roomNumber;

    @OneToMany(mappedBy = "classroom", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Student> students;

    public Classroom(Integer classroomId, String buildingName, String roomNumber) {
        this.classroomId = classroomId;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }
}
