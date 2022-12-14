package com.stussy.stussyclone20220930yongsang.service.admin;


import com.stussy.stussyclone20220930yongsang.dto.admin.CategoryResponseDto;
import com.stussy.stussyclone20220930yongsang.dto.admin.ProductMstOptionRespDto;
import com.stussy.stussyclone20220930yongsang.dto.admin.ProductRegisterReqDto;

import java.util.List;

public interface ProductManagementService {

    public List<CategoryResponseDto> getCategoryList() throws Exception;
    public void registerMst(ProductRegisterReqDto productRegisterReqDto) throws Exception;

    public List<ProductMstOptionRespDto> getProductMstList() throws Exception;
}
