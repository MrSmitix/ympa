package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.UpdatePromoOfferDiscountParamsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Параметры товара, который участвует в акции.
 */
@ApiModel(description="Параметры товара, который участвует в акции.")

public class UpdatePromoOfferParamsDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private UpdatePromoOfferDiscountParamsDTO discountParams;
 /**
  * Get discountParams
  * @return discountParams
  */
  @JsonProperty("discountParams")
  public UpdatePromoOfferDiscountParamsDTO getDiscountParams() {
    return discountParams;
  }

  /**
   * Sets the <code>discountParams</code> property.
   */
 public void setDiscountParams(UpdatePromoOfferDiscountParamsDTO discountParams) {
    this.discountParams = discountParams;
  }

  /**
   * Sets the <code>discountParams</code> property.
   */
  public UpdatePromoOfferParamsDTO discountParams(UpdatePromoOfferDiscountParamsDTO discountParams) {
    this.discountParams = discountParams;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

