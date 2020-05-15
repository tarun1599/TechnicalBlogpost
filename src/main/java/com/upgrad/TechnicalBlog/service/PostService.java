package com.upgrad.TechnicalBlog.service;

import com.upgrad.TechnicalBlog.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public ArrayList<Post> getAllPosts(){
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

        return posts;
    }

    public ArrayList<Post> getOnePost() {
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("This is your Post");
        post1.setBody("This is your Post. It has some valid content");
        post1.setDate(new Date());
        posts.add(post1);

        return posts;

    }
}
