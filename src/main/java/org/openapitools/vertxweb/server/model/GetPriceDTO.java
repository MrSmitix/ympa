package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.CurrencyType;

/**
 * Цена с указанием времени последнего обновления.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPriceDTO   {
  
  private BigDecimal value;
  private CurrencyType currencyId;
  private OffsetDateTime updatedAt;

  public GetPriceDTO () {

  }

  public GetPriceDTO (BigDecimal value, CurrencyType currencyId, OffsetDateTime updatedAt) {
    this.value = value;
    this.currencyId = currencyId;
    this.updatedAt = updatedAt;
  }

    
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }

    
  @JsonProperty("currencyId")
  public CurrencyType getCurrencyId() {
    return currencyId;
  }
  public void setCurrencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
  }

    
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPriceDTO getPriceDTO = (GetPriceDTO) o;
    return Objects.equals(value, getPriceDTO.value) &&
        Objects.equals(currencyId, getPriceDTO.currencyId) &&
        Objects.equals(updatedAt, getPriceDTO.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currencyId, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPriceDTO {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
