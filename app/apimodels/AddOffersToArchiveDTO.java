package apimodels;

import apimodels.AddOffersToArchiveErrorDTO;
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
 * Товары, которые не удалось поместить в архив.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AddOffersToArchiveDTO   {
  @JsonProperty("notArchivedOffers")
  @Valid

  private List<@Valid AddOffersToArchiveErrorDTO> notArchivedOffers = null;

  public AddOffersToArchiveDTO notArchivedOffers(List<@Valid AddOffersToArchiveErrorDTO> notArchivedOffers) {
    this.notArchivedOffers = notArchivedOffers;
    return this;
  }

  public AddOffersToArchiveDTO addNotArchivedOffersItem(AddOffersToArchiveErrorDTO notArchivedOffersItem) {
    if (this.notArchivedOffers == null) {
      this.notArchivedOffers = new ArrayList<>();
    }
    this.notArchivedOffers.add(notArchivedOffersItem);
    return this;
  }

   /**
   * Список товаров, которые не удалось поместить в архив.
   * @return notArchivedOffers
  **/
  public List<@Valid AddOffersToArchiveErrorDTO> getNotArchivedOffers() {
    return notArchivedOffers;
  }

  public void setNotArchivedOffers(List<@Valid AddOffersToArchiveErrorDTO> notArchivedOffers) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

