package com.example.codelabsvc.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Document(collection = "comment")
public class Comment extends EntityBase {
    @Id
    private String id;
    private String challengeId;
    private User user;
    private String text;
    private String code;


    public Comment( String challengeId, User user, String text, String code) {
        super(new Date().toString(),"" ,user.getUsername(),user.getUsername());
        this.challengeId = challengeId;
        this.user = user;
        this.text = text;
        this.code = code;
    }
}
