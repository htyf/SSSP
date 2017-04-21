package zyf.springdata.dao;

import org.springframework.data.repository.Repository;

import zyf.springdata.entity.AccountInfo;



public interface UserDao extends Repository<AccountInfo, Long> { 
    public AccountInfo save(AccountInfo accountInfo); 
 }


