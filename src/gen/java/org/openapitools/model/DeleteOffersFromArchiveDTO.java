package org.openapitools.model;

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
 * Товары, которые не удалось восстановить из архива.
 **/

@ApiModel(description = "Товары, которые не удалось восстановить из архива.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeleteOffersFromArchiveDTO   {
  @JsonProperty("notUnarchivedOfferIds")
  private List<String> notUnarchivedOfferIds = null;

  /**
   * Список товаров, которые не удалось восстановить из архива.
   **/
  public DeleteOffersFromArchiveDTO notUnarchivedOfferIds(List<String> notUnarchivedOfferIds) {
    this.notUnarchivedOfferIds = notUnarchivedOfferIds;
    return this;
  }

  
  @ApiModelProperty(value = "Список товаров, которые не удалось восстановить из архива.")
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

