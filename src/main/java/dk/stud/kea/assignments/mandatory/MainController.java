package dk.stud.kea.assignments.mandatory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class MainController {
  private final TodoNoteRepository repo;
  private final String NOTES = "notes";

  public MainController(TodoNoteRepository todoNoteRepository) {
    this.repo = todoNoteRepository;
  }

  @GetMapping("/")
  public String showAllNotes(Model model) {
    model.addAttribute("notesList", repo.findAll());

    return NOTES;
  }

  @PostMapping("/")
  public String saveNewNote(@RequestParam("date")String date,
                            @RequestParam("note")String text) {

    TodoNote newNote = new TodoNote();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    newNote.setDate(LocalDate.parse(date, formatter));
    newNote.setText(text);

    repo.save(newNote);
    return "redirect:/";
  }

  @GetMapping("/delete/{id}")
  public String deleteNote(@PathVariable("id") int noteId) {
    repo.deleteById(noteId);

    return "redirect:/";
  }

}
