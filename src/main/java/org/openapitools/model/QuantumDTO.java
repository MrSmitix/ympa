package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр &#x60;quantum&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json {   \&quot;offers\&quot;: [     {       \&quot;offerId\&quot;: \&quot;08e35dc1-89a2-11e3-8055-0015e9b8c48d\&quot;,       \&quot;quantum\&quot;: {}     }   ] } &#x60;&#x60;&#x60;  {% endcut %} 
 */

@Schema(name = "QuantumDTO", description = "Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр `quantum`.  {% cut \"Пример\" %}  ```json {   \"offers\": [     {       \"offerId\": \"08e35dc1-89a2-11e3-8055-0015e9b8c48d\",       \"quantum\": {}     }   ] } ```  {% endcut %} ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QuantumDTO {

  private Integer minQuantity;

  private Integer stepQuantity;

  public QuantumDTO minQuantity(Integer minQuantity) {
    this.minQuantity = minQuantity;
    return this;
  }

  /**
   * Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать. 
   * minimum: 1
   * @return minQuantity
   */
  @Min(1) 
  @Schema(name = "minQuantity", description = "Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minQuantity")
  public Integer getMinQuantity() {
    return minQuantity;
  }

  public void setMinQuantity(Integer minQuantity) {
    this.minQuantity = minQuantity;
  }

  public QuantumDTO stepQuantity(Integer stepQuantity) {
    this.stepQuantity = stepQuantity;
    return this;
  }

  /**
   * На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту. 
   * minimum: 1
   * maximum: 100
   * @return stepQuantity
   */
  @Min(1) @Max(100) 
  @Schema(name = "stepQuantity", description = "На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stepQuantity")
  public Integer getStepQuantity() {
    return stepQuantity;
  }

  public void setStepQuantity(Integer stepQuantity) {
    this.stepQuantity = stepQuantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuantumDTO quantumDTO = (QuantumDTO) o;
    return Objects.equals(this.minQuantity, quantumDTO.minQuantity) &&
        Objects.equals(this.stepQuantity, quantumDTO.stepQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minQuantity, stepQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuantumDTO {\n");
    sb.append("    minQuantity: ").append(toIndentedString(minQuantity)).append("\n");
    sb.append("    stepQuantity: ").append(toIndentedString(stepQuantity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

