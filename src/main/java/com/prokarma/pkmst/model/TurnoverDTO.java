package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.TurnoverType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация об оборачиваемости товара.
 */
@ApiModel(description = "Информация об оборачиваемости товара.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TurnoverDTO   {
  @JsonProperty("turnover")
  private TurnoverType turnover;

  @JsonProperty("turnoverDays")
  private Double turnoverDays;

  public TurnoverDTO turnover(TurnoverType turnover) {
    this.turnover = turnover;
    return this;
  }

  /**
   * Get turnover
   * @return turnover
   */
  @ApiModelProperty(required = true, value = "")
  public TurnoverType getTurnover() {
    return turnover;
  }

  public void setTurnover(TurnoverType turnover) {
    this.turnover = turnover;
  }

  public TurnoverDTO turnoverDays(Double turnoverDays) {
    this.turnoverDays = turnoverDays;
    return this;
  }

  /**
   * Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
   * @return turnoverDays
   */
  @ApiModelProperty(value = "Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)")
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

