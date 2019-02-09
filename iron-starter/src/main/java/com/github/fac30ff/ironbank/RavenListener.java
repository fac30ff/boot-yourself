package com.github.fac30ff.ironbank;

public class RavenListener implements ApplicationListener<ContexRefreshedEvent> {
  @Override
  public void onApplicationEvent(ContexRefreshedEvent event) {
    System.out.println("отправляем ворона ...");
  }
}
