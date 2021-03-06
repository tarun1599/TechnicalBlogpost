package com.upgrad.TechnicalBlog.controller;

import com.upgrad.TechnicalBlog.model.Post;
import com.upgrad.TechnicalBlog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String getAllPost(Model model){

        ArrayList<Post> posts = postService.getAllPosts();

        model.addAttribute("posts",posts);

        return "index";
    }
}
