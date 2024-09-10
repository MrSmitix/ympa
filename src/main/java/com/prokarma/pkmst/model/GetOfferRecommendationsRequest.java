package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.FieldStateType;
import com.prokarma.pkmst.model.PriceCompetitivenessType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * GetOfferRecommendationsRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOfferRecommendationsRequest   {
  @JsonProperty("offerIds")
  
  private List<String> offerIds = null;

  @JsonProperty("cofinancePriceFilter")
  private FieldStateType cofinancePriceFilter;

  @JsonProperty("recommendedCofinancePriceFilter")
  private FieldStateType recommendedCofinancePriceFilter;

  @JsonProperty("competitivenessFilter")
  private PriceCompetitivenessType competitivenessFilter;

  public GetOfferRecommendationsRequest offerIds(List<String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  public GetOfferRecommendationsRequest addOfferIdsItem(String offerIdsItem) {
    if (this.offerIds == null) {
      this.offerIds = new ArrayList<>();
    }
    this.offerIds.add(offerIdsItem);
    return this;
  }

  /**
   * Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
   * @return offerIds
   */
  @ApiModelProperty(value = "Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.")
  public List<String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(List<String> offerIds) {
    this.offerIds = offerIds;
  }

  public GetOfferRecommendationsRequest cofinancePriceFilter(FieldStateType cofinancePriceFilter) {
    this.cofinancePriceFilter = cofinancePriceFilter;
    return this;
  }

  /**
   * Get cofinancePriceFilter
   * @return cofinancePriceFilter
   */
  @ApiModelProperty(value = "")
  public FieldStateType getCofinancePriceFilter() {
    return cofinancePriceFilter;
  }

  public void setCofinancePriceFilter(FieldStateType cofinancePriceFilter) {
    this.cofinancePriceFilter = cofinancePriceFilter;
  }

  public GetOfferRecommendationsRequest recommendedCofinancePriceFilter(FieldStateType recommendedCofinancePriceFilter) {
    this.recommendedCofinancePriceFilter = recommendedCofinancePriceFilter;
    return this;
  }

  /**
   * Get recommendedCofinancePriceFilter
   * @return recommendedCofinancePriceFilter
   */
  @ApiModelProperty(value = "")
  public FieldStateType getRecommendedCofinancePriceFilter() {
    return recommendedCofinancePriceFilter;
  }

  public void setRecommendedCofinancePriceFilter(FieldStateType recommendedCofinancePriceFilter) {
    this.recommendedCofinancePriceFilter = recommendedCofinancePriceFilter;
  }

  public GetOfferRecommendationsRequest competitivenessFilter(PriceCompetitivenessType competitivenessFilter) {
    this.competitivenessFilter = competitivenessFilter;
    return this;
  }

  /**
   * Get competitivenessFilter
   * @return competitivenessFilter
   */
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.offerIds, getOfferRecommendationsRequest.offerIds) &&
        Objects.equals(this.cofinancePriceFilter, getOfferRecommendationsRequest.cofinancePriceFilter) &&
        Objects.equals(this.recommendedCofinancePriceFilter, getOfferRecommendationsRequest.recommendedCofinancePriceFilter) &&
        Objects.equals(this.competitivenessFilter, getOfferRecommendationsRequest.competitivenessFilter);
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

