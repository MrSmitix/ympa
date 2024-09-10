package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.SuggestedOfferMappingDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Подобранные карточки на Маркете.
 */
@ApiModel(description = "Подобранные карточки на Маркете.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetSuggestedOfferMappingsResultDTO   {
  @JsonProperty("offers")
  
  private List<SuggestedOfferMappingDTO> offers = new ArrayList<>();

  public GetSuggestedOfferMappingsResultDTO offers(List<SuggestedOfferMappingDTO> offers) {
    this.offers = offers;
    return this;
  }

  public GetSuggestedOfferMappingsResultDTO addOffersItem(SuggestedOfferMappingDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Список товаров.
   * @return offers
   */
  @ApiModelProperty(required = true, value = "Список товаров.")
  public List<SuggestedOfferMappingDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<SuggestedOfferMappingDTO> offers) {
    this.offers = offers;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

