package com.example.MiniProject.htmlcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
public class HtmlController {

    @Autowired
    HtmlService htmlService;

    HtmlController(HtmlService htmlService) {
        this.htmlService = htmlService;
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World!";
    }

    @PostMapping("/generateLabel")
    public void getHtmlValues(@RequestBody Html html, @RequestParam String type) throws IOException {
        htmlService.manipulateHtml(html, type);
    }
}
