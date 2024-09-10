package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.SkuBidRecommendationItemDTO;

/**
 * Список товаров с рекомендованными ставками.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBidsRecommendationsResponseDTO   {
  
  private List<SkuBidRecommendationItemDTO> recommendations = new ArrayList<>();

  public GetBidsRecommendationsResponseDTO () {

  }

  public GetBidsRecommendationsResponseDTO (List<SkuBidRecommendationItemDTO> recommendations) {
    this.recommendations = recommendations;
  }

    
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
