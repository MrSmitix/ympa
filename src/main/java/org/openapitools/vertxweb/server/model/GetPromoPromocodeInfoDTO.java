package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Информация для типа &#x60;MARKET_PROMOCODE&#x60;.  Параметр заполняется только для этого типа акции. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPromoPromocodeInfoDTO   {
  
  private String promocode;
  private Integer discount;

  public GetPromoPromocodeInfoDTO () {

  }

  public GetPromoPromocodeInfoDTO (String promocode, Integer discount) {
    this.promocode = promocode;
    this.discount = discount;
  }

    
  @JsonProperty("promocode")
  public String getPromocode() {
    return promocode;
  }
  public void setPromocode(String promocode) {
    this.promocode = promocode;
  }

    
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
