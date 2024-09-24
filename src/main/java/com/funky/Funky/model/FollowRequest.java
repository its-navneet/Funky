package com.funky.Funky.model;

import jakarta.validation.constraints.NotBlank;
import jdk.jfr.BooleanFlag;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Document(collection = "followRequests")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FollowRequest {

    @Id
    private String id;

    @NotBlank
    private Long senderUserId;

    @NotBlank
    private Long receiverUserId;

    @NotBlank
    @BooleanFlag
    private Boolean active;
}
