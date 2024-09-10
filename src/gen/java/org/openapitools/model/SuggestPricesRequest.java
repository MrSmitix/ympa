package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SuggestOfferPriceDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Запрос на получение списка цен для продвижения.
 **/
@ApiModel(description="Запрос на получение списка цен для продвижения.")

public class SuggestPricesRequest  {
  
  @ApiModelProperty(required = true, value = "Список товаров.")
  @Valid
 /**
   * Список товаров.
  **/
  private List<@Valid SuggestOfferPriceDTO> offers = new ArrayList<>();
 /**
   * Список товаров.
   * @return offers
  **/
  @JsonProperty("offers")
  @NotNull
 @Size(max=1000)  public List<@Valid SuggestOfferPriceDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid SuggestOfferPriceDTO> offers) {
    this.offers = offers;
  }

  public SuggestPricesRequest offers(List<@Valid SuggestOfferPriceDTO> offers) {
    this.offers = offers;
    return this;
  }

  public SuggestPricesRequest addOffersItem(SuggestOfferPriceDTO offersItem) {
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
    SuggestPricesRequest suggestPricesRequest = (SuggestPricesRequest) o;
    return Objects.equals(this.offers, suggestPricesRequest.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestPricesRequest {\n");
    
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

