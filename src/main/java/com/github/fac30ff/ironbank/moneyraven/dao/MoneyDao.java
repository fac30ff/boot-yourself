package com.github.fac30ff.ironbank.moneyraven.dao;

import com.github.fac30ff.ironbank.moneyraven.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoneyDao extends JpaRepository<Bank, String> {
}
