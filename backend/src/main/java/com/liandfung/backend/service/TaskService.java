package com.liandfung.backend.service;

import com.liandfung.backend.service.dto.TaskDTO;
import com.liandfung.backend.service.dto.response.TaskResponseDTO;
import org.springframework.data.domain.Page;

public interface TaskService {
    TaskResponseDTO createNewTask(TaskDTO taskDTO);
    Page<TaskResponseDTO> getListTaskByAccount(String email);
}
