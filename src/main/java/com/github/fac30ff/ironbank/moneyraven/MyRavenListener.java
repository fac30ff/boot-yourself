package com.github.fac30ff.ironbank.moneyraven;

import com.github.fac30ff.ironbank.RavenListener;
import com.github.fac30ff.ironbank.RavenProperties;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyRavenListener extends RavenListener {
  public MyRavenListener(RavenProperties ravenProperties) {
    super(ravenProperties);
  }

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    System.out.println("event= " + event);
  }
}
