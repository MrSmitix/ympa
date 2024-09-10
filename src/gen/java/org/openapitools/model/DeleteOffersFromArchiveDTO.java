package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Товары, которые не удалось восстановить из архива.
 **/
@ApiModel(description = "Товары, которые не удалось восстановить из архива.")
@JsonTypeName("DeleteOffersFromArchiveDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeleteOffersFromArchiveDTO   {
  private @Valid List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notUnarchivedOfferIds;

  /**
   * Список товаров, которые не удалось восстановить из архива.
   **/
  public DeleteOffersFromArchiveDTO notUnarchivedOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notUnarchivedOfferIds) {
    this.notUnarchivedOfferIds = notUnarchivedOfferIds;
    return this;
  }

  
  @ApiModelProperty(value = "Список товаров, которые не удалось восстановить из архива.")
  @JsonProperty("notUnarchivedOfferIds")
  public List< @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)String> getNotUnarchivedOfferIds() {
    return notUnarchivedOfferIds;
  }

  @JsonProperty("notUnarchivedOfferIds")
  public void setNotUnarchivedOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notUnarchivedOfferIds) {
    this.notUnarchivedOfferIds = notUnarchivedOfferIds;
  }

  public DeleteOffersFromArchiveDTO addNotUnarchivedOfferIdsItem(String notUnarchivedOfferIdsItem) {
    if (this.notUnarchivedOfferIds == null) {
      this.notUnarchivedOfferIds = new ArrayList<>();
    }

    this.notUnarchivedOfferIds.add(notUnarchivedOfferIdsItem);
    return this;
  }

  public DeleteOffersFromArchiveDTO removeNotUnarchivedOfferIdsItem(String notUnarchivedOfferIdsItem) {
    if (notUnarchivedOfferIdsItem != null && this.notUnarchivedOfferIds != null) {
      this.notUnarchivedOfferIds.remove(notUnarchivedOfferIdsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

