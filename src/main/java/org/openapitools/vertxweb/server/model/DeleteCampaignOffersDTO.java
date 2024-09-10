package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteCampaignOffersDTO   {
  
  private List<String> notDeletedOfferIds;

  public DeleteCampaignOffersDTO () {

  }

  public DeleteCampaignOffersDTO (List<String> notDeletedOfferIds) {
    this.notDeletedOfferIds = notDeletedOfferIds;
  }

    
  @JsonProperty("notDeletedOfferIds")
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
    return Objects.equals(notDeletedOfferIds, deleteCampaignOffersDTO.notDeletedOfferIds);
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
