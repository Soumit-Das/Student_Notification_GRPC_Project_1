package com.example.StudentManagement.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Document(collection = "Student")
public class Student {
    @Id
    private int rollNum;
    private String studentName;
    private int age;
    private List<Address> address;

    @Override
    public String toString() {
        return "Student : { rollNum : "+this.rollNum+", studentName : "+this.studentName+", age : "+this.age+", address : "+this.address+"}";
    }
}
