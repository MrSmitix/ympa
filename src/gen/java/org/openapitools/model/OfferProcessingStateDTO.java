package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferProcessingNoteDTO;
import org.openapitools.model.OfferProcessingStatusType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о статусе публикации товара на Маркете.
 **/
@ApiModel(description="Информация о статусе публикации товара на Маркете.")

public class OfferProcessingStateDTO  {
  
  @ApiModelProperty(value = "")
  private OfferProcessingStatusType status;

  @ApiModelProperty(value = "Причины, по которым товар не прошел модерацию.")
 /**
   * Причины, по которым товар не прошел модерацию.
  **/
  private List<OfferProcessingNoteDTO> notes;
 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public OfferProcessingStatusType getStatus() {
    return status;
  }

  public void setStatus(OfferProcessingStatusType status) {
    this.status = status;
  }

  public OfferProcessingStateDTO status(OfferProcessingStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Причины, по которым товар не прошел модерацию.
   * @return notes
  **/
  @JsonProperty("notes")
  public List<OfferProcessingNoteDTO> getNotes() {
    return notes;
  }

  public void setNotes(List<OfferProcessingNoteDTO> notes) {
    this.notes = notes;
  }

  public OfferProcessingStateDTO notes(List<OfferProcessingNoteDTO> notes) {
    this.notes = notes;
    return this;
  }

  public OfferProcessingStateDTO addNotesItem(OfferProcessingNoteDTO notesItem) {
    this.notes.add(notesItem);
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
    OfferProcessingStateDTO offerProcessingStateDTO = (OfferProcessingStateDTO) o;
    return Objects.equals(this.status, offerProcessingStateDTO.status) &&
        Objects.equals(this.notes, offerProcessingStateDTO.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, notes);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

