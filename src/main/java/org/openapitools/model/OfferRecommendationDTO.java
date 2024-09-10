package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.OfferForRecommendationDTO;
import org.openapitools.model.OfferRecommendationInfoDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о состоянии цен и рекомендации. 
 */

@Schema(name = "OfferRecommendationDTO", description = "Информация о состоянии цен и рекомендации. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferRecommendationDTO {

  private OfferForRecommendationDTO offer;

  private OfferRecommendationInfoDTO recommendation;

  public OfferRecommendationDTO offer(OfferForRecommendationDTO offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   */
  @Valid 
  @Schema(name = "offer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offer")
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
   */
  @Valid 
  @Schema(name = "recommendation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.offer, offerRecommendationDTO.offer) &&
        Objects.equals(this.recommendation, offerRecommendationDTO.recommendation);
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

