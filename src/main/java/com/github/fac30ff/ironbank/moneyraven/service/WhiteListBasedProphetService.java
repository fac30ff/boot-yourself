package com.github.fac30ff.ironbank.moneyraven.service;

import com.github.fac30ff.ironbank.moneyraven.ProfileConstants;
import com.github.fac30ff.ironbank.moneyraven.model.ProphetProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(ProfileConstants.ЗИМА_ТУТА)
@RequiredArgsConstructor
public class WhiteListBasedProphetService implements ProphetService {
  private final ProphetProperties prophetProperties;

  @Override
  public boolean willSurvive(String name) {
    return prophetProperties.getТеКтоВозвращаютДолги().contains(name);
  }

}
