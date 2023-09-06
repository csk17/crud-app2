package com.example.crudapp2.Service;
import com.example.crudapp2.Model.StudentEntity;
import com.example.crudapp2.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;
    public String createStudent(StudentEntity student){
        repository.save(student);
        return "Record created with Student id : " + student.getSId();
    }
    public List<StudentEntity> getStudents(){
        return repository.findAll();
    }
    public Optional<StudentEntity> getStudentById(int id){
        return repository.findById(id);
    }
    public String updateStudent(StudentEntity updatedStudent,int id){
        Optional<StudentEntity> existingStudent= repository.findById(id);
        if(existingStudent.isPresent()){
            StudentEntity student=existingStudent.get();
            student.setStandard(updatedStudent.getStandard());
            repository.save(student);
            return " Student Standard has been updated with :"+student.getStandard();
        }else{
            return "Student record does not exist ";
        }
    }
    public String deleteStudent(int id){
        repository.deleteById(id);
        return "Student record deleted  ";
    }
}