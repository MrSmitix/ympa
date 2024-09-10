package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import org.openapitools.model.CurrencyType;



/**
 * Цена с указанием времени последнего обновления.
 **/

@ApiModel(description = "Цена с указанием времени последнего обновления.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPriceDTO   {
  @JsonProperty("value")
  private BigDecimal value;

  @JsonProperty("currencyId")
  private CurrencyType currencyId;

  @JsonProperty("updatedAt")
  private Date updatedAt;

  /**
   * Значение.
   * minimum: 0
   **/
  public GetPriceDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Значение.")
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   **/
  public GetPriceDTO currencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("currencyId")
  public CurrencyType getCurrencyId() {
    return currencyId;
  }
  public void setCurrencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
  }

  /**
   * Время последнего обновления.
   **/
  public GetPriceDTO updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Время последнего обновления.")
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
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

