package com.itccloud.mwccdc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String serverTime = LocalDateTime.now().format(formatter);

        model.addAttribute("name", "Samuel G.");
        model.addAttribute("major", "Cybersecurity");
        model.addAttribute("serverTime", serverTime);

        return "index-form.html";
