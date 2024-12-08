package org.chiches.storecherepitsacontracs.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public interface MainController {
    @GetMapping
    public String getMainPage(Model model);
}
