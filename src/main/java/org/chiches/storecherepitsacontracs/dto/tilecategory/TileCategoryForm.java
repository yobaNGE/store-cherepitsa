package org.chiches.storecherepitsacontracs.dto.tilecategory;

import jakarta.validation.constraints.NotBlank;

public record TileCategoryForm(
        @NotBlank(message = "Name cannot be blank")
        String name
) { }