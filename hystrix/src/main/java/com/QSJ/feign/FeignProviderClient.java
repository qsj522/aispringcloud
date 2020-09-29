package com.QSJ.feign;

import com.QSJ.entity.Student;
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
@FeignClient(value = "provider" )
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    @GetMapping("/student/index")
    String index();
}
