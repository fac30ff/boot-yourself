package com.github.fac30ff.ironbank;

@Configuration
public class IronConfiguration {
  @Bean
  public RavenListener ravenListener() {
    return new RavenListener();
  }
}
