package apimodels;

import apimodels.OfferForRecommendationDTO;
import apimodels.OfferRecommendationInfoDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о состоянии цен и рекомендации. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferRecommendationDTO   {
  @JsonProperty("offer")
  @Valid

  private OfferForRecommendationDTO offer;

  @JsonProperty("recommendation")
  @Valid

  private OfferRecommendationInfoDTO recommendation;

  public OfferRecommendationDTO offer(OfferForRecommendationDTO offer) {
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
  public OfferForRecommendationDTO getOffer() {
    return offer;
  }

  public void setOffer(OfferForRecommendationDTO offer) {
    this.offer = offer;
  }

  public OfferRecommendationDTO recommendation(OfferRecommendationInfoDTO recommendation) {
    this.recommendation = recommendation;
    return this;
  }

   /**
   * Get recommendation
   * @return recommendation
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

