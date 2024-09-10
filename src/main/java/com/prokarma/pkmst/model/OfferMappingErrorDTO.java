package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OfferMappingErrorType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Текст ошибки.
 */
@ApiModel(description = "Текст ошибки.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferMappingErrorDTO   {
  @JsonProperty("type")
  private OfferMappingErrorType type;

  @JsonProperty("parameterId")
  private Long parameterId;

  @JsonProperty("message")
  private String message;

  public OfferMappingErrorDTO type(OfferMappingErrorType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(value = "Идентификатор характеристики, с которой связана ошибка.")
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
  @ApiModelProperty(required = true, value = "Текст ошибки.")
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

