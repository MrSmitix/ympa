package apimodels;

import apimodels.OfferProcessingNoteType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Причины, по которым товар не прошел модерацию.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferProcessingNoteDTO   {
  @JsonProperty("type")
  @Valid

  private OfferProcessingNoteType type;

  @JsonProperty("payload")
  
  private String payload;

  public OfferProcessingNoteDTO type(OfferProcessingNoteType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

