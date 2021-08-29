package doanhuutam.service;

import doanhuutam.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import doanhuutam.repository.IBlogRepository;

import java.util.ArrayList;

public class BlogService implements IBlogService{
    @Autowired
    IBlogRepository iBlogRepository;

    @Override
    public ArrayList<Blog> findAll() {
        return (ArrayList<Blog>) iBlogRepository.findAll();
    }

    @Override
    public Blog save(Blog blog) {
        return iBlogRepository.save(blog);
    }

    @Override
    public void remove(Blog blog) {
        iBlogRepository.delete(blog);

    }

    @Override
    public Blog finById(long id) {
        return iBlogRepository.findById(id).get();
    }
}
