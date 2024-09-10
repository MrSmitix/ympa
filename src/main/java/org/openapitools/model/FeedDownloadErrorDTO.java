package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.FeedDownloadErrorType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр &#x60;download status&#x3D;ERROR&#x60;. 
 */

@Schema(name = "FeedDownloadErrorDTO", description = "Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedDownloadErrorDTO {

  private Integer httpStatusCode;

  private FeedDownloadErrorType type;

  private String description;

  public FeedDownloadErrorDTO httpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
    return this;
  }

  /**
   * HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
   * @return httpStatusCode
   */
  
  @Schema(name = "httpStatusCode", description = "HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("httpStatusCode")
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  public FeedDownloadErrorDTO type(FeedDownloadErrorType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public FeedDownloadErrorType getType() {
    return type;
  }

  public void setType(FeedDownloadErrorType type) {
    this.type = type;
  }

  public FeedDownloadErrorDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. 
   * @return description
   */
  
  @Schema(name = "description", description = "Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    FeedDownloadErrorDTO feedDownloadErrorDTO = (FeedDownloadErrorDTO) o;
    return Objects.equals(this.httpStatusCode, feedDownloadErrorDTO.httpStatusCode) &&
        Objects.equals(this.type, feedDownloadErrorDTO.type) &&
        Objects.equals(this.description, feedDownloadErrorDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpStatusCode, type, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedDownloadErrorDTO {\n");
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
