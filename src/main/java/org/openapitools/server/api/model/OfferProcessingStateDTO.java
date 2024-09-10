package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.OfferProcessingNoteDTO;
import org.openapitools.server.api.model.OfferProcessingStatusType;

/**
 * Информация о статусе публикации товара на Маркете.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferProcessingStateDTO   {
  
  private OfferProcessingStatusType status;
  private List<OfferProcessingNoteDTO> notes;

  public OfferProcessingStateDTO () {

  }

  public OfferProcessingStateDTO (OfferProcessingStatusType status, List<OfferProcessingNoteDTO> notes) {
    this.status = status;
    this.notes = notes;
  }

    
  @JsonProperty("status")
  public OfferProcessingStatusType getStatus() {
    return status;
  }
  public void setStatus(OfferProcessingStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("notes")
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
    return Objects.equals(status, offerProcessingStateDTO.status) &&
        Objects.equals(notes, offerProcessingStateDTO.notes);
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
