package apimodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DeleteCampaignOffersDTO   {
  @JsonProperty("notDeletedOfferIds")
  
  private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notDeletedOfferIds = null;

  public DeleteCampaignOffersDTO notDeletedOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notDeletedOfferIds) {
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
  **/
  public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getNotDeletedOfferIds() {
    return notDeletedOfferIds;
  }

  public void setNotDeletedOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notDeletedOfferIds) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

