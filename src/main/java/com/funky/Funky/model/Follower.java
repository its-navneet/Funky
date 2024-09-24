package com.funky.Funky.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Document(collection = "followers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Follower {

    @Id
    private String id;

    @NotBlank
    private Long userId;

    @NotBlank
    private List<String> followersId;
}
