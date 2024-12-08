package org.chiches.storecherepitsacontracs.dto.tilecategory;

import jakarta.validation.constraints.NotBlank;

public class TileCategoryForm {
    @NotBlank
    private String name;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}