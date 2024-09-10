package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.FlippingPagerDTO;
import org.openapitools.server.api.model.OfferDTO;

/**
 * Список предложений с пагинатором.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOffersResponse   {
  
  private List<OfferDTO> offers = new ArrayList<>();
  private FlippingPagerDTO pager;

  public GetOffersResponse () {

  }

  public GetOffersResponse (List<OfferDTO> offers, FlippingPagerDTO pager) {
    this.offers = offers;
    this.pager = pager;
  }

    
  @JsonProperty("offers")
  public List<OfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<OfferDTO> offers) {
    this.offers = offers;
  }

    
  @JsonProperty("pager")
  public FlippingPagerDTO getPager() {
    return pager;
  }
  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOffersResponse getOffersResponse = (GetOffersResponse) o;
    return Objects.equals(offers, getOffersResponse.offers) &&
        Objects.equals(pager, getOffersResponse.pager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, pager);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOffersResponse {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    pager: ").append(toIndentedString(pager)).append("\n");
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
