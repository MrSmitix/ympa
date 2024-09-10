package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 **/
@ApiModel(description="Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.")

public class DeleteCampaignOffersDTO  {
  
  @ApiModelProperty(value = "Список SKU.")
 /**
   * Список SKU.
  **/
  private List<String> notDeletedOfferIds;
 /**
   * Список SKU.
   * @return notDeletedOfferIds
  **/
  @JsonProperty("notDeletedOfferIds")
  public List<String> getNotDeletedOfferIds() {
    return notDeletedOfferIds;
  }

  public void setNotDeletedOfferIds(List<String> notDeletedOfferIds) {
    this.notDeletedOfferIds = notDeletedOfferIds;
  }

  public DeleteCampaignOffersDTO notDeletedOfferIds(List<String> notDeletedOfferIds) {
    this.notDeletedOfferIds = notDeletedOfferIds;
    return this;
  }

  public DeleteCampaignOffersDTO addNotDeletedOfferIdsItem(String notDeletedOfferIdsItem) {
    this.notDeletedOfferIds.add(notDeletedOfferIdsItem);
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
    DeleteCampaignOffersDTO deleteCampaignOffersDTO = (DeleteCampaignOffersDTO) o;
    return Objects.equals(this.notDeletedOfferIds, deleteCampaignOffersDTO.notDeletedOfferIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notDeletedOfferIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteCampaignOffersDTO {\n");
    
    sb.append("    notDeletedOfferIds: ").append(toIndentedString(notDeletedOfferIds)).append("\n");
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

