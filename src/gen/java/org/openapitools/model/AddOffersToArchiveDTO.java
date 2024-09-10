package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AddOffersToArchiveErrorDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Товары, которые не удалось поместить в архив.
 */
@ApiModel(description="Товары, которые не удалось поместить в архив.")

public class AddOffersToArchiveDTO  {
  
 /**
  * Список товаров, которые не удалось поместить в архив.
  */
  @ApiModelProperty(value = "Список товаров, которые не удалось поместить в архив.")
  @Valid
  private List<@Valid AddOffersToArchiveErrorDTO> notArchivedOffers;
 /**
  * Список товаров, которые не удалось поместить в архив.
  * @return notArchivedOffers
  */
  @JsonProperty("notArchivedOffers")
  public List<@Valid AddOffersToArchiveErrorDTO> getNotArchivedOffers() {
    return notArchivedOffers;
  }

  /**
   * Sets the <code>notArchivedOffers</code> property.
   */
 public void setNotArchivedOffers(List<@Valid AddOffersToArchiveErrorDTO> notArchivedOffers) {
    this.notArchivedOffers = notArchivedOffers;
  }

  /**
   * Sets the <code>notArchivedOffers</code> property.
   */
  public AddOffersToArchiveDTO notArchivedOffers(List<@Valid AddOffersToArchiveErrorDTO> notArchivedOffers) {
    this.notArchivedOffers = notArchivedOffers;
    return this;
  }

  /**
   * Adds a new item to the <code>notArchivedOffers</code> list.
   */
  public AddOffersToArchiveDTO addNotArchivedOffersItem(AddOffersToArchiveErrorDTO notArchivedOffersItem) {
    this.notArchivedOffers.add(notArchivedOffersItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

