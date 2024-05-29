package com.intro.storecoffe.badge;

import com.intro.storecoffe.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BadgeService extends AbstractService<Badge> {

    @Autowired
    public BadgeService(BadgeRepository repository) {
        super(repository);
    }

    @Override
    public Badge update(Badge entity, Long id) {
        Badge originalEntity = getById(id);
        originalEntity.setName(entity.getName());
        return repository.save(originalEntity);
    }
}
