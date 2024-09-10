package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.TurnoverType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация об оборачиваемости товара.
 **/
@ApiModel(description="Информация об оборачиваемости товара.")

public class TurnoverDTO  {
  
  @ApiModelProperty(required = true, value = "")
  private TurnoverType turnover;

  @ApiModelProperty(value = "Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)")
 /**
   * Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
  **/
  private Double turnoverDays;
 /**
   * Get turnover
   * @return turnover
  **/
  @JsonProperty("turnover")
  public TurnoverType getTurnover() {
    return turnover;
  }

  public void setTurnover(TurnoverType turnover) {
    this.turnover = turnover;
  }

  public TurnoverDTO turnover(TurnoverType turnover) {
    this.turnover = turnover;
    return this;
  }

 /**
   * Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
   * @return turnoverDays
  **/
  @JsonProperty("turnoverDays")
  public Double getTurnoverDays() {
    return turnoverDays;
  }

  public void setTurnoverDays(Double turnoverDays) {
    this.turnoverDays = turnoverDays;
  }

  public TurnoverDTO turnoverDays(Double turnoverDays) {
    this.turnoverDays = turnoverDays;
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
    TurnoverDTO turnoverDTO = (TurnoverDTO) o;
    return Objects.equals(this.turnover, turnoverDTO.turnover) &&
        Objects.equals(this.turnoverDays, turnoverDTO.turnoverDays);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

