package com.example.crudapp2.Controller;

import com.example.crudapp2.Model.StudentEntity;
import com.example.crudapp2.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;
    @PostMapping("/student")
    public String createStudent(@RequestBody StudentEntity student) {

        service.createStudent(student);
        return "Student Record created with Id : " +student.getSId();
    }
    @GetMapping("/student")
    public List<StudentEntity> getStudents(){
        return service.getStudents();
    }
    @GetMapping("/student/{id}")
    public Optional<StudentEntity> getStudentById(@PathVariable int id){
        return  service.getStudentById(id);
    }
    @PutMapping("/student/{id}")
    public String updateStudent(@RequestBody StudentEntity updatedStudent,@PathVariable int id){
        service.updateStudent(updatedStudent,id);
        return "Student Standard updated with "+updatedStudent.getStandard();
    }
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
        return "Student record deleted  with id "+id;
    }
}
