package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferForRecommendationDTO;
import org.openapitools.model.OfferRecommendationInfoDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о состоянии цен и рекомендации. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferRecommendationDTO   {
  
  private OfferForRecommendationDTO offer;
  private OfferRecommendationInfoDTO recommendation;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offer")
  @Valid
  public OfferForRecommendationDTO getOffer() {
    return offer;
  }
  public void setOffer(OfferForRecommendationDTO offer) {
    this.offer = offer;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recommendation")
  @Valid
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

