package com.intro.storecoffe.store;

import com.intro.storecoffe.AbstractController;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/store")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class StoreController extends AbstractController<Store> {
    @Autowired
    private StoreService service;

    @PatchMapping("{storeId}/addcoffee/{coffeeId}")
    public ResponseEntity<Store> addCoffeeToStore(
            @PathVariable("coffeeId") Long coffeeId,
            @PathVariable("storeId") Long storeId
    ) {
        return new ResponseEntity<>(service.addCoffeeToStore(coffeeId, storeId), HttpStatus.OK);
    }
}

