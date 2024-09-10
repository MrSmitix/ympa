package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.OfferPriceResponseDTO;
import org.openapitools.server.api.model.ScrollingPagerDTO;

/**
 * Список цен на товары.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferPriceListResponseDTO   {
  
  private List<OfferPriceResponseDTO> offers = new ArrayList<>();
  private ScrollingPagerDTO paging;
  private Integer total;

  public OfferPriceListResponseDTO () {

  }

  public OfferPriceListResponseDTO (List<OfferPriceResponseDTO> offers, ScrollingPagerDTO paging, Integer total) {
    this.offers = offers;
    this.paging = paging;
    this.total = total;
  }

    
  @JsonProperty("offers")
  public List<OfferPriceResponseDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<OfferPriceResponseDTO> offers) {
    this.offers = offers;
  }

    
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

    
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferPriceListResponseDTO offerPriceListResponseDTO = (OfferPriceListResponseDTO) o;
    return Objects.equals(offers, offerPriceListResponseDTO.offers) &&
        Objects.equals(paging, offerPriceListResponseDTO.paging) &&
        Objects.equals(total, offerPriceListResponseDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, paging, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPriceListResponseDTO {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
