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
 * Товары, которые не удалось восстановить из архива.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DeleteOffersFromArchiveDTO   {
  @JsonProperty("notUnarchivedOfferIds")
  
  private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notUnarchivedOfferIds = null;

  public DeleteOffersFromArchiveDTO notUnarchivedOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notUnarchivedOfferIds) {
    this.notUnarchivedOfferIds = notUnarchivedOfferIds;
    return this;
  }

  public DeleteOffersFromArchiveDTO addNotUnarchivedOfferIdsItem(String notUnarchivedOfferIdsItem) {
    if (this.notUnarchivedOfferIds == null) {
      this.notUnarchivedOfferIds = new ArrayList<>();
    }
    this.notUnarchivedOfferIds.add(notUnarchivedOfferIdsItem);
    return this;
  }

   /**
   * Список товаров, которые не удалось восстановить из архива.
   * @return notUnarchivedOfferIds
  **/
  public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getNotUnarchivedOfferIds() {
    return notUnarchivedOfferIds;
  }

  public void setNotUnarchivedOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> notUnarchivedOfferIds) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

