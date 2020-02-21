package com.app.test.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping
    public ResponseEntity<String> get() {
        //MyEntity data = myService.getData();
        return new ResponseEntity<>("Hello Sarwan!", HttpStatus.OK);
    }

}
