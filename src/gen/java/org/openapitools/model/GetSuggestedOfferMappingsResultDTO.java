package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SuggestedOfferMappingDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Подобранные карточки на Маркете.
 **/
@ApiModel(description="Подобранные карточки на Маркете.")

public class GetSuggestedOfferMappingsResultDTO  {
  
  @ApiModelProperty(required = true, value = "Список товаров.")
 /**
   * Список товаров.
  **/
  private List<SuggestedOfferMappingDTO> offers = new ArrayList<>();
 /**
   * Список товаров.
   * @return offers
  **/
  @JsonProperty("offers")
  public List<SuggestedOfferMappingDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<SuggestedOfferMappingDTO> offers) {
    this.offers = offers;
  }

  public GetSuggestedOfferMappingsResultDTO offers(List<SuggestedOfferMappingDTO> offers) {
    this.offers = offers;
    return this;
  }

  public GetSuggestedOfferMappingsResultDTO addOffersItem(SuggestedOfferMappingDTO offersItem) {
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
    GetSuggestedOfferMappingsResultDTO getSuggestedOfferMappingsResultDTO = (GetSuggestedOfferMappingsResultDTO) o;
    return Objects.equals(this.offers, getSuggestedOfferMappingsResultDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSuggestedOfferMappingsResultDTO {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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

