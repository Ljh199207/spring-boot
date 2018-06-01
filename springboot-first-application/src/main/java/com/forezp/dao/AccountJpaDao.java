package com.forezp.dao;

import com.forezp.javabean.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountJpaDao extends JpaRepository<Account,Integer> {
}
