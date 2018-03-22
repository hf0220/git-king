package com.hjl.mapper;

import com.hjl.entity.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface  AccountMapper {

    int save(Account account);
    Account findById(int id);
    List<Account> findAll();
    List<Account> page(Map<String, Integer> map);
    List<Account> page2(int start, int size);
    List<Account> page3(@Param("start") int start, @Param("size") int size);
    int update(Account account);
    int delById(int id);







}
