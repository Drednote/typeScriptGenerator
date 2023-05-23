package ru.bcs.perseus.publishapi.api.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.lang.Nullable;

@AllArgsConstructor
@Data
public class ExampleDto {

  private String id;
  @Nullable
  private BigDecimal volume;
  private ExampleEnum anEnum;
  private LocalDateTime created; // <mapDate> = asDate - type Date, asNumber - type number, asString - type string
  private Map<String, String> fields;

}
