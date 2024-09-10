package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferRecommendationDTO;
import org.openapitools.model.ScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Список товаров с рекомендациями.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Список товаров с рекомендациями.")
public class OfferRecommendationsResultDTO   {
  
  private ScrollingPagerDTO paging;

  private List<@Valid OfferRecommendationDTO> offerRecommendations = new ArrayList<>();

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
  public OfferRecommendationsResultDTO offerRecommendations(List<@Valid OfferRecommendationDTO> offerRecommendations) {
    this.offerRecommendations = offerRecommendations;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Страница списка товаров.")
  @JsonProperty("offerRecommendations")
  @NotNull
  public List<@Valid OfferRecommendationDTO> getOfferRecommendations() {
    return offerRecommendations;
  }
  public void setOfferRecommendations(List<@Valid OfferRecommendationDTO> offerRecommendations) {
    this.offerRecommendations = offerRecommendations;
  }

  public OfferRecommendationsResultDTO addOfferRecommendationsItem(OfferRecommendationDTO offerRecommendationsItem) {
    if (this.offerRecommendations == null) {
      this.offerRecommendations = new ArrayList<>();
    }
    this.offerRecommendations.add(offerRecommendationsItem);
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

