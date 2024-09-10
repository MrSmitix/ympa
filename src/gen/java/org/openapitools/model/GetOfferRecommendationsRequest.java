package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FieldStateType;
import org.openapitools.model.PriceCompetitivenessType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-09-09T22:24:51.464705463Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOfferRecommendationsRequest   {
  
  private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds;
  private FieldStateType cofinancePriceFilter;
  private FieldStateType recommendedCofinancePriceFilter;
  private PriceCompetitivenessType competitivenessFilter;

  /**
   * Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
   **/
  
  @ApiModelProperty(value = "Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.")
  @JsonProperty("offerIds")
  public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
    return offerIds;
  }
  public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cofinancePriceFilter")
  public FieldStateType getCofinancePriceFilter() {
    return cofinancePriceFilter;
  }
  public void setCofinancePriceFilter(FieldStateType cofinancePriceFilter) {
    this.cofinancePriceFilter = cofinancePriceFilter;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("recommendedCofinancePriceFilter")
  public FieldStateType getRecommendedCofinancePriceFilter() {
    return recommendedCofinancePriceFilter;
  }
  public void setRecommendedCofinancePriceFilter(FieldStateType recommendedCofinancePriceFilter) {
    this.recommendedCofinancePriceFilter = recommendedCofinancePriceFilter;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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

