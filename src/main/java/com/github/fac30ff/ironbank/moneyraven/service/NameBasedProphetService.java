package com.github.fac30ff.ironbank.moneyraven.service;

import com.github.fac30ff.ironbank.moneyraven.ProfileConstants;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@Profile(ProfileConstants.ЗИМА_БЛИЗКО)
public class NameBasedProphetService implements ProphetService {

  @Override
  public boolean willSurvive(String name) {
    return !name.contains("Stark") && ThreadLocalRandom.current().nextBoolean();
  }

}
