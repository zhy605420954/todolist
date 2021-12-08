package com.example.todolistdemo.controller;

import com.example.todolistdemo.mapper.TaskListMapper;
import com.example.todolistdemo.mapper.TaskMapper;
import com.example.todolistdemo.pojo.Task;
import com.example.todolistdemo.pojo.TaskList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskListController {
    @Autowired
    private TaskListMapper taskListMapper;

    @GetMapping("/queryTaskListByUserId/{UserId}")
    public List<TaskList> queryTaskListByUserId(@PathVariable("UserId") int userId){
        List<TaskList> taskLists =taskListMapper.queryTaskListByUserId(userId);
        for(TaskList tasklist :taskLists){
            System.out.println(tasklist);
        }
        return taskLists;
    }

//    @GetMapping("/queryTaskByListId/{Id}")
//    public List<Task> queryTaskByListId(@PathVariable("Id") int taskListId){
//        List<Task> taskList =taskListMapper.queryTaskByListId(taskListId);
//        for(Task task :taskList){
//            System.out.println(task);
//        }
//        return taskList;
//    }

    @GetMapping("/deleteTaskList/{taskListId}")
    public String deleteTask(@PathVariable("taskListId") int taskListId){
        taskListMapper.deleteTaskList(taskListId);
        return "Delete OK";

    }

    @GetMapping("/addTaskList")
    public String addTaskList(){
        taskListMapper.addTaskList(new TaskList(1,"生活",1));
        return "ok";
    }

    @GetMapping("/updateTaskList")
    public String updateTaskList(){
        taskListMapper.updateTaskList(new TaskList(1,"工作",1));
        return "Update OK";
    }

}
