package com.example.todolistdemo.controller;

import com.example.todolistdemo.mapper.TaskMapper;
import com.example.todolistdemo.pojo.Task;
import com.example.todolistdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskMapper taskMapper;

    @GetMapping("/queryTaskByUserId/{userId}")
    public List<Task> queryTaskByUserId(@PathVariable("userId") int userId){
        List<Task> taskList =taskMapper.queryTaskByUserId(userId);
        for(Task task :taskList){
            System.out.println(task);
        }
        return taskList;
    }

    @GetMapping("/queryTaskByListId/{taskListId}")
    public List<Task> queryTaskByListId(@PathVariable("taskListId") int taskListId){
        List<Task> taskList =taskMapper.queryTaskByListId(taskListId);
        for(Task task :taskList){
            System.out.println(task);
        }
        return taskList;
    }

    @GetMapping("/deleteTask/{taskId}")
    public String deleteTask(@PathVariable("taskId") int taskId){
        taskMapper.deleteTask(taskId);
        return "Delete OK";

    }

    @GetMapping("/addTask")
    public String addTask(){
        taskMapper.addTask(new Task(3,"跑步100米",1,1,"跑步100m",new Date(),new Date(2021,12,30,22,19,35),1));
        return "ok";
    }

    @GetMapping("/UpdateTask")
    public String UpdateTask(){
        taskMapper.UpdateTask(new Task(3,"跑步50000米",1,1,"跑步100m",new Date(),new Date(2021,12,30,22,19,35),1));
        return "Update OK";
    }



}
