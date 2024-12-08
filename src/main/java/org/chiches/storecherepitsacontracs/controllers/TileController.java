package org.chiches.storecherepitsacontracs.controllers;

import jakarta.validation.Valid;
import org.chiches.storecherepitsacontracs.dto.tile.CreateTileForm;
import org.chiches.storecherepitsacontracs.dto.tile.TileForm;
import org.chiches.storecherepitsacontracs.dto.tile.UpdateTileForm;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/tiles")
public interface TileController {

    @GetMapping(path = "create")
    String create(Model model);

    @PostMapping(path = "create")
    String create(
            @Valid @ModelAttribute("tileForm") CreateTileForm tileForm,
            BindingResult bindingResult,
            Model model
    );

    @GetMapping
    String getAll(Model model);

    @GetMapping(path = "update/{id}")
    String update(
            @PathVariable("id") Long id,
            Model model
    );

    @PostMapping(path = "update")
    String update(
            @Valid @ModelAttribute("updateTileForm") UpdateTileForm updateTileForm,
            BindingResult bindingResult,
            Model model
    );
    @GetMapping("details/{id}")
    String getTileDetails(@PathVariable("id") Long id, Model model);
}

