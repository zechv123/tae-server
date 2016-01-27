package kr.tae.server.controller;

import kr.tae.server.domain.Post;
import kr.tae.server.repository.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

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
        return "redirect:" + "/write";
    }
}

