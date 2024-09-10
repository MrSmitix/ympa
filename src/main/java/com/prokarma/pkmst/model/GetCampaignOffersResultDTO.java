package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.GetCampaignOfferDTO;
import com.prokarma.pkmst.model.ScrollingPagerDTO;
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
 * Список товаров в заданном магазине.
 */
@ApiModel(description = "Список товаров в заданном магазине.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignOffersResultDTO   {
  @JsonProperty("paging")
  private ScrollingPagerDTO paging;

  @JsonProperty("offers")
  
  private List<GetCampaignOfferDTO> offers = new ArrayList<>();

  public GetCampaignOffersResultDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   */
  @ApiModelProperty(value = "")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetCampaignOffersResultDTO offers(List<GetCampaignOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public GetCampaignOffersResultDTO addOffersItem(GetCampaignOfferDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Страница списка товаров.
   * @return offers
   */
  @ApiModelProperty(required = true, value = "Страница списка товаров.")
  public List<GetCampaignOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<GetCampaignOfferDTO> offers) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

