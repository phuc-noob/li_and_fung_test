package com.liandfung.backend.service.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskResponseDTO {
    private String id;
    private String taskName;
    private String describe;
    private String createAt;
    private String status;
}
