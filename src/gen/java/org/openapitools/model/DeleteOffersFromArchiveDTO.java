package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Товары, которые не удалось восстановить из архива.
 */
@ApiModel(description="Товары, которые не удалось восстановить из архива.")

public class DeleteOffersFromArchiveDTO  {
  
 /**
  * Список товаров, которые не удалось восстановить из архива.
  */
  @ApiModelProperty(value = "Список товаров, которые не удалось восстановить из архива.")
  private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notUnarchivedOfferIds;
 /**
  * Список товаров, которые не удалось восстановить из архива.
  * @return notUnarchivedOfferIds
  */
  @JsonProperty("notUnarchivedOfferIds")
  public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getNotUnarchivedOfferIds() {
    return notUnarchivedOfferIds;
  }

  /**
   * Sets the <code>notUnarchivedOfferIds</code> property.
   */
 public void setNotUnarchivedOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notUnarchivedOfferIds) {
    this.notUnarchivedOfferIds = notUnarchivedOfferIds;
  }

  /**
   * Sets the <code>notUnarchivedOfferIds</code> property.
   */
  public DeleteOffersFromArchiveDTO notUnarchivedOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notUnarchivedOfferIds) {
    this.notUnarchivedOfferIds = notUnarchivedOfferIds;
    return this;
  }

  /**
   * Adds a new item to the <code>notUnarchivedOfferIds</code> list.
   */
  public DeleteOffersFromArchiveDTO addNotUnarchivedOfferIdsItem(String notUnarchivedOfferIdsItem) {
    this.notUnarchivedOfferIds.add(notUnarchivedOfferIdsItem);
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
    DeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO = (DeleteOffersFromArchiveDTO) o;
    return Objects.equals(this.notUnarchivedOfferIds, deleteOffersFromArchiveDTO.notUnarchivedOfferIds);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

