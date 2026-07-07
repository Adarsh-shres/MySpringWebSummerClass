package io.herald.MySpringWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //handles Http Requests: Get, Post, etc
public class MappingClass {
    @GetMapping("/") //url pattern for mapping
    public String openFirstPage()
    {
        return "firstPage.html";
    }
    @GetMapping("/nextPage")
    public  String openNextPage()
    {
        return "nextPage.html";
    }
    @GetMapping("/login")
    public String openLoginPage()
    {
        return "loginPage.html";
    }
}
