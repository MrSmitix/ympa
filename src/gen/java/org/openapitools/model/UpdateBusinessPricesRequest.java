package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateBusinessOfferPriceDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Запрос на установку базовых цен на товары.
 **/
@ApiModel(description="Запрос на установку базовых цен на товары.")

public class UpdateBusinessPricesRequest  {
  
  @ApiModelProperty(required = true, value = "Список товаров с ценами.")
 /**
   * Список товаров с ценами.
  **/
  private List<UpdateBusinessOfferPriceDTO> offers = new ArrayList<>();
 /**
   * Список товаров с ценами.
   * @return offers
  **/
  @JsonProperty("offers")
  public List<UpdateBusinessOfferPriceDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<UpdateBusinessOfferPriceDTO> offers) {
    this.offers = offers;
  }

  public UpdateBusinessPricesRequest offers(List<UpdateBusinessOfferPriceDTO> offers) {
    this.offers = offers;
    return this;
  }

  public UpdateBusinessPricesRequest addOffersItem(UpdateBusinessOfferPriceDTO offersItem) {
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
    UpdateBusinessPricesRequest updateBusinessPricesRequest = (UpdateBusinessPricesRequest) o;
    return Objects.equals(this.offers, updateBusinessPricesRequest.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBusinessPricesRequest {\n");
    
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

