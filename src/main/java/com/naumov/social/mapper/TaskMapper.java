package com.naumov.social.mapper;

import com.naumov.social.dto.TaskDto;
import com.naumov.social.model.Task;

public interface TaskMapper {
    Task taskDtoToTask(TaskDto taskDto);
}
