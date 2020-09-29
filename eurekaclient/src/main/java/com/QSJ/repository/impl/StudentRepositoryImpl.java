package com.QSJ.repository.impl;

import com.QSJ.entity.Student;
import com.QSJ.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Package: com.QSJ.repository.impl
 * @ClassName: StudentRepositoryImpl
 * @Author: SamSung
 * @CreateTime: 2020-09-25 21:39
 * @Description:
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

   private static Map<Long,Student> map = null;

    static {
            map = new HashMap<>(5);
            map.put(1L,new Student(1L,"张三",18));
            map.put(2L,new Student(2L,"李四",19));
            map.put(3L,new Student(3L,"王五",20));
            map.put(4L,new Student(4L,"赵六",21));
            map.put(5L,new Student(5L,"钱七",22));
    }

    @Override
    public Collection<Student> findAll() {
        return map.values();
    }

    @Override
    public Student findById(long id) {
        return map.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        map.put(student.getId(),student);
    }

    @Override
    public void delete(long id) {
        map.remove(id);
    }
}
