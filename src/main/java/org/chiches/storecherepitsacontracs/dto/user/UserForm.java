package org.chiches.storecherepitsacontracs.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserForm(
        @NotBlank(message = "Username cannot be blank")
        String username,

        @NotBlank(message = "Password cannot be blank")
        String password,

        @NotBlank(message = "Email cannot be blank")
        @Email(message = "Email must be valid")
        String email,

        @NotBlank(message = "Name cannot be blank")
        String name,

        @NotBlank(message = "Surname cannot be blank")
        String surname
) { }