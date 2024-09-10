package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PriceSuggestOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Результат запроса цен для продвижения.
 **/
@ApiModel(description="Результат запроса цен для продвижения.")

public class SuggestPricesResultDTO  {
  
  @ApiModelProperty(required = true, value = "Список товаров с ценами для продвижения.")
  @Valid
 /**
   * Список товаров с ценами для продвижения.
  **/
  private List<@Valid PriceSuggestOfferDTO> offers = new ArrayList<>();
 /**
   * Список товаров с ценами для продвижения.
   * @return offers
  **/
  @JsonProperty("offers")
  @NotNull
  public List<@Valid PriceSuggestOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid PriceSuggestOfferDTO> offers) {
    this.offers = offers;
  }

  public SuggestPricesResultDTO offers(List<@Valid PriceSuggestOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public SuggestPricesResultDTO addOffersItem(PriceSuggestOfferDTO offersItem) {
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
    SuggestPricesResultDTO suggestPricesResultDTO = (SuggestPricesResultDTO) o;
    return Objects.equals(this.offers, suggestPricesResultDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestPricesResultDTO {\n");
    
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

