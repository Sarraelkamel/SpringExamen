package tn.esprit.examen.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.Entities.CoursClassroom;

public interface CoursClassroomRepository extends JpaRepository<CoursClassroom , Integer> {
}
