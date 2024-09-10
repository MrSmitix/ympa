package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OfferMappingErrorType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Текст ошибки.
 */

@Schema(name = "OfferMappingErrorDTO", description = "Текст ошибки.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferMappingErrorDTO {

  private OfferMappingErrorType type;

  private Long parameterId;

  private String message;

  public OfferMappingErrorDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OfferMappingErrorDTO(OfferMappingErrorType type, String message) {
    this.type = type;
    this.message = message;
  }

  public OfferMappingErrorDTO type(OfferMappingErrorType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public OfferMappingErrorType getType() {
    return type;
  }

  public void setType(OfferMappingErrorType type) {
    this.type = type;
  }

  public OfferMappingErrorDTO parameterId(Long parameterId) {
    this.parameterId = parameterId;
    return this;
  }

  /**
   * Идентификатор характеристики, с которой связана ошибка.
   * @return parameterId
   */
  
  @Schema(name = "parameterId", description = "Идентификатор характеристики, с которой связана ошибка.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameterId")
  public Long getParameterId() {
    return parameterId;
  }

  public void setParameterId(Long parameterId) {
    this.parameterId = parameterId;
  }

  public OfferMappingErrorDTO message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Текст ошибки.
   * @return message
   */
  @NotNull 
  @Schema(name = "message", description = "Текст ошибки.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    OfferMappingErrorDTO offerMappingErrorDTO = (OfferMappingErrorDTO) o;
    return Objects.equals(this.type, offerMappingErrorDTO.type) &&
        Objects.equals(this.parameterId, offerMappingErrorDTO.parameterId) &&
        Objects.equals(this.message, offerMappingErrorDTO.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, parameterId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferMappingErrorDTO {\n");
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

