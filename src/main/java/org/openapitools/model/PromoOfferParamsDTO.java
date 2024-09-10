package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PromoOfferDiscountParamsDTO;
import org.openapitools.model.PromoOfferPromocodeParamsDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
 */

@Schema(name = "PromoOfferParamsDTO", description = "Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PromoOfferParamsDTO {

  private PromoOfferDiscountParamsDTO discountParams;

  private PromoOfferPromocodeParamsDTO promocodeParams;

  public PromoOfferParamsDTO discountParams(PromoOfferDiscountParamsDTO discountParams) {
    this.discountParams = discountParams;
    return this;
  }

  /**
   * Get discountParams
   * @return discountParams
   */
  @Valid 
  @Schema(name = "discountParams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discountParams")
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
  @Valid 
  @Schema(name = "promocodeParams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

