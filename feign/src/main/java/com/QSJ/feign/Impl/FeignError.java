package com.QSJ.feign.Impl;

import com.QSJ.entity.Student;
import com.QSJ.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @Package: com.QSJ.feign.Impl
 * @ClassName: FeignError
 * @Author: SamSung
 * @CreateTime: 2020-09-28 17:19
 * @Description:
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return  "服务器维护中......" ;
    }
}
