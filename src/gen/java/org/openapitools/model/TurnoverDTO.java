package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TurnoverType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация об оборачиваемости товара.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация об оборачиваемости товара.")
public class TurnoverDTO   {
  
  private TurnoverType turnover;

  private Double turnoverDays;

  /**
   **/
  public TurnoverDTO turnover(TurnoverType turnover) {
    this.turnover = turnover;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("turnover")
  @NotNull
  public TurnoverType getTurnover() {
    return turnover;
  }
  public void setTurnover(TurnoverType turnover) {
    this.turnover = turnover;
  }


  /**
   * Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
   **/
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

