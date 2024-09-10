/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Список товаров с рекомендованными ставками.
 */
@ApiModel(description = "Список товаров с рекомендованными ставками.")
@JsonPropertyOrder({
  GetBidsRecommendationsResponseDTO.JSON_PROPERTY_RECOMMENDATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetBidsRecommendationsResponseDTO   {
  public static final String JSON_PROPERTY_RECOMMENDATIONS = "recommendations";
  @JsonProperty(JSON_PROPERTY_RECOMMENDATIONS)
  private List<@Valid SkuBidRecommendationItemDTO> recommendations = new ArrayList<>();

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
   **/
  @JsonProperty(value = "recommendations")
  @ApiModelProperty(required = true, value = "Список товаров с рекомендованными ставками.")
  @NotNull @Valid 
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

