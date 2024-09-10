package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.OfferRecommendationDTO;
import org.openapitools.vertxweb.server.model.ScrollingPagerDTO;

/**
 * Список товаров с рекомендациями.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferRecommendationsResultDTO   {
  
  private ScrollingPagerDTO paging;
  private List<OfferRecommendationDTO> offerRecommendations = new ArrayList<>();

  public OfferRecommendationsResultDTO () {

  }

  public OfferRecommendationsResultDTO (ScrollingPagerDTO paging, List<OfferRecommendationDTO> offerRecommendations) {
    this.paging = paging;
    this.offerRecommendations = offerRecommendations;
  }

    
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

    
  @JsonProperty("offerRecommendations")
  public List<OfferRecommendationDTO> getOfferRecommendations() {
    return offerRecommendations;
  }
  public void setOfferRecommendations(List<OfferRecommendationDTO> offerRecommendations) {
    this.offerRecommendations = offerRecommendations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferRecommendationsResultDTO offerRecommendationsResultDTO = (OfferRecommendationsResultDTO) o;
    return Objects.equals(paging, offerRecommendationsResultDTO.paging) &&
        Objects.equals(offerRecommendations, offerRecommendationsResultDTO.offerRecommendations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, offerRecommendations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferRecommendationsResultDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    offerRecommendations: ").append(toIndentedString(offerRecommendations)).append("\n");
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
