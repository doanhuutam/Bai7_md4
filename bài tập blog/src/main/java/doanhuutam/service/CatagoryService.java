package doanhuutam.service;

import doanhuutam.model.Category;
import doanhuutam.repository.ICategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CatagoryService implements ICategoryService{
    @Autowired
    ICategoryRepo iCategoryRepo;
    @Override
    public ArrayList<Category> finAll() {
        return (ArrayList<Category>) iCategoryRepo.findAll();
    }
}
