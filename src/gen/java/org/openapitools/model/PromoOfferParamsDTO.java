package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.PromoOfferDiscountParamsDTO;
import org.openapitools.model.PromoOfferPromocodeParamsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
 **/
@ApiModel(description="Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. ")

public class PromoOfferParamsDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private PromoOfferDiscountParamsDTO discountParams;

  @ApiModelProperty(value = "")
  @Valid
  private PromoOfferPromocodeParamsDTO promocodeParams;
 /**
   * Get discountParams
   * @return discountParams
  **/
  @JsonProperty("discountParams")
  public PromoOfferDiscountParamsDTO getDiscountParams() {
    return discountParams;
  }

  public void setDiscountParams(PromoOfferDiscountParamsDTO discountParams) {
    this.discountParams = discountParams;
  }

  public PromoOfferParamsDTO discountParams(PromoOfferDiscountParamsDTO discountParams) {
    this.discountParams = discountParams;
    return this;
  }

 /**
   * Get promocodeParams
   * @return promocodeParams
  **/
  @JsonProperty("promocodeParams")
  public PromoOfferPromocodeParamsDTO getPromocodeParams() {
    return promocodeParams;
  }

  public void setPromocodeParams(PromoOfferPromocodeParamsDTO promocodeParams) {
    this.promocodeParams = promocodeParams;
  }

  public PromoOfferParamsDTO promocodeParams(PromoOfferPromocodeParamsDTO promocodeParams) {
    this.promocodeParams = promocodeParams;
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
    PromoOfferParamsDTO promoOfferParamsDTO = (PromoOfferParamsDTO) o;
    return Objects.equals(this.discountParams, promoOfferParamsDTO.discountParams) &&
        Objects.equals(this.promocodeParams, promoOfferParamsDTO.promocodeParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountParams, promocodeParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoOfferParamsDTO {\n");
    
    sb.append("    discountParams: ").append(toIndentedString(discountParams)).append("\n");
    sb.append("    promocodeParams: ").append(toIndentedString(promocodeParams)).append("\n");
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

