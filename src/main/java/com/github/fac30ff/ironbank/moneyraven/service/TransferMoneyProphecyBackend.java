package com.github.fac30ff.ironbank.moneyraven.service;

import com.github.fac30ff.ironbank.moneyraven.dao.MoneyDao;
import com.github.fac30ff.ironbank.moneyraven.model.Bank;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class TransferMoneyProphecyBackend implements TransferMoneyService {
  private final MoneyDao moneyDao;
  private final ProphetService prophet;

  @Override
  public long transfer(String addresseeName, long amount) {
    Bank bank = moneyDao.findAll().get(0);

    if (bank.getTotalAmount() > amount && prophet.willSurvive(addresseeName)) {
      bank.credit(amount);
      return moneyDao.save(bank).getTotalAmount();
    }

    return -1;
  }

}