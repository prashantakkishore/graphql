package com.example.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.response.StudentResponse;
import com.example.response.SubjectResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentResponseResolver implements GraphQLResolver<StudentResponse> {



    public List<SubjectResponse> getSubjects(StudentResponse studentResponse){
        Long id = studentResponse.getId();
        // fetch subjects based on student id, JPA lazy loading
        return List.of(new SubjectResponse(1L ,"sub1", 1D)
        ,new SubjectResponse(2L ,"sub2", 1D));
    }

}
