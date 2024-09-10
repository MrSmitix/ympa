package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateBusinessOfferPriceDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Запрос на установку базовых цен на товары.
 */
@ApiModel(description="Запрос на установку базовых цен на товары.")

public class UpdateBusinessPricesRequest  {
  
 /**
  * Список товаров с ценами.
  */
  @ApiModelProperty(required = true, value = "Список товаров с ценами.")
  @Valid
  private List<@Valid UpdateBusinessOfferPriceDTO> offers = new ArrayList<>();
 /**
  * Список товаров с ценами.
  * @return offers
  */
  @JsonProperty("offers")
  @NotNull
 @Size(min=1,max=500)  public List<@Valid UpdateBusinessOfferPriceDTO> getOffers() {
    return offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
 public void setOffers(List<@Valid UpdateBusinessOfferPriceDTO> offers) {
    this.offers = offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
  public UpdateBusinessPricesRequest offers(List<@Valid UpdateBusinessOfferPriceDTO> offers) {
    this.offers = offers;
    return this;
  }

  /**
   * Adds a new item to the <code>offers</code> list.
   */
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

