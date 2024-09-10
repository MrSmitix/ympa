package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 */
@ApiModel(description = "Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeleteCampaignOffersDTO   {
  @JsonProperty("notDeletedOfferIds")
  
  private List<String> notDeletedOfferIds = null;

  public DeleteCampaignOffersDTO notDeletedOfferIds(List<String> notDeletedOfferIds) {
    this.notDeletedOfferIds = notDeletedOfferIds;
    return this;
  }

  public DeleteCampaignOffersDTO addNotDeletedOfferIdsItem(String notDeletedOfferIdsItem) {
    if (this.notDeletedOfferIds == null) {
      this.notDeletedOfferIds = new ArrayList<>();
    }
    this.notDeletedOfferIds.add(notDeletedOfferIdsItem);
    return this;
  }

  /**
   * Список SKU.
   * @return notDeletedOfferIds
   */
  @ApiModelProperty(value = "Список SKU.")
  public List<String> getNotDeletedOfferIds() {
    return notDeletedOfferIds;
  }

  public void setNotDeletedOfferIds(List<String> notDeletedOfferIds) {
    this.notDeletedOfferIds = notDeletedOfferIds;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

