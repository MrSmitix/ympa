package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.GetCampaignOfferDTO;
import org.openapitools.server.api.model.ScrollingPagerDTO;

/**
 * Список товаров в заданном магазине.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCampaignOffersResultDTO   {
  
  private ScrollingPagerDTO paging;
  private List<GetCampaignOfferDTO> offers = new ArrayList<>();

  public GetCampaignOffersResultDTO () {

  }

  public GetCampaignOffersResultDTO (ScrollingPagerDTO paging, List<GetCampaignOfferDTO> offers) {
    this.paging = paging;
    this.offers = offers;
  }

    
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

    
  @JsonProperty("offers")
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
    return Objects.equals(paging, getCampaignOffersResultDTO.paging) &&
        Objects.equals(offers, getCampaignOffersResultDTO.offers);
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
