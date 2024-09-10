package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Фильтрации удаляемых товаров по offerIds. 
 **/
@ApiModel(description="Фильтрации удаляемых товаров по offerIds. ")

public class DeleteCampaignOffersRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификаторы товаров в каталоге.")
 /**
   * Идентификаторы товаров в каталоге.
  **/
  private List<String> offerIds = new ArrayList<>();
 /**
   * Идентификаторы товаров в каталоге.
   * @return offerIds
  **/
  @JsonProperty("offerIds")
  public List<String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(List<String> offerIds) {
    this.offerIds = offerIds;
  }

  public DeleteCampaignOffersRequest offerIds(List<String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  public DeleteCampaignOffersRequest addOfferIdsItem(String offerIdsItem) {
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
    DeleteCampaignOffersRequest deleteCampaignOffersRequest = (DeleteCampaignOffersRequest) o;
    return Objects.equals(this.offerIds, deleteCampaignOffersRequest.offerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteCampaignOffersRequest {\n");
    
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

