package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CurrencyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Цена с указанием времени последнего обновления.
 */
@ApiModel(description = "Цена с указанием времени последнего обновления.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPriceDTO   {
  @JsonProperty("value")
  private BigDecimal value;

  @JsonProperty("currencyId")
  private CurrencyType currencyId;

  @JsonProperty("updatedAt")
  private OffsetDateTime updatedAt;

  public GetPriceDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Значение.
   * minimum: 0
   * @return value
   */
  @ApiModelProperty(required = true, value = "Значение.")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public GetPriceDTO currencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
    return this;
  }

  /**
   * Get currencyId
   * @return currencyId
   */
  @ApiModelProperty(required = true, value = "")
  public CurrencyType getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
  }

  public GetPriceDTO updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Время последнего обновления.
   * @return updatedAt
   */
  @ApiModelProperty(required = true, value = "Время последнего обновления.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

