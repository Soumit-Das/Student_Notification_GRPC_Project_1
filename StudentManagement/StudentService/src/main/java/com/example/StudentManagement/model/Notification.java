package com.example.StudentManagement.model;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Notification {

    private String notificationType;
    private Student payload;
    private LocalDate createdOn;

    @Override
    public String toString()
    {
        return "Notification : { notificationType : "+this.notificationType+", payload : "+this.payload+", createdOn : "+this.createdOn+" }";
    }
}
