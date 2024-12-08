package org.chiches.storecherepitsacontracs.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/catalogue")
public interface CatalogueController {
//    @GetMapping
//    String getCatalogue(Model model);

    @GetMapping("/category/{id}")
    String getTilesByCategory(@PathVariable Long id, Model model);
    @GetMapping
    String getCatalogue(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice,
            @RequestParam(required = false) String material,
            @RequestParam(defaultValue = "name") String sortBy,
            Model model
    );
}
