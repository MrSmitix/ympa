package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.SkuBidRecommendationItemDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Список товаров с рекомендованными ставками.
 */
@ApiModel(description = "Список товаров с рекомендованными ставками.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetBidsRecommendationsResponseDTO   {
  @JsonProperty("recommendations")
  
  private List<SkuBidRecommendationItemDTO> recommendations = new ArrayList<>();

  public GetBidsRecommendationsResponseDTO recommendations(List<SkuBidRecommendationItemDTO> recommendations) {
    this.recommendations = recommendations;
    return this;
  }

  public GetBidsRecommendationsResponseDTO addRecommendationsItem(SkuBidRecommendationItemDTO recommendationsItem) {
    if (this.recommendations == null) {
      this.recommendations = new ArrayList<>();
    }
    this.recommendations.add(recommendationsItem);
    return this;
  }

  /**
   * Список товаров с рекомендованными ставками.
   * @return recommendations
   */
  @ApiModelProperty(required = true, value = "Список товаров с рекомендованными ставками.")
  public List<SkuBidRecommendationItemDTO> getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(List<SkuBidRecommendationItemDTO> recommendations) {
    this.recommendations = recommendations;
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

