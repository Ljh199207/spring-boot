package com.erma.service;

import com.erma.model.Account;

public interface AccountService {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    int update2(double money, int id);

    void trsef();
}
