
package com.innovate.department.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovate.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByDepartmentId(Long departmentId);

}
