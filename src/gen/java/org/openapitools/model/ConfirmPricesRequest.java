package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Запрос на подтверждение цены. 
 **/
@ApiModel(description="Запрос на подтверждение цены. ")

public class ConfirmPricesRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификаторы товаров, у которых подтверждается цена.")
 /**
   * Идентификаторы товаров, у которых подтверждается цена.
  **/
  private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds = new ArrayList<>();
 /**
   * Идентификаторы товаров, у которых подтверждается цена.
   * @return offerIds
  **/
  @JsonProperty("offerIds")
  @NotNull
 @Size(min=1,max=200)  public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
  }

  public ConfirmPricesRequest offerIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  public ConfirmPricesRequest addOfferIdsItem(String offerIdsItem) {
    this.offerIds.add(offerIdsItem);
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
    ConfirmPricesRequest confirmPricesRequest = (ConfirmPricesRequest) o;
    return Objects.equals(this.offerIds, confirmPricesRequest.offerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmPricesRequest {\n");
    
    sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
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

