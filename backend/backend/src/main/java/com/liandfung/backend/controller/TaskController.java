package com.liandfung.backend.controller;

import com.liandfung.backend.service.TaskService;
import com.liandfung.backend.service.dto.TaskDTO;
import com.liandfung.backend.service.dto.response.TaskResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    TaskService taskService;
    @PostMapping
    public ResponseEntity<TaskResponseDTO> createNewTask(@RequestBody TaskDTO taskDTO){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(taskService.createNewTask(taskDTO));
    }


}
