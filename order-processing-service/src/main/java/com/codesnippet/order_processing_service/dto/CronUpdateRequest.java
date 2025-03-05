package com.codesnippet.order_processing_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CronUpdateRequest {
    private String taskName;
    private String cronExpression;


}
