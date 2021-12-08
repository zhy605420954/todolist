package com.example.todolistdemo.mapper;

import com.example.todolistdemo.pojo.TaskList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TaskListMapper {
    //通过用户Id查询
    List<TaskList> queryTaskListByUserId(int userId);
    int addTaskList(TaskList taskList);
    int updateTaskList(TaskList taskList);
    int deleteTaskList(int taskListId);


}
