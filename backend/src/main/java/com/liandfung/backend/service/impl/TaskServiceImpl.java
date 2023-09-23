package com.liandfung.backend.service.impl;

import com.liandfung.backend.domain.Account;
import com.liandfung.backend.domain.Tasks;
import com.liandfung.backend.domain.enumeration.TaskStatus;
import com.liandfung.backend.repository.AccountRepository;
import com.liandfung.backend.repository.TaskRepository;
import com.liandfung.backend.service.TaskService;
import com.liandfung.backend.service.dto.TaskDTO;
import com.liandfung.backend.service.dto.response.TaskResponseDTO;
import com.liandfung.backend.service.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskRepository taskRepository;
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    TaskMapper taskMapper;
    @Override
    public TaskResponseDTO createNewTask(TaskDTO taskDTO) {
        Tasks tasks = taskMapper.mapDtoToEntity(taskDTO);
        Optional<Account> oAccount = accountRepository.findByEmail(taskDTO.getAsignTo());
        oAccount.ifPresent(account -> tasks.setAccount(account));
        tasks.setStatus(TaskStatus.TODO);
        taskRepository.saveAndFlush(tasks);
        return taskMapper.mapEntityToDto(tasks);
    }

    @Override
    public Page<TaskResponseDTO> getListTaskByAccount(String email) {
        Pageable pageable = PageRequest.of(0,20);
        Page taskList = taskRepository.findAllByEmail(email,pageable);
        return taskMapper.mapListEntityToDto(taskList);
    }
}
