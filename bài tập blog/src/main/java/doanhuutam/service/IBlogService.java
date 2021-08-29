package doanhuutam.service;

import doanhuutam.model.Blog;

import java.util.ArrayList;

public interface IBlogService {
    ArrayList<Blog> findAll();
    Blog save(Blog blog);

     void remove(Blog blog);
     Blog finById(long id);
}
