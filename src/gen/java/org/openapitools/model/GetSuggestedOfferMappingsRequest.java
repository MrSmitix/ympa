package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SuggestedOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class GetSuggestedOfferMappingsRequest   {
  
  private List<@Valid SuggestedOfferDTO> offers;

  /**
   * Список товаров.
   **/
  public GetSuggestedOfferMappingsRequest offers(List<@Valid SuggestedOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  
  @ApiModelProperty(value = "Список товаров.")
  @JsonProperty("offers")
 @Size(min=1,max=500)  public List<@Valid SuggestedOfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<@Valid SuggestedOfferDTO> offers) {
    this.offers = offers;
  }

  public GetSuggestedOfferMappingsRequest addOffersItem(SuggestedOfferDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
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
    GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest = (GetSuggestedOfferMappingsRequest) o;
    return Objects.equals(this.offers, getSuggestedOfferMappingsRequest.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSuggestedOfferMappingsRequest {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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

