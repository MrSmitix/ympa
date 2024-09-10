package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SkuBidRecommendationItemDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список товаров с рекомендованными ставками.
 */

@Schema(name = "GetBidsRecommendationsResponseDTO", description = "Список товаров с рекомендованными ставками.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetBidsRecommendationsResponseDTO {

  @Valid
  private List<@Valid SkuBidRecommendationItemDTO> recommendations = new ArrayList<>();

  public GetBidsRecommendationsResponseDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetBidsRecommendationsResponseDTO(List<@Valid SkuBidRecommendationItemDTO> recommendations) {
    this.recommendations = recommendations;
  }

  public GetBidsRecommendationsResponseDTO recommendations(List<@Valid SkuBidRecommendationItemDTO> recommendations) {
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
  @NotNull @Valid 
  @Schema(name = "recommendations", description = "Список товаров с рекомендованными ставками.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recommendations")
  public List<@Valid SkuBidRecommendationItemDTO> getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(List<@Valid SkuBidRecommendationItemDTO> recommendations) {
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

