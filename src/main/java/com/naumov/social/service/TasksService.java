package com.naumov.social.service;

import com.naumov.social.dto.TaskDto;
import com.naumov.social.mapper.TaskMapperImpl;
import com.naumov.social.model.Task;
import com.naumov.social.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@AllArgsConstructor
public class TasksService {
    private final TaskRepository taskRepository;
    private final TaskMapperImpl taskMapper;
    public Task getTaskById(Long id){
        Task task = taskRepository.findById(id)
                .orElseThrow(()->{throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Task not found");
                });

        return task;
    }
    public Task createTask(TaskDto taskDto){
        Task task = taskMapper.taskDtoToTask(taskDto);
        Task taskSave = taskRepository.save(task);
        return taskSave;
    }
}
