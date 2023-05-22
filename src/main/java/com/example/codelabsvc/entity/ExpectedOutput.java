package com.example.codelabsvc.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "expected-output")
public class ExpectedOutput {

    private String id;

    private String path;

    private String content;
}
