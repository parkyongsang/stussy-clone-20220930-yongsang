package com.stussy.stussyclone20220930yongsang.repository.admin;

import com.stussy.stussyclone20220930yongsang.domain.Product;
import com.stussy.stussyclone20220930yongsang.domain.ProductCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductManagementRepository {
    public List<ProductCategory> getCategoryList() throws Exception;
    public int saveProductMst(Product product) throws Exception;

}