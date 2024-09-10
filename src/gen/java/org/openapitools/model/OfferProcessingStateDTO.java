package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferProcessingNoteDTO;
import org.openapitools.model.OfferProcessingStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация о статусе публикации товара на Маркете.
 **/
@ApiModel(description = "Информация о статусе публикации товара на Маркете.")
@JsonTypeName("OfferProcessingStateDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferProcessingStateDTO   {
  private OfferProcessingStatusType status;
  private @Valid List<@Valid OfferProcessingNoteDTO> notes;

  /**
   **/
  public OfferProcessingStateDTO status(OfferProcessingStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public OfferProcessingStatusType getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(OfferProcessingStatusType status) {
    this.status = status;
  }

  /**
   * Причины, по которым товар не прошел модерацию.
   **/
  public OfferProcessingStateDTO notes(List<@Valid OfferProcessingNoteDTO> notes) {
    this.notes = notes;
    return this;
  }

  
  @ApiModelProperty(value = "Причины, по которым товар не прошел модерацию.")
  @JsonProperty("notes")
  @Valid public List<@Valid OfferProcessingNoteDTO> getNotes() {
    return notes;
  }

  @JsonProperty("notes")
  public void setNotes(List<@Valid OfferProcessingNoteDTO> notes) {
    this.notes = notes;
  }

  public OfferProcessingStateDTO addNotesItem(OfferProcessingNoteDTO notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }

    this.notes.add(notesItem);
    return this;
  }

  public OfferProcessingStateDTO removeNotesItem(OfferProcessingNoteDTO notesItem) {
    if (notesItem != null && this.notes != null) {
      this.notes.remove(notesItem);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

