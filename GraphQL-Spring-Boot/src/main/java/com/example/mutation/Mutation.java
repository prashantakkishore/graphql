package com.example.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.request.CreateStudentRequest;
import com.example.response.StudentResponse;
import org.springframework.stereotype.Service;

@Service
public class Mutation implements GraphQLMutationResolver {


    /**
     * Request
     *
     * mutation {
     *   createStudent(createStudentRequest: {
     *     name: "pks"
     *     email: "sas.sds.com"
     *     subjects: [
     *       {
     *         subject: "java"
     *         marks: 20.4
     *       },
     *       {
     *         subject: "sql"
     *         marks: 11.2
     *       }
     *     ]
     *   }) {
     *     id
     *     name
     *     email
     *     subjects {
     *       id
     *       subject
     *       marks
     *     }
     *   }
     * }
     *
     ***********************************
     *
     * Response
     *
     * {
     *   "data": {
     *     "createStudent": {
     *       "id": null,
     *       "name": "pks",
     *       "email": "sas.sds.com",
     *       "subjects": [
     *         {
     *           "id": 1,
     *           "subject": "sub1",
     *           "marks": 1
     *         },
     *         {
     *           "id": 2,
     *           "subject": "sub2",
     *           "marks": 1
     *         }
     *       ]
     *     }
     *   }
     * }
     */
    public StudentResponse createStudent(CreateStudentRequest createStudentRequest){
        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setEmail(createStudentRequest.getEmail());
        studentResponse.setName(createStudentRequest.getName());
        return studentResponse;
    }
}
