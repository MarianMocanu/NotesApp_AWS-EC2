package dk.stud.kea.assignments.mandatory;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class TodoNote {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "text")
  private String text;

  @Column(name = "date")
  @DateTimeFormat(pattern = "dd-MMMM-yyyy")
  private LocalDate date;

  public TodoNote(String text, LocalDate date) {
    this.text = text;
    this.date = date;
  }

  public TodoNote() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

}
