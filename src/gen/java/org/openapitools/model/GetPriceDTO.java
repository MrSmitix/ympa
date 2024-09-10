package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import java.util.Date;
import org.openapitools.model.CurrencyType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Цена с указанием времени последнего обновления.
 **/
@ApiModel(description="Цена с указанием времени последнего обновления.")

public class GetPriceDTO  {
  
  @ApiModelProperty(required = true, value = "Значение.")
 /**
   * Значение.
  **/
  private BigDecimal value;

  @ApiModelProperty(required = true, value = "")
  private CurrencyType currencyId;

  @ApiModelProperty(required = true, value = "Время последнего обновления.")
 /**
   * Время последнего обновления.
  **/
  private Date updatedAt;
 /**
   * Значение.
   * minimum: 0
   * @return value
  **/
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public GetPriceDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

 /**
   * Get currencyId
   * @return currencyId
  **/
  @JsonProperty("currencyId")
  public CurrencyType getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
  }

  public GetPriceDTO currencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
    return this;
  }

 /**
   * Время последнего обновления.
   * @return updatedAt
  **/
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public GetPriceDTO updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
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
    GetPriceDTO getPriceDTO = (GetPriceDTO) o;
    return Objects.equals(this.value, getPriceDTO.value) &&
        Objects.equals(this.currencyId, getPriceDTO.currencyId) &&
        Objects.equals(this.updatedAt, getPriceDTO.updatedAt);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

