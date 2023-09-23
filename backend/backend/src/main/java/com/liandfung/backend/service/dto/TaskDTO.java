package com.liandfung.backend.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDTO {
    private String taskName;
    private String asignTo;
    private String describe;
}
