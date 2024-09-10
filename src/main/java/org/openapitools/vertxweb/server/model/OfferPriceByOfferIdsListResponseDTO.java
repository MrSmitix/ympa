package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.OfferPriceByOfferIdsResponseDTO;
import org.openapitools.vertxweb.server.model.ScrollingPagerDTO;

/**
 * Список цен.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferPriceByOfferIdsListResponseDTO   {
  
  private List<OfferPriceByOfferIdsResponseDTO> offers = new ArrayList<>();
  private ScrollingPagerDTO paging;

  public OfferPriceByOfferIdsListResponseDTO () {

  }

  public OfferPriceByOfferIdsListResponseDTO (List<OfferPriceByOfferIdsResponseDTO> offers, ScrollingPagerDTO paging) {
    this.offers = offers;
    this.paging = paging;
  }

    
  @JsonProperty("offers")
  public List<OfferPriceByOfferIdsResponseDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<OfferPriceByOfferIdsResponseDTO> offers) {
    this.offers = offers;
  }

    
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferPriceByOfferIdsListResponseDTO offerPriceByOfferIdsListResponseDTO = (OfferPriceByOfferIdsListResponseDTO) o;
    return Objects.equals(offers, offerPriceByOfferIdsListResponseDTO.offers) &&
        Objects.equals(paging, offerPriceByOfferIdsListResponseDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPriceByOfferIdsListResponseDTO {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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
