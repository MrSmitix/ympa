package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.OfferContentErrorType;

/**
 * Текст ошибки.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferContentErrorDTO   {
  
  private OfferContentErrorType type;
  private Long parameterId;
  private String message;

  public OfferContentErrorDTO () {

  }

  public OfferContentErrorDTO (OfferContentErrorType type, Long parameterId, String message) {
    this.type = type;
    this.parameterId = parameterId;
    this.message = message;
  }

    
  @JsonProperty("type")
  public OfferContentErrorType getType() {
    return type;
  }
  public void setType(OfferContentErrorType type) {
    this.type = type;
  }

    
  @JsonProperty("parameterId")
  public Long getParameterId() {
    return parameterId;
  }
  public void setParameterId(Long parameterId) {
    this.parameterId = parameterId;
  }

    
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferContentErrorDTO offerContentErrorDTO = (OfferContentErrorDTO) o;
    return Objects.equals(type, offerContentErrorDTO.type) &&
        Objects.equals(parameterId, offerContentErrorDTO.parameterId) &&
        Objects.equals(message, offerContentErrorDTO.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, parameterId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferContentErrorDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parameterId: ").append(toIndentedString(parameterId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
