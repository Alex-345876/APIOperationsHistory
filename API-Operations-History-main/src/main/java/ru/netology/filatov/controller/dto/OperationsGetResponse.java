package ru.netology.filatov.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class OperationsGetResponse {
    private final Map<CustomerDTO, List<OperationDTO>> statement;
}
