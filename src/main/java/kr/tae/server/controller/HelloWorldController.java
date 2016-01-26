package kr.tae.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {

    @RequestMapping(value = "")
    public String printHelloWorld(ModelMap modelMap) {
        modelMap.addAttribute("text", "Hello world!");
        return "helloworld";
    }

    @RequestMapping(value = "/{text}")
    public String printText(@PathVariable String text, ModelMap modelMap) {
        modelMap.addAttribute("text", text);
        return "helloworld";
    }
}