package com.controller;
import org.springframework.data.repository.CrudRepository;  

public interface UserRepositary extends CrudRepository<UserRecord, String> {

}
