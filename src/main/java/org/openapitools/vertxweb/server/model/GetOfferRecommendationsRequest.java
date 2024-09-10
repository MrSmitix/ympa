package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.FieldStateType;
import org.openapitools.vertxweb.server.model.PriceCompetitivenessType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOfferRecommendationsRequest   {
  
  private List<String> offerIds;
  private FieldStateType cofinancePriceFilter;
  private FieldStateType recommendedCofinancePriceFilter;
  private PriceCompetitivenessType competitivenessFilter;

  public GetOfferRecommendationsRequest () {

  }

  public GetOfferRecommendationsRequest (List<String> offerIds, FieldStateType cofinancePriceFilter, FieldStateType recommendedCofinancePriceFilter, PriceCompetitivenessType competitivenessFilter) {
    this.offerIds = offerIds;
    this.cofinancePriceFilter = cofinancePriceFilter;
    this.recommendedCofinancePriceFilter = recommendedCofinancePriceFilter;
    this.competitivenessFilter = competitivenessFilter;
  }

    
  @JsonProperty("offerIds")
  public List<String> getOfferIds() {
    return offerIds;
  }
  public void setOfferIds(List<String> offerIds) {
    this.offerIds = offerIds;
  }

    
  @JsonProperty("cofinancePriceFilter")
  public FieldStateType getCofinancePriceFilter() {
    return cofinancePriceFilter;
  }
  public void setCofinancePriceFilter(FieldStateType cofinancePriceFilter) {
    this.cofinancePriceFilter = cofinancePriceFilter;
  }

    
  @JsonProperty("recommendedCofinancePriceFilter")
  public FieldStateType getRecommendedCofinancePriceFilter() {
    return recommendedCofinancePriceFilter;
  }
  public void setRecommendedCofinancePriceFilter(FieldStateType recommendedCofinancePriceFilter) {
    this.recommendedCofinancePriceFilter = recommendedCofinancePriceFilter;
  }

    
  @JsonProperty("competitivenessFilter")
  public PriceCompetitivenessType getCompetitivenessFilter() {
    return competitivenessFilter;
  }
  public void setCompetitivenessFilter(PriceCompetitivenessType competitivenessFilter) {
    this.competitivenessFilter = competitivenessFilter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOfferRecommendationsRequest getOfferRecommendationsRequest = (GetOfferRecommendationsRequest) o;
    return Objects.equals(offerIds, getOfferRecommendationsRequest.offerIds) &&
        Objects.equals(cofinancePriceFilter, getOfferRecommendationsRequest.cofinancePriceFilter) &&
        Objects.equals(recommendedCofinancePriceFilter, getOfferRecommendationsRequest.recommendedCofinancePriceFilter) &&
        Objects.equals(competitivenessFilter, getOfferRecommendationsRequest.competitivenessFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerIds, cofinancePriceFilter, recommendedCofinancePriceFilter, competitivenessFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOfferRecommendationsRequest {\n");
    
    sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
    sb.append("    cofinancePriceFilter: ").append(toIndentedString(cofinancePriceFilter)).append("\n");
    sb.append("    recommendedCofinancePriceFilter: ").append(toIndentedString(recommendedCofinancePriceFilter)).append("\n");
    sb.append("    competitivenessFilter: ").append(toIndentedString(competitivenessFilter)).append("\n");
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
