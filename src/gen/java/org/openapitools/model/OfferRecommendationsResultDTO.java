package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferRecommendationDTO;
import org.openapitools.model.ScrollingPagerDTO;



/**
 * Список товаров с рекомендациями.
 **/

@ApiModel(description = "Список товаров с рекомендациями.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferRecommendationsResultDTO   {
  @JsonProperty("paging")
  private ScrollingPagerDTO paging;

  @JsonProperty("offerRecommendations")
  private List<OfferRecommendationDTO> offerRecommendations = new ArrayList<>();

  /**
   **/
  public OfferRecommendationsResultDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Страница списка товаров.
   **/
  public OfferRecommendationsResultDTO offerRecommendations(List<OfferRecommendationDTO> offerRecommendations) {
    this.offerRecommendations = offerRecommendations;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Страница списка товаров.")
  @JsonProperty("offerRecommendations")
  public List<OfferRecommendationDTO> getOfferRecommendations() {
    return offerRecommendations;
  }
  public void setOfferRecommendations(List<OfferRecommendationDTO> offerRecommendations) {
    this.offerRecommendations = offerRecommendations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferRecommendationsResultDTO offerRecommendationsResultDTO = (OfferRecommendationsResultDTO) o;
    return Objects.equals(paging, offerRecommendationsResultDTO.paging) &&
        Objects.equals(offerRecommendations, offerRecommendationsResultDTO.offerRecommendations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, offerRecommendations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferRecommendationsResultDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    offerRecommendations: ").append(toIndentedString(offerRecommendations)).append("\n");
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

