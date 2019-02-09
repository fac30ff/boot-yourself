package com.github.fac30ff.ironbank.moneyraven.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class TransferMoneyProphecyBackend implements TransferMoneyService {
  @Override
  public boolean willSurvive(String name) {
    return !name.contains("Stark") && ThreadLocalRandom.current().nextBoolean();
  }
}
