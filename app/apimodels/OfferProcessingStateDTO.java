package apimodels;

import apimodels.OfferProcessingNoteDTO;
import apimodels.OfferProcessingStatusType;
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
 * Информация о статусе публикации товара на Маркете.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferProcessingStateDTO   {
  @JsonProperty("status")
  @Valid

  private OfferProcessingStatusType status;

  @JsonProperty("notes")
  @Valid

  private List<@Valid OfferProcessingNoteDTO> notes = null;

  public OfferProcessingStateDTO status(OfferProcessingStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public OfferProcessingStatusType getStatus() {
    return status;
  }

  public void setStatus(OfferProcessingStatusType status) {
    this.status = status;
  }

  public OfferProcessingStateDTO notes(List<@Valid OfferProcessingNoteDTO> notes) {
    this.notes = notes;
    return this;
  }

  public OfferProcessingStateDTO addNotesItem(OfferProcessingNoteDTO notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Причины, по которым товар не прошел модерацию.
   * @return notes
  **/
  public List<@Valid OfferProcessingNoteDTO> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid OfferProcessingNoteDTO> notes) {
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
    return Objects.equals(status, offerProcessingStateDTO.status) &&
        Objects.equals(notes, offerProcessingStateDTO.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, notes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

