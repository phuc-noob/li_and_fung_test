package com.liandfung.backend.controller;

import com.liandfung.backend.service.TaskService;
import com.liandfung.backend.service.dto.TaskDTO;
import com.liandfung.backend.service.dto.response.TaskResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @Autowired
    TaskService taskService;
    @GetMapping("/{email}/tasks")
    public ResponseEntity<Page<TaskResponseDTO>> getListTaskByAccount(@PathVariable(name = "email") String email){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(taskService.getListTaskByAccount(email));
    }
}
