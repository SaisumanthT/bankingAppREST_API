package com.bankingApp.banking_app.repository;

import com.bankingApp.banking_app.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
    //import the class of the entity, first is the class name, and Long is the primary key's data type
}
