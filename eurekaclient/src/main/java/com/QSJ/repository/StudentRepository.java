package com.QSJ.repository;

import com.QSJ.entity.Student;

import java.util.Collection;
import java.util.List;

/**
 * @Package: com.QSJ.repository
 * @ClassName: StudentRepository
 * @Author: SamSung
 * @CreateTime: 2020-09-25 21:30
 * @Description:
 */
public interface StudentRepository {
    Collection<Student> findAll();
    Student findById(long id);
    void saveOrUpdate(Student student);
    void delete(long id);
}
