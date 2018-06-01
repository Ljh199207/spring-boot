package com.erma.controller;

import com.erma.model.Account;
import com.erma.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Mybatis")
public class AccountMybaisController {

    @Autowired
    AccountService accountService;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Account getModel(@PathVariable("id") Integer id)
    {
        return  accountService.selectByPrimaryKey(id);
    }
    @RequestMapping(value = "/trsef", method = RequestMethod.GET)
    public void tref()
    {
        accountService.trsef();
    }


}
