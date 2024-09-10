package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedIndexLogsErrorType;



/**
 * Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (&#x60;index-log-record status&#x3D;ERROR&#x60;). 
 **/

@ApiModel(description = "Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`). ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedIndexLogsErrorDTO   {
  @JsonProperty("httpStatusCode")
  private Integer httpStatusCode;

  @JsonProperty("type")
  private FeedIndexLogsErrorType type;

  @JsonProperty("description")
  private String description;

  /**
   * HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
   **/
  public FeedIndexLogsErrorDTO httpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
    return this;
  }

  
  @ApiModelProperty(value = "HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`. ")
  @JsonProperty("httpStatusCode")
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }
  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  /**
   **/
  public FeedIndexLogsErrorDTO type(FeedIndexLogsErrorType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public FeedIndexLogsErrorType getType() {
    return type;
  }
  public void setType(FeedIndexLogsErrorType type) {
    this.type = type;
  }

  /**
   * Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`. 
   **/
  public FeedIndexLogsErrorDTO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`. ")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
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
    return Objects.equals(httpStatusCode, feedIndexLogsErrorDTO.httpStatusCode) &&
        Objects.equals(type, feedIndexLogsErrorDTO.type) &&
        Objects.equals(description, feedIndexLogsErrorDTO.description);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

