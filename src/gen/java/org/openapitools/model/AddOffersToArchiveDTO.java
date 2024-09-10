package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AddOffersToArchiveErrorDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Товары, которые не удалось поместить в архив.
 **/
@ApiModel(description = "Товары, которые не удалось поместить в архив.")
@JsonTypeName("AddOffersToArchiveDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AddOffersToArchiveDTO   {
  private @Valid List<@Valid AddOffersToArchiveErrorDTO> notArchivedOffers;

  /**
   * Список товаров, которые не удалось поместить в архив.
   **/
  public AddOffersToArchiveDTO notArchivedOffers(List<@Valid AddOffersToArchiveErrorDTO> notArchivedOffers) {
    this.notArchivedOffers = notArchivedOffers;
    return this;
  }

  
  @ApiModelProperty(value = "Список товаров, которые не удалось поместить в архив.")
  @JsonProperty("notArchivedOffers")
  @Valid public List<@Valid AddOffersToArchiveErrorDTO> getNotArchivedOffers() {
    return notArchivedOffers;
  }

  @JsonProperty("notArchivedOffers")
  public void setNotArchivedOffers(List<@Valid AddOffersToArchiveErrorDTO> notArchivedOffers) {
    this.notArchivedOffers = notArchivedOffers;
  }

  public AddOffersToArchiveDTO addNotArchivedOffersItem(AddOffersToArchiveErrorDTO notArchivedOffersItem) {
    if (this.notArchivedOffers == null) {
      this.notArchivedOffers = new ArrayList<>();
    }

    this.notArchivedOffers.add(notArchivedOffersItem);
    return this;
  }

  public AddOffersToArchiveDTO removeNotArchivedOffersItem(AddOffersToArchiveErrorDTO notArchivedOffersItem) {
    if (notArchivedOffersItem != null && this.notArchivedOffers != null) {
      this.notArchivedOffers.remove(notArchivedOffersItem);
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
    AddOffersToArchiveDTO addOffersToArchiveDTO = (AddOffersToArchiveDTO) o;
    return Objects.equals(this.notArchivedOffers, addOffersToArchiveDTO.notArchivedOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notArchivedOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOffersToArchiveDTO {\n");
    
    sb.append("    notArchivedOffers: ").append(toIndentedString(notArchivedOffers)).append("\n");
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

