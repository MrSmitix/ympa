package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.FeedIndexLogsErrorType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`). 
 */
@ApiModel(description="Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`). ")

public class FeedIndexLogsErrorDTO  {
  
 /**
  * HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
  */
  @ApiModelProperty(value = "HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`. ")
  private Integer httpStatusCode;

  @ApiModelProperty(value = "")
  @Valid
  private FeedIndexLogsErrorType type;

 /**
  * Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`. 
  */
  @ApiModelProperty(value = "Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`. ")
  private String description;
 /**
  * HTTP-код ошибки индексации прайс-листа.  Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;. 
  * @return httpStatusCode
  */
  @JsonProperty("httpStatusCode")
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  /**
   * Sets the <code>httpStatusCode</code> property.
   */
 public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  /**
   * Sets the <code>httpStatusCode</code> property.
   */
  public FeedIndexLogsErrorDTO httpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public FeedIndexLogsErrorType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(FeedIndexLogsErrorType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public FeedIndexLogsErrorDTO type(FeedIndexLogsErrorType type) {
    this.type = type;
    return this;
  }

 /**
  * Описание ошибки.  Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;. 
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public FeedIndexLogsErrorDTO description(String description) {
    this.description = description;
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
    FeedIndexLogsErrorDTO feedIndexLogsErrorDTO = (FeedIndexLogsErrorDTO) o;
    return Objects.equals(this.httpStatusCode, feedIndexLogsErrorDTO.httpStatusCode) &&
        Objects.equals(this.type, feedIndexLogsErrorDTO.type) &&
        Objects.equals(this.description, feedIndexLogsErrorDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpStatusCode, type, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedIndexLogsErrorDTO {\n");
    
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

