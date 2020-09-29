package com.QSJ.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Package: com.QSJ.entity
 * @ClassName: Student
 * @Author: SamSung
 * @CreateTime: 2020-09-25 21:28
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;
}
