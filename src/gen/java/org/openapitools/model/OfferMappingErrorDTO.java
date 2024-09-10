package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.OfferMappingErrorType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Текст ошибки.
 **/
@ApiModel(description="Текст ошибки.")

public class OfferMappingErrorDTO  {
  
  @ApiModelProperty(required = true, value = "")
  private OfferMappingErrorType type;

  @ApiModelProperty(value = "Идентификатор характеристики, с которой связана ошибка.")
 /**
   * Идентификатор характеристики, с которой связана ошибка.
  **/
  private Long parameterId;

  @ApiModelProperty(required = true, value = "Текст ошибки.")
 /**
   * Текст ошибки.
  **/
  private String message;
 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public OfferMappingErrorType getType() {
    return type;
  }

  public void setType(OfferMappingErrorType type) {
    this.type = type;
  }

  public OfferMappingErrorDTO type(OfferMappingErrorType type) {
    this.type = type;
    return this;
  }

 /**
   * Идентификатор характеристики, с которой связана ошибка.
   * @return parameterId
  **/
  @JsonProperty("parameterId")
  public Long getParameterId() {
    return parameterId;
  }

  public void setParameterId(Long parameterId) {
    this.parameterId = parameterId;
  }

  public OfferMappingErrorDTO parameterId(Long parameterId) {
    this.parameterId = parameterId;
    return this;
  }

 /**
   * Текст ошибки.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public OfferMappingErrorDTO message(String message) {
    this.message = message;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

