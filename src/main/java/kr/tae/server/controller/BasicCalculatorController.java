package kr.tae.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/basiccalculator")
public class BasicCalculatorController {

    @RequestMapping(value = "/addition")
    public String addition(HttpServletRequest request) {
        Integer int1 = Integer.parseInt(request.getParameter("int1"));
        Integer int2 = Integer.parseInt(request.getParameter("int2"));
        String int3 = Integer.toString(int1 + int2);
        return "redirect:" + "/basiccalculator/" + int3;
    }

    @RequestMapping(value = "/multiplication")
    public String multiplication(HttpServletRequest request) {
        Integer int1 = Integer.parseInt(request.getParameter("int4"));
        Integer int2 = Integer.parseInt(request.getParameter("int5"));
        String int3 = Integer.toString(int1 * int2);
        return "redirect:" + "/basiccalculator/" + int3;
    }

    @RequestMapping(value = "")
    public String printNothing(ModelMap modelMap) {
        modelMap.addAttribute("result", "아직 없습니다!");
        return "basiccalculator";
    }

    @RequestMapping(value="/{result}")
    public String printResult(@PathVariable String result, ModelMap modelMap) {
        modelMap.addAttribute("result", result);
        return "basiccalculator";
    }


}