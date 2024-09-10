package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferRecommendationDTO;
import org.openapitools.model.ScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список товаров с рекомендациями.
 */
@ApiModel(description="Список товаров с рекомендациями.")

public class OfferRecommendationsResultDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ScrollingPagerDTO paging;

 /**
  * Страница списка товаров.
  */
  @ApiModelProperty(required = true, value = "Страница списка товаров.")
  @Valid
  private List<@Valid OfferRecommendationDTO> offerRecommendations = new ArrayList<>();
 /**
  * Get paging
  * @return paging
  */
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
 public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
  public OfferRecommendationsResultDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

 /**
  * Страница списка товаров.
  * @return offerRecommendations
  */
  @JsonProperty("offerRecommendations")
  @NotNull
  public List<@Valid OfferRecommendationDTO> getOfferRecommendations() {
    return offerRecommendations;
  }

  /**
   * Sets the <code>offerRecommendations</code> property.
   */
 public void setOfferRecommendations(List<@Valid OfferRecommendationDTO> offerRecommendations) {
    this.offerRecommendations = offerRecommendations;
  }

  /**
   * Sets the <code>offerRecommendations</code> property.
   */
  public OfferRecommendationsResultDTO offerRecommendations(List<@Valid OfferRecommendationDTO> offerRecommendations) {
    this.offerRecommendations = offerRecommendations;
    return this;
  }

  /**
   * Adds a new item to the <code>offerRecommendations</code> list.
   */
  public OfferRecommendationsResultDTO addOfferRecommendationsItem(OfferRecommendationDTO offerRecommendationsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

