package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре &#x60;full&#x60;. Выводится, если параметр &#x60;publication status&#x3D;OK&#x60;. 
 */

@Schema(name = "FeedPublicationPriceAndStockUpdateDTO", description = "Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре `full`. Выводится, если параметр `publication status=OK`. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedPublicationPriceAndStockUpdateDTO {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime fileTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime publishedTime;

  public FeedPublicationPriceAndStockUpdateDTO fileTime(OffsetDateTime fileTime) {
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
  public OffsetDateTime getFileTime() {
    return fileTime;
  }

  public void setFileTime(OffsetDateTime fileTime) {
    this.fileTime = fileTime;
  }

  public FeedPublicationPriceAndStockUpdateDTO publishedTime(OffsetDateTime publishedTime) {
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
  public OffsetDateTime getPublishedTime() {
    return publishedTime;
  }

  public void setPublishedTime(OffsetDateTime publishedTime) {
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
    FeedPublicationPriceAndStockUpdateDTO feedPublicationPriceAndStockUpdateDTO = (FeedPublicationPriceAndStockUpdateDTO) o;
    return Objects.equals(this.fileTime, feedPublicationPriceAndStockUpdateDTO.fileTime) &&
        Objects.equals(this.publishedTime, feedPublicationPriceAndStockUpdateDTO.publishedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileTime, publishedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedPublicationPriceAndStockUpdateDTO {\n");
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
