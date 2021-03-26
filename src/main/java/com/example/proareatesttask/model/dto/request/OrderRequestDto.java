package com.example.proareatesttask.model.dto.request;

import java.util.List;
import lombok.Data;

@Data
public class OrderRequestDto {
    private List<String> productNames;
    private Long userId;
}
