package com.github.fac30ff.ironbank;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties("ворон")
public class RavenProperties {
  List<String> куда;
}
