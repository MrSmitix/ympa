package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.OfferRecommendationDTO;
import com.prokarma.pkmst.model.ScrollingPagerDTO;
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
 * Список товаров с рекомендациями.
 */
@ApiModel(description = "Список товаров с рекомендациями.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferRecommendationsResultDTO   {
  @JsonProperty("paging")
  private ScrollingPagerDTO paging;

  @JsonProperty("offerRecommendations")
  
  private List<OfferRecommendationDTO> offerRecommendations = new ArrayList<>();

  public OfferRecommendationsResultDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   */
  @ApiModelProperty(value = "")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public OfferRecommendationsResultDTO offerRecommendations(List<OfferRecommendationDTO> offerRecommendations) {
    this.offerRecommendations = offerRecommendations;
    return this;
  }

  public OfferRecommendationsResultDTO addOfferRecommendationsItem(OfferRecommendationDTO offerRecommendationsItem) {
    if (this.offerRecommendations == null) {
      this.offerRecommendations = new ArrayList<>();
    }
    this.offerRecommendations.add(offerRecommendationsItem);
    return this;
  }

  /**
   * Страница списка товаров.
   * @return offerRecommendations
   */
  @ApiModelProperty(required = true, value = "Страница списка товаров.")
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
    return Objects.equals(this.paging, offerRecommendationsResultDTO.paging) &&
        Objects.equals(this.offerRecommendations, offerRecommendationsResultDTO.offerRecommendations);
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

