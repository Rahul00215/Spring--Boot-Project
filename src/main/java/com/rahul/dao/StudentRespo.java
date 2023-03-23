package com.rahul.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.rahul.Model.StudentMod;

@Repository
public interface StudentRespo extends CrudRepository<StudentMod, Long>{

}
