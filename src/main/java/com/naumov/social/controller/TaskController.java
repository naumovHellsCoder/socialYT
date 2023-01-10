package com.naumov.social.controller;

import com.naumov.social.dto.TaskDto;
import com.naumov.social.model.Task;
import com.naumov.social.service.TasksService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/tasks")
@AllArgsConstructor
public class TaskController {
    private final TasksService tasksService;
    @PostMapping(path = "/create",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Task> createTask(@RequestBody TaskDto taskDto){
        Task task = tasksService.createTask(taskDto);
        return ResponseEntity.ok(task);
    };

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Task> getTaskItem(@PathVariable("id") Long id){
        Task task = tasksService.getTaskById(id);
        return ResponseEntity.ok(task);
    }
}
