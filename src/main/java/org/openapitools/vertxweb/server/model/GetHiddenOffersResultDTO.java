package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.HiddenOfferDTO;
import org.openapitools.vertxweb.server.model.ScrollingPagerDTO;

/**
 * Список скрытых вами товаров. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetHiddenOffersResultDTO   {
  
  private ScrollingPagerDTO paging;
  private List<HiddenOfferDTO> hiddenOffers = new ArrayList<>();

  public GetHiddenOffersResultDTO () {

  }

  public GetHiddenOffersResultDTO (ScrollingPagerDTO paging, List<HiddenOfferDTO> hiddenOffers) {
    this.paging = paging;
    this.hiddenOffers = hiddenOffers;
  }

    
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

    
  @JsonProperty("hiddenOffers")
  public List<HiddenOfferDTO> getHiddenOffers() {
    return hiddenOffers;
  }
  public void setHiddenOffers(List<HiddenOfferDTO> hiddenOffers) {
    this.hiddenOffers = hiddenOffers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetHiddenOffersResultDTO getHiddenOffersResultDTO = (GetHiddenOffersResultDTO) o;
    return Objects.equals(paging, getHiddenOffersResultDTO.paging) &&
        Objects.equals(hiddenOffers, getHiddenOffersResultDTO.hiddenOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, hiddenOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHiddenOffersResultDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    hiddenOffers: ").append(toIndentedString(hiddenOffers)).append("\n");
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
