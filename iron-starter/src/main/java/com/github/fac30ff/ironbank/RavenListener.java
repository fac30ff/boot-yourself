package com.github.fac30ff.ironbank;

import com.github.fac30ff.ironbank.annotation.ConditionOnProduction;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * this starter was loaded by EnableAutoConfigurationImportSelector.class
 * it uses SpringFactoriesLoader interface that scan spring.factories
 */

@RequiredArgsConstructor
public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {
  private final RavenProperties ravenProperties;

  @Override
  @ConditionOnProduction
  public void onApplicationEvent(ContextRefreshedEvent event) {
    ravenProperties.getКуда().forEach(s -> System.out.println("отправляем ворона ... в " + s));
  }
}
