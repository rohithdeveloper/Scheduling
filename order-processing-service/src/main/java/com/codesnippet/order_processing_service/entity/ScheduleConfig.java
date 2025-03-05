package com.codesnippet.order_processing_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "schedule_config")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleConfig {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskName;
    private String cronExpression;


}
