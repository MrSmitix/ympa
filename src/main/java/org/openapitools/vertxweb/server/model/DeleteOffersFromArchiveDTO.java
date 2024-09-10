package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Товары, которые не удалось восстановить из архива.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteOffersFromArchiveDTO   {
  
  private List<String> notUnarchivedOfferIds;

  public DeleteOffersFromArchiveDTO () {

  }

  public DeleteOffersFromArchiveDTO (List<String> notUnarchivedOfferIds) {
    this.notUnarchivedOfferIds = notUnarchivedOfferIds;
  }

    
  @JsonProperty("notUnarchivedOfferIds")
  public List<String> getNotUnarchivedOfferIds() {
    return notUnarchivedOfferIds;
  }
  public void setNotUnarchivedOfferIds(List<String> notUnarchivedOfferIds) {
    this.notUnarchivedOfferIds = notUnarchivedOfferIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO = (DeleteOffersFromArchiveDTO) o;
    return Objects.equals(notUnarchivedOfferIds, deleteOffersFromArchiveDTO.notUnarchivedOfferIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notUnarchivedOfferIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteOffersFromArchiveDTO {\n");
    
    sb.append("    notUnarchivedOfferIds: ").append(toIndentedString(notUnarchivedOfferIds)).append("\n");
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
