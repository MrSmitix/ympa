package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.OfferForRecommendationDTO;
import org.openapitools.server.api.model.OfferRecommendationInfoDTO;

/**
 * Информация о состоянии цен и рекомендации. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferRecommendationDTO   {
  
  private OfferForRecommendationDTO offer;
  private OfferRecommendationInfoDTO recommendation;

  public OfferRecommendationDTO () {

  }

  public OfferRecommendationDTO (OfferForRecommendationDTO offer, OfferRecommendationInfoDTO recommendation) {
    this.offer = offer;
    this.recommendation = recommendation;
  }

    
  @JsonProperty("offer")
  public OfferForRecommendationDTO getOffer() {
    return offer;
  }
  public void setOffer(OfferForRecommendationDTO offer) {
    this.offer = offer;
  }

    
  @JsonProperty("recommendation")
  public OfferRecommendationInfoDTO getRecommendation() {
    return recommendation;
  }
  public void setRecommendation(OfferRecommendationInfoDTO recommendation) {
    this.recommendation = recommendation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferRecommendationDTO offerRecommendationDTO = (OfferRecommendationDTO) o;
    return Objects.equals(offer, offerRecommendationDTO.offer) &&
        Objects.equals(recommendation, offerRecommendationDTO.recommendation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer, recommendation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferRecommendationDTO {\n");
    
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
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
