package com.funky.Funky.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.NumberFormat;

import java.time.LocalDateTime;

@Document(collection = "User")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    public String id;

    @NotBlank
    private String name;

    @NotBlank
    @UniqueElements
    @Email
    private String email;

    @NotBlank
    @NumberFormat
    private int age;

    @NotBlank
    @UniqueElements
    private String phone;

    private String profile_pic;

    @NotBlank
    private LocalDateTime joining_time;
}
