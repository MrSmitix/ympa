package apimodels;

import apimodels.TurnoverType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об оборачиваемости товара.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TurnoverDTO   {
  @JsonProperty("turnover")
  @NotNull
@Valid

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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

