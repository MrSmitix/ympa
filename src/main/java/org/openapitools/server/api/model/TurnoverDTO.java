package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.TurnoverType;

/**
 * Информация об оборачиваемости товара.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TurnoverDTO   {
  
  private TurnoverType turnover;
  private Double turnoverDays;

  public TurnoverDTO () {

  }

  public TurnoverDTO (TurnoverType turnover, Double turnoverDays) {
    this.turnover = turnover;
    this.turnoverDays = turnoverDays;
  }

    
  @JsonProperty("turnover")
  public TurnoverType getTurnover() {
    return turnover;
  }
  public void setTurnover(TurnoverType turnover) {
    this.turnover = turnover;
  }

    
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
