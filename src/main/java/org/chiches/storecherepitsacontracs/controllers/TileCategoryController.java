package org.chiches.storecherepitsacontracs.controllers;

import org.chiches.storecherepitsacontracs.dto.tilecategory.TileCategoryForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/tile-categories")
public interface TileCategoryController {

    @GetMapping
    String getAll(Model model);

    @GetMapping(path = "create")
    String create(Model model);

    @PostMapping(path = "create")
    String create(
            @ModelAttribute("tileCategoryForm") TileCategoryForm tileCategoryForm,
            BindingResult bindingResult,
            Model model
    );

    @GetMapping(path = "update/{id}")
    String update(@PathVariable("id") Long id, Model model);

    @PostMapping(path = "update")
    String update(
            @RequestParam("id") Long id,
            @ModelAttribute("tileCategoryForm") TileCategoryForm tileCategoryForm,
            BindingResult bindingResult,
            Model model
    );
}
