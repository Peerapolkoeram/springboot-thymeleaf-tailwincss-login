package com.tpk.ThymeleafSpringBoot.reporsitory;

import com.tpk.ThymeleafSpringBoot.dao.UsersDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersDao, Long> {

}
