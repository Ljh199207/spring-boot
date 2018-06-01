package com.forezp.controller;

import com.forezp.javabean.Account;
import com.forezp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mybaits")
public class AccountMybaitsController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Account select(@PathVariable("id") Integer id) {
        return  accountService.selectByPrimaryKey(id);
    }
}
