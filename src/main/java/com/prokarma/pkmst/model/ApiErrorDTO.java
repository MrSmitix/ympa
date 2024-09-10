package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Общий формат ошибки.
 */
@ApiModel(description = "Общий формат ошибки.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ApiErrorDTO   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("message")
  private String message;

  public ApiErrorDTO code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Код ошибки.
   * @return code
   */
  @ApiModelProperty(required = true, value = "Код ошибки.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ApiErrorDTO message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Описание ошибки.
   * @return message
   */
  @ApiModelProperty(value = "Описание ошибки.")
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
    ApiErrorDTO apiErrorDTO = (ApiErrorDTO) o;
    return Objects.equals(this.code, apiErrorDTO.code) &&
        Objects.equals(this.message, apiErrorDTO.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiErrorDTO {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

