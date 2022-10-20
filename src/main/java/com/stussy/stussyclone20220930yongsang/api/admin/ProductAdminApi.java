package com.stussy.stussyclone20220930yongsang.api.admin;

import com.stussy.stussyclone20220930yongsang.aop.annotation.LogAspect;
import com.stussy.stussyclone20220930yongsang.aop.annotation.ValidAspect;
import com.stussy.stussyclone20220930yongsang.dto.CMRespDto;
import com.stussy.stussyclone20220930yongsang.dto.admin.ProductRegisterReqDto;
import com.stussy.stussyclone20220930yongsang.service.admin.ProductManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class ProductAdminApi {

    private final ProductManagementService productManagementService;


    @LogAspect
    @ValidAspect
    @PostMapping("/product")
    public ResponseEntity<?> registerProductMst(@Validated @RequestBody ProductRegisterReqDto productRegisterReqDto,
                                                BindingResult bindingResult) throws Exception {
        String name = productRegisterReqDto.getName();

        Random random = new Random();


        for(int i=0; i<100; i++){

            productRegisterReqDto.setCategory(i / 10 + i);
            productRegisterReqDto.setName(name + (i + 1));
            productRegisterReqDto.setPrice(random.nextInt(random.nextInt(10) + 1)* 100000);
            productManagementService.registerMst(productRegisterReqDto);
        }

        productManagementService.registerMst(productRegisterReqDto);

        return ResponseEntity.created(null)
                .body(new CMRespDto<>("Register Successfully", true));
    }
    @GetMapping("/product/category")
    public ResponseEntity<?> getCategoryList() throws Exception {
        return ResponseEntity.ok()
                .body(new CMRespDto<>("Get Successfully", productManagementService.getCategoryList()));
    }
}
