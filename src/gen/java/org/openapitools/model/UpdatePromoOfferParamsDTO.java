package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UpdatePromoOfferDiscountParamsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Параметры товара, который участвует в акции.
 **/
@ApiModel(description = "Параметры товара, который участвует в акции.")
@JsonTypeName("UpdatePromoOfferParamsDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdatePromoOfferParamsDTO   {
  private UpdatePromoOfferDiscountParamsDTO discountParams;

  /**
   **/
  public UpdatePromoOfferParamsDTO discountParams(UpdatePromoOfferDiscountParamsDTO discountParams) {
    this.discountParams = discountParams;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("discountParams")
  @Valid public UpdatePromoOfferDiscountParamsDTO getDiscountParams() {
    return discountParams;
  }

  @JsonProperty("discountParams")
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

