package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. 
 **/
@ApiModel(description="Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. ")

public class GetPromoPromocodeInfoDTO  {
  
  @ApiModelProperty(required = true, value = "Промокод.")
 /**
   * Промокод.
  **/
  private String promocode;

  @ApiModelProperty(required = true, value = "Процент скидки по промокоду.")
 /**
   * Процент скидки по промокоду.
  **/
  private Integer discount;
 /**
   * Промокод.
   * @return promocode
  **/
  @JsonProperty("promocode")
  @NotNull
  public String getPromocode() {
    return promocode;
  }

  public void setPromocode(String promocode) {
    this.promocode = promocode;
  }

  public GetPromoPromocodeInfoDTO promocode(String promocode) {
    this.promocode = promocode;
    return this;
  }

 /**
   * Процент скидки по промокоду.
   * @return discount
  **/
  @JsonProperty("discount")
  @NotNull
  public Integer getDiscount() {
    return discount;
  }

  public void setDiscount(Integer discount) {
    this.discount = discount;
  }

  public GetPromoPromocodeInfoDTO discount(Integer discount) {
    this.discount = discount;
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
    GetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO = (GetPromoPromocodeInfoDTO) o;
    return Objects.equals(this.promocode, getPromoPromocodeInfoDTO.promocode) &&
        Objects.equals(this.discount, getPromoPromocodeInfoDTO.discount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promocode, discount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromoPromocodeInfoDTO {\n");
    
    sb.append("    promocode: ").append(toIndentedString(promocode)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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

