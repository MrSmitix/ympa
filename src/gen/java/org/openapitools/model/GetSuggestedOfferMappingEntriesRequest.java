package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MappingsOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Запрос рекомендованных карточек товара.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Запрос рекомендованных карточек товара.")
public class GetSuggestedOfferMappingEntriesRequest   {
  
  private List<@Valid MappingsOfferDTO> offers = new ArrayList<>();

  /**
   * Список товаров.
   **/
  public GetSuggestedOfferMappingEntriesRequest offers(List<@Valid MappingsOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров.")
  @JsonProperty("offers")
  @NotNull
 @Size(min=1,max=500)  public List<@Valid MappingsOfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<@Valid MappingsOfferDTO> offers) {
    this.offers = offers;
  }

  public GetSuggestedOfferMappingEntriesRequest addOffersItem(MappingsOfferDTO offersItem) {
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
    GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest = (GetSuggestedOfferMappingEntriesRequest) o;
    return Objects.equals(this.offers, getSuggestedOfferMappingEntriesRequest.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSuggestedOfferMappingEntriesRequest {\n");
    
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

