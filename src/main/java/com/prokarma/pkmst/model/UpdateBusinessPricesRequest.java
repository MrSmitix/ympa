package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.UpdateBusinessOfferPriceDTO;
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
 * Запрос на установку базовых цен на товары.
 */
@ApiModel(description = "Запрос на установку базовых цен на товары.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateBusinessPricesRequest   {
  @JsonProperty("offers")
  
  private List<UpdateBusinessOfferPriceDTO> offers = new ArrayList<>();

  public UpdateBusinessPricesRequest offers(List<UpdateBusinessOfferPriceDTO> offers) {
    this.offers = offers;
    return this;
  }

  public UpdateBusinessPricesRequest addOffersItem(UpdateBusinessOfferPriceDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Список товаров с ценами.
   * @return offers
   */
  @ApiModelProperty(required = true, value = "Список товаров с ценами.")
  public List<UpdateBusinessOfferPriceDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<UpdateBusinessOfferPriceDTO> offers) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

