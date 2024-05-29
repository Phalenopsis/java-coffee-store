package com.intro.storecoffe.coffee;

import com.intro.storecoffe.AbstractController;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/coffee")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CoffeeController extends AbstractController<Coffee> {

    @Autowired
    private CoffeeService service;

}
