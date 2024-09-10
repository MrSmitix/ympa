package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация для типа &#x60;MARKET_PROMOCODE&#x60;.  Параметр заполняется только для этого типа акции. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. ")
public class GetPromoPromocodeInfoDTO   {
  
  private String promocode;

  private Integer discount;

  /**
   * Промокод.
   **/
  public GetPromoPromocodeInfoDTO promocode(String promocode) {
    this.promocode = promocode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Промокод.")
  @JsonProperty("promocode")
  @NotNull
  public String getPromocode() {
    return promocode;
  }
  public void setPromocode(String promocode) {
    this.promocode = promocode;
  }


  /**
   * Процент скидки по промокоду.
   **/
  public GetPromoPromocodeInfoDTO discount(Integer discount) {
    this.discount = discount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Процент скидки по промокоду.")
  @JsonProperty("discount")
  @NotNull
  public Integer getDiscount() {
    return discount;
  }
  public void setDiscount(Integer discount) {
    this.discount = discount;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

