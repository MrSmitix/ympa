package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import java.util.Date;
import org.openapitools.model.CurrencyType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Цена с указанием времени последнего обновления.
 */
@ApiModel(description="Цена с указанием времени последнего обновления.")

public class GetPriceDTO  {
  
 /**
  * Значение.
  */
  @ApiModelProperty(required = true, value = "Значение.")
  @Valid
  private BigDecimal value;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CurrencyType currencyId;

 /**
  * Время последнего обновления.
  */
  @ApiModelProperty(required = true, value = "Время последнего обновления.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date updatedAt;
 /**
  * Значение.
  * minimum: 0
  * @return value
  */
  @JsonProperty("value")
  @NotNull
 @DecimalMin("0")  public BigDecimal getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
  public GetPriceDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

 /**
  * Get currencyId
  * @return currencyId
  */
  @JsonProperty("currencyId")
  @NotNull
  public CurrencyType getCurrencyId() {
    return currencyId;
  }

  /**
   * Sets the <code>currencyId</code> property.
   */
 public void setCurrencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
  }

  /**
   * Sets the <code>currencyId</code> property.
   */
  public GetPriceDTO currencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
    return this;
  }

 /**
  * Время последнего обновления.
  * @return updatedAt
  */
  @JsonProperty("updatedAt")
  @NotNull
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   */
 public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   */
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

