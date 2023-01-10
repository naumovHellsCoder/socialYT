package com.naumov.social.mapper;

import com.naumov.social.dto.TaskDto;
import com.naumov.social.model.Task;
import org.springframework.stereotype.Service;

@Service
public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task taskDtoToTask(TaskDto taskDto) {
        Task task = new Task();
        task.setUrlVideo(taskDto.getUrlVideo());
        task.setAllCountView(taskDto.getAllCountView());
        task.setDoneCountView(taskDto.getDoneCountView());
        return task;
    }
}
