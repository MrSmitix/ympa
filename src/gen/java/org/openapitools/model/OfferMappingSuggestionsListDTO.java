package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EnrichedMappingsOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список рекомендованных карточек товара.
 */
@ApiModel(description="Список рекомендованных карточек товара.")

public class OfferMappingSuggestionsListDTO  {
  
 /**
  * Список товаров.
  */
  @ApiModelProperty(required = true, value = "Список товаров.")
  @Valid
  private List<@Valid EnrichedMappingsOfferDTO> offers = new ArrayList<>();
 /**
  * Список товаров.
  * @return offers
  */
  @JsonProperty("offers")
  @NotNull
  public List<@Valid EnrichedMappingsOfferDTO> getOffers() {
    return offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
 public void setOffers(List<@Valid EnrichedMappingsOfferDTO> offers) {
    this.offers = offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
  public OfferMappingSuggestionsListDTO offers(List<@Valid EnrichedMappingsOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  /**
   * Adds a new item to the <code>offers</code> list.
   */
  public OfferMappingSuggestionsListDTO addOffersItem(EnrichedMappingsOfferDTO offersItem) {
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
    OfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO = (OfferMappingSuggestionsListDTO) o;
    return Objects.equals(this.offers, offerMappingSuggestionsListDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferMappingSuggestionsListDTO {\n");
    
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

