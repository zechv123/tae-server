package kr.tae.server.controller;

import kr.tae.server.domain.AddVideos;
import kr.tae.server.repository.AddVideosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/videoinfo")
public class VideoInfoController {

    @Autowired
    private AddVideosRepository addVideosRepository;

    @RequestMapping(value = "")
    public String printNothing(ModelMap modelMap) {
        modelMap.addAttribute("result", "아직 없습니다!");
        return "videoinfo";
    }

/**
 * videolist 페이지에서 인자를 입력받지 않고, 테이블 자체 listing 에서 인자를 받아올 경우
 *
    @RequestMapping(value = "/{result}")
    public String printResult(@PathVariable String result, ModelMap modelMap) {
        modelMap.addAttribute("result", result);
        return "videoinfo";
    }
**/
    @RequestMapping(value = "/videonumber")
    public String redirectTo(HttpServletRequest request) {
        String videonumber = request.getParameter("videonumber");

        return "redirect:" + "/videoinfo" + "/videonumber/" + videonumber;
    }
    @RequestMapping(value = "/videonumber/{result}")
    public ModelAndView videoInfo(@PathVariable String result) {

        List<AddVideos> videoInfolist = addVideosRepository.findById(Integer.parseInt(result));
        ModelAndView modelAndView = new ModelAndView("videoinfo");
        modelAndView.addObject("videoinfo", videoInfolist);
        return modelAndView;

    }
}
