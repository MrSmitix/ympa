package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SkuBidRecommendationItemDTO;



/**
 * Список товаров с рекомендованными ставками.
 **/

@ApiModel(description = "Список товаров с рекомендованными ставками.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetBidsRecommendationsResponseDTO   {
  @JsonProperty("recommendations")
  private List<SkuBidRecommendationItemDTO> recommendations = new ArrayList<>();

  /**
   * Список товаров с рекомендованными ставками.
   **/
  public GetBidsRecommendationsResponseDTO recommendations(List<SkuBidRecommendationItemDTO> recommendations) {
    this.recommendations = recommendations;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров с рекомендованными ставками.")
  @JsonProperty("recommendations")
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
    return Objects.equals(recommendations, getBidsRecommendationsResponseDTO.recommendations);
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

