package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferMappingErrorType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Текст ошибки.
 **/
@ApiModel(description = "Текст ошибки.")
@JsonTypeName("OfferMappingErrorDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferMappingErrorDTO   {
  private OfferMappingErrorType type;
  private Long parameterId;
  private String message;

  /**
   **/
  public OfferMappingErrorDTO type(OfferMappingErrorType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull public OfferMappingErrorType getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(OfferMappingErrorType type) {
    this.type = type;
  }

  /**
   * Идентификатор характеристики, с которой связана ошибка.
   **/
  public OfferMappingErrorDTO parameterId(Long parameterId) {
    this.parameterId = parameterId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор характеристики, с которой связана ошибка.")
  @JsonProperty("parameterId")
  public Long getParameterId() {
    return parameterId;
  }

  @JsonProperty("parameterId")
  public void setParameterId(Long parameterId) {
    this.parameterId = parameterId;
  }

  /**
   * Текст ошибки.
   **/
  public OfferMappingErrorDTO message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Текст ошибки.")
  @JsonProperty("message")
  @NotNull public String getMessage() {
    return message;
  }

  @JsonProperty("message")
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

