package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GetCampaignOfferDTO;
import org.openapitools.model.ScrollingPagerDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список товаров в заданном магазине.
 **/
@ApiModel(description="Список товаров в заданном магазине.")

public class GetCampaignOffersResultDTO  {
  
  @ApiModelProperty(value = "")
  private ScrollingPagerDTO paging;

  @ApiModelProperty(required = true, value = "Страница списка товаров.")
 /**
   * Страница списка товаров.
  **/
  private List<GetCampaignOfferDTO> offers = new ArrayList<>();
 /**
   * Get paging
   * @return paging
  **/
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetCampaignOffersResultDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

 /**
   * Страница списка товаров.
   * @return offers
  **/
  @JsonProperty("offers")
  public List<GetCampaignOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<GetCampaignOfferDTO> offers) {
    this.offers = offers;
  }

  public GetCampaignOffersResultDTO offers(List<GetCampaignOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public GetCampaignOffersResultDTO addOffersItem(GetCampaignOfferDTO offersItem) {
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
    GetCampaignOffersResultDTO getCampaignOffersResultDTO = (GetCampaignOffersResultDTO) o;
    return Objects.equals(this.paging, getCampaignOffersResultDTO.paging) &&
        Objects.equals(this.offers, getCampaignOffersResultDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCampaignOffersResultDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

