package com.github.fac30ff.ironbank.annotation;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

public class OnRavenConditional extends AllNestedConditions {
  public OnRavenConditional() {
    super(ConfigurationPhase.REGISTER_BEAN);
  }

  @ConditionalOnProperty("ворон.куда")
  public static class R {
  }

  @ConditionalOnProperty(value = "ворон.вкл", havingValue = "true")
  public static class L {
  }
}
