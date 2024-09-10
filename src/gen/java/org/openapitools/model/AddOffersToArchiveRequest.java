package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Товары, которые нужно поместить в архив. 
 **/
@ApiModel(description="Товары, которые нужно поместить в архив. ")

public class AddOffersToArchiveRequest  {
  
  @ApiModelProperty(required = true, value = "Список товаров, которые нужно поместить в архив.")
 /**
   * Список товаров, которые нужно поместить в архив.
  **/
  private List<String> offerIds = new ArrayList<>();
 /**
   * Список товаров, которые нужно поместить в архив.
   * @return offerIds
  **/
  @JsonProperty("offerIds")
  public List<String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(List<String> offerIds) {
    this.offerIds = offerIds;
  }

  public AddOffersToArchiveRequest offerIds(List<String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  public AddOffersToArchiveRequest addOfferIdsItem(String offerIdsItem) {
    this.offerIds.add(offerIdsItem);
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
    AddOffersToArchiveRequest addOffersToArchiveRequest = (AddOffersToArchiveRequest) o;
    return Objects.equals(this.offerIds, addOffersToArchiveRequest.offerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOffersToArchiveRequest {\n");
    
    sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
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

