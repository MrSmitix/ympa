package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OfferProcessingNoteType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Причины, по которым товар не прошел модерацию.
 */

@Schema(name = "OfferProcessingNoteDTO", description = "Причины, по которым товар не прошел модерацию.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferProcessingNoteDTO {

  private OfferProcessingNoteType type;

  private String payload;

  public OfferProcessingNoteDTO type(OfferProcessingNoteType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public OfferProcessingNoteType getType() {
    return type;
  }

  public void setType(OfferProcessingNoteType type) {
    this.type = type;
  }

  public OfferProcessingNoteDTO payload(String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Дополнительная информация о причине отклонения товара. 
   * @return payload
   */
  
  @Schema(name = "payload", description = "Дополнительная информация о причине отклонения товара. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.type, offerProcessingNoteDTO.type) &&
        Objects.equals(this.payload, offerProcessingNoteDTO.payload);
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

