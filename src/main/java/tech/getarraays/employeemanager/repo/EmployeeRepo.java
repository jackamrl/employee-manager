package tech.getarraays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarraays.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployyeById(Long id);
}
