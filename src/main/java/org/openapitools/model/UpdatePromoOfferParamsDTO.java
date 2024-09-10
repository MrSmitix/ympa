package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.UpdatePromoOfferDiscountParamsDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Параметры товара, который участвует в акции.
 */

@Schema(name = "UpdatePromoOfferParamsDTO", description = "Параметры товара, который участвует в акции.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdatePromoOfferParamsDTO {

  private UpdatePromoOfferDiscountParamsDTO discountParams;

  public UpdatePromoOfferParamsDTO discountParams(UpdatePromoOfferDiscountParamsDTO discountParams) {
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
  public UpdatePromoOfferDiscountParamsDTO getDiscountParams() {
    return discountParams;
  }

  public void setDiscountParams(UpdatePromoOfferDiscountParamsDTO discountParams) {
    this.discountParams = discountParams;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePromoOfferParamsDTO updatePromoOfferParamsDTO = (UpdatePromoOfferParamsDTO) o;
    return Objects.equals(this.discountParams, updatePromoOfferParamsDTO.discountParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePromoOfferParamsDTO {\n");
    sb.append("    discountParams: ").append(toIndentedString(discountParams)).append("\n");
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

