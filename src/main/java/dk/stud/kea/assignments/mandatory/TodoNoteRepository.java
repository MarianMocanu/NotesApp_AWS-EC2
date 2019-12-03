package dk.stud.kea.assignments.mandatory;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoNoteRepository extends CrudRepository<TodoNote, Integer> {
  List<TodoNote> findAll();
}
