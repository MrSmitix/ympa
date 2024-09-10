package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о последней публикации предложений из прайс-листа на Маркете. 
 */

@Schema(name = "FeedPublicationFullDTO", description = "Информация о последней публикации предложений из прайс-листа на Маркете. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedPublicationFullDTO {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date fileTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date publishedTime;

  public FeedPublicationFullDTO fileTime(Date fileTime) {
    this.fileTime = fileTime;
    return this;
  }

  /**
   * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
   * @return fileTime
   */
  @Valid 
  @Schema(name = "fileTime", description = "Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileTime")
  public Date getFileTime() {
    return fileTime;
  }

  public void setFileTime(Date fileTime) {
    this.fileTime = fileTime;
  }

  public FeedPublicationFullDTO publishedTime(Date publishedTime) {
    this.publishedTime = publishedTime;
    return this;
  }

  /**
   * Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
   * @return publishedTime
   */
  @Valid 
  @Schema(name = "publishedTime", description = "Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publishedTime")
  public Date getPublishedTime() {
    return publishedTime;
  }

  public void setPublishedTime(Date publishedTime) {
    this.publishedTime = publishedTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedPublicationFullDTO feedPublicationFullDTO = (FeedPublicationFullDTO) o;
    return Objects.equals(this.fileTime, feedPublicationFullDTO.fileTime) &&
        Objects.equals(this.publishedTime, feedPublicationFullDTO.publishedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileTime, publishedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedPublicationFullDTO {\n");
    sb.append("    fileTime: ").append(toIndentedString(fileTime)).append("\n");
    sb.append("    publishedTime: ").append(toIndentedString(publishedTime)).append("\n");
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

