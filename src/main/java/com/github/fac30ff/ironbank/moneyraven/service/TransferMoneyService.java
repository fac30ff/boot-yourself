package com.github.fac30ff.ironbank.moneyraven.service;

public interface TransferMoneyService {
  long transfer(String addresseeName, long amount);
}
