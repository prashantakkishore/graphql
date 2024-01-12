package com.example.service;

import com.example.response.StudentResponse;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public StudentResponse getStudent(long id){
        // this way even if consumer not asking for subjects it will be processed, use resolver instead.
//        List<SubjectResponse> subjectResponses = List.of(new SubjectResponse(1L ,"sub1", 1D)
//        ,new SubjectResponse(2L ,"sub2", 1D));
        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setId(id);
        studentResponse.setName("pks");
        studentResponse.setEmail("pks.ssd@gmail.com");
        return studentResponse;
    }

}
