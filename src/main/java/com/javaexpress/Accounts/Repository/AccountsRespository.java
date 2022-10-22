package com.javaexpress.Accounts.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaexpress.Accounts.model.Accounts;
@Repository
public interface AccountsRespository extends CrudRepository<Accounts, Integer> {

}
