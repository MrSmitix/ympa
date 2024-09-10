package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferProcessingNoteDTO;
import org.openapitools.model.OfferProcessingStatusType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о статусе публикации товара на Маркете.
 */

@Schema(name = "OfferProcessingStateDTO", description = "Информация о статусе публикации товара на Маркете.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferProcessingStateDTO {

  private OfferProcessingStatusType status;

  @Valid
  private JsonNullable<List<@Valid OfferProcessingNoteDTO>> notes = JsonNullable.<List<@Valid OfferProcessingNoteDTO>>undefined();

  public OfferProcessingStateDTO status(OfferProcessingStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public OfferProcessingStatusType getStatus() {
    return status;
  }

  public void setStatus(OfferProcessingStatusType status) {
    this.status = status;
  }

  public OfferProcessingStateDTO notes(List<@Valid OfferProcessingNoteDTO> notes) {
    this.notes = JsonNullable.of(notes);
    return this;
  }

  public OfferProcessingStateDTO addNotesItem(OfferProcessingNoteDTO notesItem) {
    if (this.notes == null || !this.notes.isPresent()) {
      this.notes = JsonNullable.of(new ArrayList<>());
    }
    this.notes.get().add(notesItem);
    return this;
  }

  /**
   * Причины, по которым товар не прошел модерацию.
   * @return notes
   */
  @Valid 
  @Schema(name = "notes", description = "Причины, по которым товар не прошел модерацию.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public JsonNullable<List<@Valid OfferProcessingNoteDTO>> getNotes() {
    return notes;
  }

  public void setNotes(JsonNullable<List<@Valid OfferProcessingNoteDTO>> notes) {
    this.notes = notes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferProcessingStateDTO offerProcessingStateDTO = (OfferProcessingStateDTO) o;
    return Objects.equals(this.status, offerProcessingStateDTO.status) &&
        equalsNullable(this.notes, offerProcessingStateDTO.notes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, hashCodeNullable(notes));
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
    sb.append("class OfferProcessingStateDTO {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

