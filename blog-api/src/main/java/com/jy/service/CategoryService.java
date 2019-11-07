package com.jy.service;

import java.util.List;

import com.jy.entity.Category;
import com.jy.vo.CategoryVO;

/**
 * @author jy
 * <p>
 * 2019年11月5日
 */
public interface CategoryService {

    List<Category> findAll();

    Category getCategoryById(Integer id);

    Integer saveCategory(Category category);

    Integer updateCategory(Category category);

    void deleteCategoryById(Integer id);

    List<CategoryVO> findAllDetail();

    CategoryVO getCategoryDetail(Integer categoryId);

}
