package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.MappingsOfferDTO;
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
 * Запрос рекомендованных карточек товара.
 */
@ApiModel(description = "Запрос рекомендованных карточек товара.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetSuggestedOfferMappingEntriesRequest   {
  @JsonProperty("offers")
  
  private List<MappingsOfferDTO> offers = new ArrayList<>();

  public GetSuggestedOfferMappingEntriesRequest offers(List<MappingsOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public GetSuggestedOfferMappingEntriesRequest addOffersItem(MappingsOfferDTO offersItem) {
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
  public List<MappingsOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<MappingsOfferDTO> offers) {
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
