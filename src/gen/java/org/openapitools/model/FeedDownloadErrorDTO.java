package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.FeedDownloadErrorType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 
 **/
@ApiModel(description="Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. ")

public class FeedDownloadErrorDTO  {
  
  @ApiModelProperty(value = "HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. ")
 /**
   * HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
  **/
  private Integer httpStatusCode;

  @ApiModelProperty(value = "")
  private FeedDownloadErrorType type;

  @ApiModelProperty(value = "Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. ")
 /**
   * Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. 
  **/
  private String description;
 /**
   * HTTP-код ошибки индексации прайс-листа. Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;. 
   * @return httpStatusCode
  **/
  @JsonProperty("httpStatusCode")
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  public FeedDownloadErrorDTO httpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public FeedDownloadErrorType getType() {
    return type;
  }

  public void setType(FeedDownloadErrorType type) {
    this.type = type;
  }

  public FeedDownloadErrorDTO type(FeedDownloadErrorType type) {
    this.type = type;
    return this;
  }

 /**
   * Описание ошибки. Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;. 
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FeedDownloadErrorDTO description(String description) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

