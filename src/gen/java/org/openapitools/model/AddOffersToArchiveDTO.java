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
import org.openapitools.model.AddOffersToArchiveErrorDTO;



/**
 * Товары, которые не удалось поместить в архив.
 **/

@ApiModel(description = "Товары, которые не удалось поместить в архив.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AddOffersToArchiveDTO   {
  @JsonProperty("notArchivedOffers")
  private List<AddOffersToArchiveErrorDTO> notArchivedOffers = null;

  /**
   * Список товаров, которые не удалось поместить в архив.
   **/
  public AddOffersToArchiveDTO notArchivedOffers(List<AddOffersToArchiveErrorDTO> notArchivedOffers) {
    this.notArchivedOffers = notArchivedOffers;
    return this;
  }

  
  @ApiModelProperty(value = "Список товаров, которые не удалось поместить в архив.")
  @JsonProperty("notArchivedOffers")
  public List<AddOffersToArchiveErrorDTO> getNotArchivedOffers() {
    return notArchivedOffers;
  }
  public void setNotArchivedOffers(List<AddOffersToArchiveErrorDTO> notArchivedOffers) {
    this.notArchivedOffers = notArchivedOffers;
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
    return Objects.equals(notArchivedOffers, addOffersToArchiveDTO.notArchivedOffers);
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

