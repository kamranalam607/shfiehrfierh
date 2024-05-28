package com.signup.payload;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpDto {

    private String id;
    private String name;
    @NotEmpty
    @Size(min = 6,message = "username should be at least 6 character")
    private String username;
    @NotEmpty
    @Size(min = 15,message = "email should be at least 15 character")
    private String email;
    private String password;
}
