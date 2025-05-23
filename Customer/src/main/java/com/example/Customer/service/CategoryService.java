package com.example.Customer.service;




import com.example.Customer.dto.CategoryDto;
import com.example.Customer.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Category save(Category category);

    Category update(Category category);

    List<Category> findAllByActivatedTrue();

    List<Category> findALl();

    Optional<Category> findById(Long id);

    void deleteById(Long id);

    void enableById(Long id);

    List<CategoryDto> getCategoriesAndSize();
}
