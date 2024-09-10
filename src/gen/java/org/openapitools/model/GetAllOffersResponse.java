package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список предложений.
 **/
@ApiModel(description="Список предложений.")

public class GetAllOffersResponse  {
  
  @ApiModelProperty(required = true, value = "Список предложений магазина.")
 /**
   * Список предложений магазина.
  **/
  private List<OfferDTO> offers = new ArrayList<>();
 /**
   * Список предложений магазина.
   * @return offers
  **/
  @JsonProperty("offers")
  public List<OfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<OfferDTO> offers) {
    this.offers = offers;
  }

  public GetAllOffersResponse offers(List<OfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public GetAllOffersResponse addOffersItem(OfferDTO offersItem) {
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
    GetAllOffersResponse getAllOffersResponse = (GetAllOffersResponse) o;
    return Objects.equals(this.offers, getAllOffersResponse.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllOffersResponse {\n");
    
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

