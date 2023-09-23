package com.liandfung.backend.service.mapper;

import com.liandfung.backend.domain.Tasks;
import com.liandfung.backend.service.dto.TaskDTO;
import com.liandfung.backend.service.dto.response.TaskResponseDTO;
import com.liandfung.backend.utils.CommonDataUtil;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;

@Service
public class TaskMapper {
    public Tasks mapDtoToEntity(TaskDTO taskDTO){
        Tasks tasks = CommonDataUtil.getModelMapper().map(taskDTO, Tasks.class);
        return tasks;
    }

    public TaskResponseDTO mapEntityToDto(Tasks tasks){
        TaskResponseDTO responseDTO = CommonDataUtil.getModelMapper().map(tasks,TaskResponseDTO.class);
        responseDTO.setCreateAt(CommonDataUtil.convertDateToString(tasks.getCreatedDate()));
        return responseDTO;
    }

    public Page<TaskResponseDTO> mapListEntityToDto(Page<Tasks> tasks){
        return tasks.map(this::mapEntityToDto);
    }
}
