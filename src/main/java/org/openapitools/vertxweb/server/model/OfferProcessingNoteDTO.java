package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.OfferProcessingNoteType;

/**
 * Причины, по которым товар не прошел модерацию.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferProcessingNoteDTO   {
  
  private OfferProcessingNoteType type;
  private String payload;

  public OfferProcessingNoteDTO () {

  }

  public OfferProcessingNoteDTO (OfferProcessingNoteType type, String payload) {
    this.type = type;
    this.payload = payload;
  }

    
  @JsonProperty("type")
  public OfferProcessingNoteType getType() {
    return type;
  }
  public void setType(OfferProcessingNoteType type) {
    this.type = type;
  }

    
  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }
  public void setPayload(String payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferProcessingNoteDTO offerProcessingNoteDTO = (OfferProcessingNoteDTO) o;
    return Objects.equals(type, offerProcessingNoteDTO.type) &&
        Objects.equals(payload, offerProcessingNoteDTO.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferProcessingNoteDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
