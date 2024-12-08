package org.chiches.storecherepitsacontracs.dto.tile;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UpdateTileForm {
    private Long id;

    @NotBlank
    private String name;

    @NotNull
    private Double price;

    @NotBlank
    private String material;

    @NotNull
    private Long categoryId;

    private String description;

    public UpdateTileForm(Long id, String name, Double price, String material, Long categoryId, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.material = material;
        this.categoryId = categoryId;
        this.description = description;
    }

    public UpdateTileForm() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
