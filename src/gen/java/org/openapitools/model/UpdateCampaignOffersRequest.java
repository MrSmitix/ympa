package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateCampaignOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Запрос на обновление предложений товаров магазина.
 **/
@ApiModel(description="Запрос на обновление предложений товаров магазина.")

public class UpdateCampaignOffersRequest  {
  
  @ApiModelProperty(required = true, value = "Параметры размещения товаров в заданном магазине.")
  @Valid
 /**
   * Параметры размещения товаров в заданном магазине.
  **/
  private List<@Valid UpdateCampaignOfferDTO> offers = new ArrayList<>();
 /**
   * Параметры размещения товаров в заданном магазине.
   * @return offers
  **/
  @JsonProperty("offers")
  @NotNull
 @Size(min=1,max=500)  public List<@Valid UpdateCampaignOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid UpdateCampaignOfferDTO> offers) {
    this.offers = offers;
  }

  public UpdateCampaignOffersRequest offers(List<@Valid UpdateCampaignOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public UpdateCampaignOffersRequest addOffersItem(UpdateCampaignOfferDTO offersItem) {
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
    UpdateCampaignOffersRequest updateCampaignOffersRequest = (UpdateCampaignOffersRequest) o;
    return Objects.equals(this.offers, updateCampaignOffersRequest.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCampaignOffersRequest {\n");
    
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

