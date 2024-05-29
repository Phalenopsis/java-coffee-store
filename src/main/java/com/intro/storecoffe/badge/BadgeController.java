package com.intro.storecoffe.badge;

import com.intro.storecoffe.AbstractController;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/badge")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class BadgeController extends AbstractController<Badge> {

    @Autowired
    private BadgeService service;

}
