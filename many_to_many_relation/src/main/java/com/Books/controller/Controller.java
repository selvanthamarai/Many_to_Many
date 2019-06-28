package com.Books.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Books.model.Books;
import com.Books.model.Person;
import com.Books.service.Service;

@RestController
@RequestMapping("book")
public class Controller {
@Autowired
	Service service;
	
@PostMapping("insert")
public Books adds(@RequestBody Books B) {
	return service.addsDetail(B);
	
}


@PostMapping("add")
public Person add(@RequestBody Person A) {
	return service.addDetail(A);

}


}
