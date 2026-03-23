package com.workintech.zoo.exceptions;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZooErrorResponse {

    private int status;
    private String message;
    private long timestamp;
}