package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SkuBidRecommendationItemDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Список товаров с рекомендованными ставками.
 **/
@ApiModel(description = "Список товаров с рекомендованными ставками.")
@JsonTypeName("GetBidsRecommendationsResponseDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetBidsRecommendationsResponseDTO   {
  private @Valid List<@Valid SkuBidRecommendationItemDTO> recommendations = new ArrayList<>();

  /**
   * Список товаров с рекомендованными ставками.
   **/
  public GetBidsRecommendationsResponseDTO recommendations(List<@Valid SkuBidRecommendationItemDTO> recommendations) {
    this.recommendations = recommendations;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров с рекомендованными ставками.")
  @JsonProperty("recommendations")
  @NotNull @Valid public List<@Valid SkuBidRecommendationItemDTO> getRecommendations() {
    return recommendations;
  }

  @JsonProperty("recommendations")
  public void setRecommendations(List<@Valid SkuBidRecommendationItemDTO> recommendations) {
    this.recommendations = recommendations;
  }

  public GetBidsRecommendationsResponseDTO addRecommendationsItem(SkuBidRecommendationItemDTO recommendationsItem) {
    if (this.recommendations == null) {
      this.recommendations = new ArrayList<>();
    }

    this.recommendations.add(recommendationsItem);
    return this;
  }

  public GetBidsRecommendationsResponseDTO removeRecommendationsItem(SkuBidRecommendationItemDTO recommendationsItem) {
    if (recommendationsItem != null && this.recommendations != null) {
      this.recommendations.remove(recommendationsItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO = (GetBidsRecommendationsResponseDTO) o;
    return Objects.equals(this.recommendations, getBidsRecommendationsResponseDTO.recommendations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBidsRecommendationsResponseDTO {\n");
    
    sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
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

