package com.example.NotificationManagement.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class Students {
    @Id
    private int studentId;
    private String name;
    private int age;
    private String batch;
    private List<Address> address;
    @CreatedDate
    private Date createdAt;

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", batch='" + batch + '\'' +
                ", address=" + address +
                ", createdAt=" + createdAt +
                '}';
    }
}