package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferForRecommendationDTO;
import org.openapitools.model.OfferRecommendationInfoDTO;



/**
 * Информация о состоянии цен и рекомендации. 
 **/

@ApiModel(description = "Информация о состоянии цен и рекомендации. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferRecommendationDTO   {
  @JsonProperty("offer")
  private OfferForRecommendationDTO offer;

  @JsonProperty("recommendation")
  private OfferRecommendationInfoDTO recommendation;

  /**
   **/
  public OfferRecommendationDTO offer(OfferForRecommendationDTO offer) {
    this.offer = offer;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("offer")
  public OfferForRecommendationDTO getOffer() {
    return offer;
  }
  public void setOffer(OfferForRecommendationDTO offer) {
    this.offer = offer;
  }

  /**
   **/
  public OfferRecommendationDTO recommendation(OfferRecommendationInfoDTO recommendation) {
    this.recommendation = recommendation;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

