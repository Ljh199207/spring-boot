package com.erma.dao;

import com.erma.model.Account;
import org.springframework.data.repository.query.Param;


public interface AccountMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    int update2(@Param("money") double money, @Param("id") int  id);
}