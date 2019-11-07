package com.jy.repository.wrapper;

import java.util.List;

import com.jy.vo.CategoryVO;

/**
 * @author jy
 * <p>
 * 2019年11月5日
 */
public interface CategoryWrapper {

    List<CategoryVO> findAllDetail();

    CategoryVO getCategoryDetail(Integer categoryId);
}
