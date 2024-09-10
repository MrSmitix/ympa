package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.PromoOfferDiscountParamsDTO;
import com.prokarma.pkmst.model.PromoOfferPromocodeParamsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
 */
@ApiModel(description = "Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PromoOfferParamsDTO   {
  @JsonProperty("discountParams")
  private PromoOfferDiscountParamsDTO discountParams;

  @JsonProperty("promocodeParams")
  private PromoOfferPromocodeParamsDTO promocodeParams;

  public PromoOfferParamsDTO discountParams(PromoOfferDiscountParamsDTO discountParams) {
    this.discountParams = discountParams;
    return this;
  }

  /**
   * Get discountParams
   * @return discountParams
   */
  @ApiModelProperty(value = "")
  public PromoOfferDiscountParamsDTO getDiscountParams() {
    return discountParams;
  }

  public void setDiscountParams(PromoOfferDiscountParamsDTO discountParams) {
    this.discountParams = discountParams;
  }

  public PromoOfferParamsDTO promocodeParams(PromoOfferPromocodeParamsDTO promocodeParams) {
    this.promocodeParams = promocodeParams;
    return this;
  }

  /**
   * Get promocodeParams
   * @return promocodeParams
   */
  @ApiModelProperty(value = "")
  public PromoOfferPromocodeParamsDTO getPromocodeParams() {
    return promocodeParams;
  }

  public void setPromocodeParams(PromoOfferPromocodeParamsDTO promocodeParams) {
    this.promocodeParams = promocodeParams;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

