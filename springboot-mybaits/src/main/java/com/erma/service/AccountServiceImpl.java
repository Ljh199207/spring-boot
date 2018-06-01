package com.erma.service;

import com.erma.dao.AccountMapper;
import com.erma.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AccountServiceImpl  implements AccountService  {

    @Autowired
    AccountMapper accountMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Account record) {
        return 0;
    }

    @Override
    public int insertSelective(Account record) {
        return 0;
    }

    @Override
    public Account selectByPrimaryKey(Integer id) {
        return accountMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Account record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Account record) {
        return 0;
    }

    @Override
    @Transactional
    public int update2(double money, int id) {

     return 0;

    }
    @Override
    @Transactional
    public  void trsef()
    {
        accountMapper.update2(90,1);//用户1减10块 用户2加10块
        int i=1/0;
        accountMapper.update2(110,2);
    }
}
