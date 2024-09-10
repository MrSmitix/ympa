package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OfferProcessingNoteDTO;
import com.prokarma.pkmst.model.OfferProcessingStatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о статусе публикации товара на Маркете.
 */
@ApiModel(description = "Информация о статусе публикации товара на Маркете.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferProcessingStateDTO   {
  @JsonProperty("status")
  private OfferProcessingStatusType status;

  @JsonProperty("notes")
  
  private List<OfferProcessingNoteDTO> notes = null;

  public OfferProcessingStateDTO status(OfferProcessingStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @ApiModelProperty(value = "")
  public OfferProcessingStatusType getStatus() {
    return status;
  }

  public void setStatus(OfferProcessingStatusType status) {
    this.status = status;
  }

  public OfferProcessingStateDTO notes(List<OfferProcessingNoteDTO> notes) {
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
   */
  @ApiModelProperty(value = "Причины, по которым товар не прошел модерацию.")
  public List<OfferProcessingNoteDTO> getNotes() {
    return notes;
  }

  public void setNotes(List<OfferProcessingNoteDTO> notes) {
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

