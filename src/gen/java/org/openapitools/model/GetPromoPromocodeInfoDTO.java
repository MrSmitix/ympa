package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Информация для типа &#x60;MARKET_PROMOCODE&#x60;.  Параметр заполняется только для этого типа акции. 
 **/

@ApiModel(description = "Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoPromocodeInfoDTO   {
  @JsonProperty("promocode")
  private String promocode;

  @JsonProperty("discount")
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
    return Objects.equals(promocode, getPromoPromocodeInfoDTO.promocode) &&
        Objects.equals(discount, getPromoPromocodeInfoDTO.discount);
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

