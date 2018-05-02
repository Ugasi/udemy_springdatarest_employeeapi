package fi.springdatarest.employee.repos;

import fi.springdatarest.employee.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
