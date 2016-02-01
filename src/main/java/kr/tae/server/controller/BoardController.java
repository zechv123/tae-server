package kr.tae.server.controller;

import kr.tae.server.domain.Post;
import kr.tae.server.repository.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private PostRepository postRepository;

    @RequestMapping(value = "/write")
    public String write() {
        return "write";
    }

    @RequestMapping(value = "/save")
    public String save(HttpServletRequest request) {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        Post post = new Post(title, content);
        postRepository.save(post);
        return "redirect:" + "/list";
    }

    @RequestMapping(value = "/list")
    public ModelAndView list() {
        List<Post> postList = postRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("postList", postList);
        return modelAndView;
    }

    @RequestMapping(value = "/view/{id}")
    public String view(@PathVariable String id, ModelMap model) {
        List<Post> postList = postRepository.findById(new Long(id));
        if (id != null && !id.isEmpty() && postList.size() != 0) {
            Post post = postList.get(0);
            model.addAttribute("_id", post.getId());
            model.addAttribute("title", post.getTitle());
            model.addAttribute("content", post.getContent());
        }
        return "view";
    }

    @RequestMapping(value = "/delete")
    public String delete(HttpServletRequest request) {
        postRepository.deleteById(new Long(request.getParameter("id")));

        return "redirect:" + "/list";
    }

    @RequestMapping(value = "/updating/{id}")
    public String updating(@PathVariable String id, ModelMap model) {
        model.addAttribute("_id", id);
        return "updating";
    }

    @RequestMapping(value = "/update")
    public String update(HttpServletRequest request) {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        long id = new Long(request.getParameter("id"));

        List<Post> postList = postRepository.findById(id);
        Post post = postList.get(0);
        post.setTitle(title);
        post.setContent(content);
        postRepository.save(post);

        return "redirect:" + "/view/" + id;
    }
}

