package com.example.todolistdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskList {
    int Id;
    String Name;
    Integer UserId;
}
