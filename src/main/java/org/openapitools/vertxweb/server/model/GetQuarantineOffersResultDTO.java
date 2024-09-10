package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.QuarantineOfferDTO;
import org.openapitools.vertxweb.server.model.ScrollingPagerDTO;

/**
 * Список товаров в карантине.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetQuarantineOffersResultDTO   {
  
  private ScrollingPagerDTO paging;
  private List<QuarantineOfferDTO> offers = new ArrayList<>();

  public GetQuarantineOffersResultDTO () {

  }

  public GetQuarantineOffersResultDTO (ScrollingPagerDTO paging, List<QuarantineOfferDTO> offers) {
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
  public List<QuarantineOfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<QuarantineOfferDTO> offers) {
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
    GetQuarantineOffersResultDTO getQuarantineOffersResultDTO = (GetQuarantineOffersResultDTO) o;
    return Objects.equals(paging, getQuarantineOffersResultDTO.paging) &&
        Objects.equals(offers, getQuarantineOffersResultDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQuarantineOffersResultDTO {\n");
    
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
