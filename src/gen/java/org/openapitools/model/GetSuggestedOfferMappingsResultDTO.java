package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SuggestedOfferMappingDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Подобранные карточки на Маркете.
 **/
@ApiModel(description = "Подобранные карточки на Маркете.")
@JsonTypeName("GetSuggestedOfferMappingsResultDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetSuggestedOfferMappingsResultDTO   {
  private @Valid List<@Valid SuggestedOfferMappingDTO> offers = new ArrayList<>();

  /**
   * Список товаров.
   **/
  public GetSuggestedOfferMappingsResultDTO offers(List<@Valid SuggestedOfferMappingDTO> offers) {
    this.offers = offers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров.")
  @JsonProperty("offers")
  @NotNull @Valid public List<@Valid SuggestedOfferMappingDTO> getOffers() {
    return offers;
  }

  @JsonProperty("offers")
  public void setOffers(List<@Valid SuggestedOfferMappingDTO> offers) {
    this.offers = offers;
  }

  public GetSuggestedOfferMappingsResultDTO addOffersItem(SuggestedOfferMappingDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }

    this.offers.add(offersItem);
    return this;
  }

  public GetSuggestedOfferMappingsResultDTO removeOffersItem(SuggestedOfferMappingDTO offersItem) {
    if (offersItem != null && this.offers != null) {
      this.offers.remove(offersItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

