package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр `quantum`.  {% cut \"Пример\" %}  ```json {   \"offers\": [     {       \"offerId\": \"08e35dc1-89a2-11e3-8055-0015e9b8c48d\",       \"quantum\": {}     }   ] } ```  {% endcut %} 
 **/
@ApiModel(description="Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр `quantum`.  {% cut \"Пример\" %}  ```json {   \"offers\": [     {       \"offerId\": \"08e35dc1-89a2-11e3-8055-0015e9b8c48d\",       \"quantum\": {}     }   ] } ```  {% endcut %} ")

public class QuantumDTO  {
  
  @ApiModelProperty(value = "Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать. ")
 /**
   * Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать. 
  **/
  private Integer minQuantity;

  @ApiModelProperty(value = "На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту. ")
 /**
   * На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту. 
  **/
  private Integer stepQuantity;
 /**
   * Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать. 
   * minimum: 1
   * @return minQuantity
  **/
  @JsonProperty("minQuantity")
 @Min(1)  public Integer getMinQuantity() {
    return minQuantity;
  }

  public void setMinQuantity(Integer minQuantity) {
    this.minQuantity = minQuantity;
  }

  public QuantumDTO minQuantity(Integer minQuantity) {
    this.minQuantity = minQuantity;
    return this;
  }

 /**
   * На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту. 
   * minimum: 1
   * maximum: 100
   * @return stepQuantity
  **/
  @JsonProperty("stepQuantity")
 @Min(1) @Max(100)  public Integer getStepQuantity() {
    return stepQuantity;
  }

  public void setStepQuantity(Integer stepQuantity) {
    this.stepQuantity = stepQuantity;
  }

  public QuantumDTO stepQuantity(Integer stepQuantity) {
    this.stepQuantity = stepQuantity;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

