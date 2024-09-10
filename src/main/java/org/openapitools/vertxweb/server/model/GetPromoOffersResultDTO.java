package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ForwardScrollingPagerDTO;
import org.openapitools.vertxweb.server.model.GetPromoOfferDTO;

/**
 * Список товаров, которые участвуют или могут участвовать в акции.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPromoOffersResultDTO   {
  
  private List<GetPromoOfferDTO> offers = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  public GetPromoOffersResultDTO () {

  }

  public GetPromoOffersResultDTO (List<GetPromoOfferDTO> offers, ForwardScrollingPagerDTO paging) {
    this.offers = offers;
    this.paging = paging;
  }

    
  @JsonProperty("offers")
  public List<GetPromoOfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<GetPromoOfferDTO> offers) {
    this.offers = offers;
  }

    
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ForwardScrollingPagerDTO paging) {
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
    GetPromoOffersResultDTO getPromoOffersResultDTO = (GetPromoOffersResultDTO) o;
    return Objects.equals(offers, getPromoOffersResultDTO.offers) &&
        Objects.equals(paging, getPromoOffersResultDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromoOffersResultDTO {\n");
    
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
