package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.PromoOfferDiscountParamsDTO;
import org.openapitools.vertxweb.server.model.PromoOfferPromocodeParamsDTO;

/**
 * Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PromoOfferParamsDTO   {
  
  private PromoOfferDiscountParamsDTO discountParams;
  private PromoOfferPromocodeParamsDTO promocodeParams;

  public PromoOfferParamsDTO () {

  }

  public PromoOfferParamsDTO (PromoOfferDiscountParamsDTO discountParams, PromoOfferPromocodeParamsDTO promocodeParams) {
    this.discountParams = discountParams;
    this.promocodeParams = promocodeParams;
  }

    
  @JsonProperty("discountParams")
  public PromoOfferDiscountParamsDTO getDiscountParams() {
    return discountParams;
  }
  public void setDiscountParams(PromoOfferDiscountParamsDTO discountParams) {
    this.discountParams = discountParams;
  }

    
  @JsonProperty("promocodeParams")
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
    return Objects.equals(discountParams, promoOfferParamsDTO.discountParams) &&
        Objects.equals(promocodeParams, promoOfferParamsDTO.promocodeParams);
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
