package com.tupac.employeesAdminConsole.employeesAdminConsole.Repositories;

import com.tupac.employeesAdminConsole.employeesAdminConsole.Entities.Site;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteRepository extends CrudRepository<Site, Long> {
}
