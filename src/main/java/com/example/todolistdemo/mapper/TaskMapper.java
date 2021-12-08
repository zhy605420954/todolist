package com.example.todolistdemo.mapper;

import com.example.todolistdemo.pojo.Task;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TaskMapper {

    List<Task> queryTaskByUserId(int userId);
    List<Task> queryTaskByListId(int taskListId);
    int addTask(Task task);
    int UpdateTask(Task task);
    int deleteTask(int taskId);

}
