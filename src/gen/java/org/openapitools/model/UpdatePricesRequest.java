package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferPriceDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Запрос на установку цен на товары.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Запрос на установку цен на товары.")
public class UpdatePricesRequest   {
  
  private List<@Valid OfferPriceDTO> offers = new ArrayList<>();

  /**
   * Список товаров.
   **/
  public UpdatePricesRequest offers(List<@Valid OfferPriceDTO> offers) {
    this.offers = offers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров.")
  @JsonProperty("offers")
  @NotNull
 @Size(min=1,max=2000)  public List<@Valid OfferPriceDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<@Valid OfferPriceDTO> offers) {
    this.offers = offers;
  }

  public UpdatePricesRequest addOffersItem(OfferPriceDTO offersItem) {
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
    UpdatePricesRequest updatePricesRequest = (UpdatePricesRequest) o;
    return Objects.equals(this.offers, updatePricesRequest.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePricesRequest {\n");
    
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

