package doanhuutam.controller;

import doanhuutam.model.Blog;
import doanhuutam.model.Category;
import doanhuutam.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import doanhuutam.service.IBlogService;

import java.util.ArrayList;

@Controller
public class BlogServiceController {
    @Autowired
    IBlogService iBlogService;
    @Autowired
    ICategoryService iCategoryService;

    @GetMapping("/home")
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("blogs", iBlogService.findAll());
        return modelAndView;
    }
    @ModelAttribute("categories")
    public ArrayList<Category> listCate(){
        return iCategoryService.finAll();
    }

    @GetMapping("create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("list", new Blog());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute("list") Blog blog) {
        iBlogService.save(blog);
        return new ModelAndView("redirect:/home");
    }

    @GetMapping("delete/{id}")
    public ModelAndView showdelete(@PathVariable long id) {
        iBlogService.remove(iBlogService.finById(id));
        return new ModelAndView("redirect:/home");
    }

    @GetMapping("edit/{id}")
    public ModelAndView showedit(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("list", iBlogService.finById(id));
        return modelAndView;

    }

    @PostMapping("edit/{id}")
    public ModelAndView edit(@ModelAttribute("list") Blog blog) {
        iBlogService.save(blog);
        return new ModelAndView("redirect:/home");
    }



}
