package com.intro.storecoffe.employee;

import com.intro.storecoffe.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends AbstractService<Employee> {

    @Autowired
    private EmployeeRepository repository;

    public EmployeeService(JpaRepository<Employee, Long> repository) {
        super(repository);
    }

    @Override
    public Employee update(Employee entity, Long id) {
        Employee originalEntity = getById(id);
        originalEntity.setName(entity.getName());
        return repository.save(originalEntity);
    }
}
