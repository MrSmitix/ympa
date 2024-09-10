package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.BasePriceDTO;
import org.openapitools.server.api.model.PriceCompetitivenessThresholdsDTO;

/**
 * Рекомендации, касающиеся цены на товар.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferRecommendationInfoDTO   {
  
  private String offerId;
  private BasePriceDTO recommendedCofinancePrice;
  private PriceCompetitivenessThresholdsDTO competitivenessThresholds;

  public OfferRecommendationInfoDTO () {

  }

  public OfferRecommendationInfoDTO (String offerId, BasePriceDTO recommendedCofinancePrice, PriceCompetitivenessThresholdsDTO competitivenessThresholds) {
    this.offerId = offerId;
    this.recommendedCofinancePrice = recommendedCofinancePrice;
    this.competitivenessThresholds = competitivenessThresholds;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("recommendedCofinancePrice")
  public BasePriceDTO getRecommendedCofinancePrice() {
    return recommendedCofinancePrice;
  }
  public void setRecommendedCofinancePrice(BasePriceDTO recommendedCofinancePrice) {
    this.recommendedCofinancePrice = recommendedCofinancePrice;
  }

    
  @JsonProperty("competitivenessThresholds")
  public PriceCompetitivenessThresholdsDTO getCompetitivenessThresholds() {
    return competitivenessThresholds;
  }
  public void setCompetitivenessThresholds(PriceCompetitivenessThresholdsDTO competitivenessThresholds) {
    this.competitivenessThresholds = competitivenessThresholds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferRecommendationInfoDTO offerRecommendationInfoDTO = (OfferRecommendationInfoDTO) o;
    return Objects.equals(offerId, offerRecommendationInfoDTO.offerId) &&
        Objects.equals(recommendedCofinancePrice, offerRecommendationInfoDTO.recommendedCofinancePrice) &&
        Objects.equals(competitivenessThresholds, offerRecommendationInfoDTO.competitivenessThresholds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, recommendedCofinancePrice, competitivenessThresholds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferRecommendationInfoDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    recommendedCofinancePrice: ").append(toIndentedString(recommendedCofinancePrice)).append("\n");
    sb.append("    competitivenessThresholds: ").append(toIndentedString(competitivenessThresholds)).append("\n");
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
