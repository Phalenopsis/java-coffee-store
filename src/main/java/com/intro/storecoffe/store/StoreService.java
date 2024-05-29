package com.intro.storecoffe.store;

import com.intro.storecoffe.AbstractService;
import com.intro.storecoffe.coffee.Coffee;
import com.intro.storecoffe.coffee.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService extends AbstractService<Store> {
    @Autowired
    private CoffeeService coffeeService;
    @Autowired
    public StoreService(StoreRepository repository) {
        super(repository);
    }

    @Override
    public Store update(Store entity, Long id) {
        Store originalEntity = getById(id);
        originalEntity.setName(entity.getName());
        originalEntity.setLocation(entity.getLocation());
        originalEntity.setRating(entity.getRating());
        return repository.save(originalEntity);
    }

    public Store addCoffeeToStore(Long coffeeId, Long storeId) {
        Store store = getById(storeId);
        Coffee coffee = coffeeService.getById(coffeeId);
        store.addCoffee(coffee);
        return repository.save(store);
    }
}