/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр `quantum`.  {% cut \"Пример\" %}  ```json {   \"offers\": [     {       \"offerId\": \"08e35dc1-89a2-11e3-8055-0015e9b8c48d\",       \"quantum\": {}     }   ] } ```  {% endcut %} 
 */

@ApiModel(description = "Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр `quantum`.  {% cut \"Пример\" %}  ```json {   \"offers\": [     {       \"offerId\": \"08e35dc1-89a2-11e3-8055-0015e9b8c48d\",       \"quantum\": {}     }   ] } ```  {% endcut %} ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QuantumDTO   {
  
  private Integer minQuantity;
  private Integer stepQuantity;

  /**
   * Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать. 
   * minimum: 1
   */
  public QuantumDTO minQuantity(Integer minQuantity) {
    this.minQuantity = minQuantity;
    return this;
  }

  
  @ApiModelProperty(value = "Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать. ")
  @JsonProperty("minQuantity")
  public Integer getMinQuantity() {
    return minQuantity;
  }
  public void setMinQuantity(Integer minQuantity) {
    this.minQuantity = minQuantity;
  }

  /**
   * На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту. 
   * minimum: 1
   * maximum: 100
   */
  public QuantumDTO stepQuantity(Integer stepQuantity) {
    this.stepQuantity = stepQuantity;
    return this;
  }

  
  @ApiModelProperty(value = "На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту. ")
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
    return Objects.equals(minQuantity, quantumDTO.minQuantity) &&
        Objects.equals(stepQuantity, quantumDTO.stepQuantity);
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

