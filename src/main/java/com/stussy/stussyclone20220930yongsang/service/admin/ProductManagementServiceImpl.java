package com.stussy.stussyclone20220930yongsang.service.admin;

import com.stussy.stussyclone20220930yongsang.dto.admin.CategoryResponseDto;
import com.stussy.stussyclone20220930yongsang.dto.admin.ProductRegisterReqDto;
import com.stussy.stussyclone20220930yongsang.repository.admin.ProductManagementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductManagementServiceImpl implements ProductManagementService {

    private final ProductManagementRepository productManagementRepository;

    @Override
    public List<CategoryResponseDto> getCategoryList() throws Exception {
        return null;
    }

    @Override
    public void registerMst(ProductRegisterReqDto productRegisterReqDto) throws Exception{

    }
}
