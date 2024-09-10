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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TurnoverType;



/**
 * Информация об оборачиваемости товара.
 */

@ApiModel(description = "Информация об оборачиваемости товара.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TurnoverDTO   {
  
  private TurnoverType turnover;
  private Double turnoverDays;

  /**
   */
  public TurnoverDTO turnover(TurnoverType turnover) {
    this.turnover = turnover;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("turnover")
  public TurnoverType getTurnover() {
    return turnover;
  }
  public void setTurnover(TurnoverType turnover) {
    this.turnover = turnover;
  }

  /**
   * Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
   */
  public TurnoverDTO turnoverDays(Double turnoverDays) {
    this.turnoverDays = turnoverDays;
    return this;
  }

  
  @ApiModelProperty(value = "Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)")
  @JsonProperty("turnoverDays")
  public Double getTurnoverDays() {
    return turnoverDays;
  }
  public void setTurnoverDays(Double turnoverDays) {
    this.turnoverDays = turnoverDays;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TurnoverDTO turnoverDTO = (TurnoverDTO) o;
    return Objects.equals(turnover, turnoverDTO.turnover) &&
        Objects.equals(turnoverDays, turnoverDTO.turnoverDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(turnover, turnoverDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TurnoverDTO {\n");
    
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
    sb.append("    turnoverDays: ").append(toIndentedString(turnoverDays)).append("\n");
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

