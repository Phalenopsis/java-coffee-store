package com.intro.storecoffe.coffee;

import com.intro.storecoffe.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeService extends AbstractService<Coffee> {

    @Autowired
    public CoffeeService(CoffeeRepository repository) {
        super(repository);
    }

    @Override
    public Coffee update(Coffee entity, Long id) {
        Coffee originalEntity = getById(id);
        originalEntity.setName(entity.getName());
        originalEntity.setPrice(entity.getPrice());
        return repository.save(originalEntity);
    }
}
