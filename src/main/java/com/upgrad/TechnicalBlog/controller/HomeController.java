package com.upgrad.TechnicalBlog.controller;

import com.upgrad.TechnicalBlog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getAllPost(Model model){

        ArrayList<Post> posts = new ArrayList<Post>();

        Post post1= new Post();
        post1.setTitle("My first post");
        post1.setBody("My first post detailed body");
        post1.setDate(new Date());

        Post post2= new Post();
        post2.setTitle("My second post");
        post2.setBody("My second post detailed body");
        post2.setDate(new Date());

        Post post3= new Post();
        post3.setTitle("My third post");
        post3.setBody("My third post detailed body");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        model.addAttribute("posts",posts);

        return "index";
    }
}
