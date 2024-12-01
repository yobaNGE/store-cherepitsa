package org.chiches.storecherepitsacontracs.dto.tile;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record TileForm(
        @NotBlank(message = "Name cannot be blank")
        String name,

        @NotNull(message = "Price cannot be null")
        @Positive(message = "Price must be positive")
        Double price,

        @NotBlank(message = "Material cannot be blank")
        String material,

        @NotNull(message = "Category ID cannot be null")
        Long categoryId,

        @NotBlank(message = "Description cannot be blank")
        String description
) {
}