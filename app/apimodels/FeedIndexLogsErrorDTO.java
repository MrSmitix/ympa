package apimodels;

import apimodels.FeedIndexLogsErrorType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (&#x60;index-log-record status&#x3D;ERROR&#x60;). 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FeedIndexLogsErrorDTO   {
  @JsonProperty("httpStatusCode")
  
  private Integer httpStatusCode;

  @JsonProperty("type")
  @Valid

  private FeedIndexLogsErrorType type;

  @JsonProperty("description")
  
  private String description;

  public FeedIndexLogsErrorDTO httpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
    return this;
  }

   /**
   * HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
   * @return httpStatusCode
  **/
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  public FeedIndexLogsErrorDTO type(FeedIndexLogsErrorType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public FeedIndexLogsErrorType getType() {
    return type;
  }

  public void setType(FeedIndexLogsErrorType type) {
    this.type = type;
  }

  public FeedIndexLogsErrorDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`. 
   * @return description
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

