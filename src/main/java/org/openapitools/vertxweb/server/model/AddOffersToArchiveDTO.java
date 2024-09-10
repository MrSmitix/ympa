package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AddOffersToArchiveErrorDTO;

/**
 * Товары, которые не удалось поместить в архив.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddOffersToArchiveDTO   {
  
  private List<AddOffersToArchiveErrorDTO> notArchivedOffers;

  public AddOffersToArchiveDTO () {

  }

  public AddOffersToArchiveDTO (List<AddOffersToArchiveErrorDTO> notArchivedOffers) {
    this.notArchivedOffers = notArchivedOffers;
  }

    
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
