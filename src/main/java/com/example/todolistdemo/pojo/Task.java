package com.example.todolistdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    int Id;
    String Name;
    Integer UserId;
    Integer TaskListId;
    String Description;
    Date StartTime;
    Date EndTime;
    int State;





}
