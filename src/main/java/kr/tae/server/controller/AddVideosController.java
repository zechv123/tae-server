package kr.tae.server.controller;

import kr.tae.server.domain.AddVideos;
import kr.tae.server.repository.AddVideosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AddVideosController {

    @RequestMapping(value = "/addvideos")
    public String addvideos() {return "addvideos";}

    @Autowired
    private AddVideosRepository addVideosRepository;

    @RequestMapping(value = "/video/basic/list")
    public ModelAndView videoBasicPropertyList() {
        List<AddVideos> postList = addVideosRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("video_basic_list");
        modelAndView.addObject("video_basic_list", postList);
        return modelAndView;
    }

    @RequestMapping(value = "/savevideo")
    public String save(HttpServletRequest request) {
        String title = request.getParameter("title");
        String url = request.getParameter("url");
        String creator = request.getParameter("creator");

        String recommender = request.getParameter("recommender");
        Short length = Short.parseShort(request.getParameter("length"));
        Integer youtubeTotalViews = Integer.parseInt(request.getParameter("youtubeTotalViews"));
        String preferSex = request.getParameter("preferSex");
        String preferAge = request.getParameter("preferAge");
        String description = request.getParameter("description");
        AddVideos addvideos = new AddVideos(title, url, creator, recommender, length, youtubeTotalViews, preferSex, preferAge, description);
        addVideosRepository.save(addvideos);
        return "redirect:" + "/videoslist";}

    @RequestMapping(value = "/videoslist")
    public ModelAndView videolist() {
        List<AddVideos> postList = addVideosRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("videoslist");
        modelAndView.addObject("videoslist", postList);
        return modelAndView;
    }
}


