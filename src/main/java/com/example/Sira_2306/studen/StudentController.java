package com.example.Sira_2306.studen;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>();
    private  final AtomicLong counter = new AtomicLong();

    public StudentController() {
    }

    @GetMapping("/student")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/student/{id}")
    public Student getStudentsId(@PathVariable() long id) {
        return students.stream().filter(result -> result.getId() == id)
                .findFirst().orElseThrow(() -> new StudentNotFound(id));
    }

    //localhost:8080/student/search?name=nut
    @GetMapping("/student/search")
    public String getStudentsByName(@RequestParam(defaultValue = "Nut") String name) {
        return "search: " + name;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/student")
    public void addStudents(@RequestBody Student student) {
        students.add(new Student(counter.getAndIncrement(),student.getStudentnumber(), student.getName(),student.getLastname(),student.getDateofbirth()));
    }

    @PutMapping("/student/{id}")
    public void editStudents(@RequestBody Student student, @PathVariable long id) {
        students.stream().filter(result -> result.getId() == id).findFirst()
                .ifPresentOrElse(result -> {result.setName(student.getName() ); },() -> {throw new StudentNotFound(id);});
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/student/{id}")
    public void deleteStudents(@PathVariable long id) {
        students.stream().filter(result -> result.getId() == id).findFirst()
                .ifPresentOrElse(result -> {students.remove(result); }, () -> { throw new StudentNotFound(id);});
    }
}
