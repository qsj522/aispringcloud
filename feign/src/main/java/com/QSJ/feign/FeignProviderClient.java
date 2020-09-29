package com.QSJ.feign;

import com.QSJ.entity.Student;
import com.QSJ.feign.Impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @Package: com.QSJ.feign
 * @ClassName: FeignProviderClient
 * @Author: SamSung
 * @CreateTime: 2020-09-28 16:59
 * @Description:
 */
@FeignClient(value = "provider" , fallback = FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    @GetMapping("/student/index")
    String index();
}
