package com.j3ware.sf.restful_webservices.repositories;

import com.j3ware.sf.restful_webservices.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {


}
