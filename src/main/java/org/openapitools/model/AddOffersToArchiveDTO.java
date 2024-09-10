package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AddOffersToArchiveErrorDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Товары, которые не удалось поместить в архив.
 */

@Schema(name = "AddOffersToArchiveDTO", description = "Товары, которые не удалось поместить в архив.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AddOffersToArchiveDTO {

  @Valid
  private JsonNullable<List<@Valid AddOffersToArchiveErrorDTO>> notArchivedOffers = JsonNullable.<List<@Valid AddOffersToArchiveErrorDTO>>undefined();

  public AddOffersToArchiveDTO notArchivedOffers(List<@Valid AddOffersToArchiveErrorDTO> notArchivedOffers) {
    this.notArchivedOffers = JsonNullable.of(notArchivedOffers);
    return this;
  }

  public AddOffersToArchiveDTO addNotArchivedOffersItem(AddOffersToArchiveErrorDTO notArchivedOffersItem) {
    if (this.notArchivedOffers == null || !this.notArchivedOffers.isPresent()) {
      this.notArchivedOffers = JsonNullable.of(new ArrayList<>());
    }
    this.notArchivedOffers.get().add(notArchivedOffersItem);
    return this;
  }

  /**
   * Список товаров, которые не удалось поместить в архив.
   * @return notArchivedOffers
   */
  @Valid 
  @Schema(name = "notArchivedOffers", description = "Список товаров, которые не удалось поместить в архив.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notArchivedOffers")
  public JsonNullable<List<@Valid AddOffersToArchiveErrorDTO>> getNotArchivedOffers() {
    return notArchivedOffers;
  }

  public void setNotArchivedOffers(JsonNullable<List<@Valid AddOffersToArchiveErrorDTO>> notArchivedOffers) {
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
    return equalsNullable(this.notArchivedOffers, addOffersToArchiveDTO.notArchivedOffers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(notArchivedOffers));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

