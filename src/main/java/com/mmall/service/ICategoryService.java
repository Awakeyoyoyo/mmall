package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;
import java.util.Set;

public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId,String categoryName);

    ServerResponse<List<Category>> getChildParallelCtegory(Integer parent_Id);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);

}
