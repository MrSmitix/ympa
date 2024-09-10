package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SkuBidRecommendationItemDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список товаров с рекомендованными ставками.
 */
@ApiModel(description="Список товаров с рекомендованными ставками.")

public class GetBidsRecommendationsResponseDTO  {
  
 /**
  * Список товаров с рекомендованными ставками.
  */
  @ApiModelProperty(required = true, value = "Список товаров с рекомендованными ставками.")
  @Valid
  private List<@Valid SkuBidRecommendationItemDTO> recommendations = new ArrayList<>();
 /**
  * Список товаров с рекомендованными ставками.
  * @return recommendations
  */
  @JsonProperty("recommendations")
  @NotNull
  public List<@Valid SkuBidRecommendationItemDTO> getRecommendations() {
    return recommendations;
  }

  /**
   * Sets the <code>recommendations</code> property.
   */
 public void setRecommendations(List<@Valid SkuBidRecommendationItemDTO> recommendations) {
    this.recommendations = recommendations;
  }

  /**
   * Sets the <code>recommendations</code> property.
   */
  public GetBidsRecommendationsResponseDTO recommendations(List<@Valid SkuBidRecommendationItemDTO> recommendations) {
    this.recommendations = recommendations;
    return this;
  }

  /**
   * Adds a new item to the <code>recommendations</code> list.
   */
  public GetBidsRecommendationsResponseDTO addRecommendationsItem(SkuBidRecommendationItemDTO recommendationsItem) {
    this.recommendations.add(recommendationsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

