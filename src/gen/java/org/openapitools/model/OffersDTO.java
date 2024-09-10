package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Найденные предложения магазина.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Найденные предложения магазина.")
public class OffersDTO   {
  
  private List<@Valid OfferDTO> offers = new ArrayList<>();

  /**
   * Список предложений магазина.
   **/
  public OffersDTO offers(List<@Valid OfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список предложений магазина.")
  @JsonProperty("offers")
  @NotNull
  public List<@Valid OfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<@Valid OfferDTO> offers) {
    this.offers = offers;
  }

  public OffersDTO addOffersItem(OfferDTO offersItem) {
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
    OffersDTO offersDTO = (OffersDTO) o;
    return Objects.equals(this.offers, offersDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffersDTO {\n");
    
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

