package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре &#x60;full&#x60;. Выводится, если параметр &#x60;publication status&#x3D;OK&#x60;. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedPublicationPriceAndStockUpdateDTO   {
  
  private OffsetDateTime fileTime;
  private OffsetDateTime publishedTime;

  public FeedPublicationPriceAndStockUpdateDTO () {

  }

  public FeedPublicationPriceAndStockUpdateDTO (OffsetDateTime fileTime, OffsetDateTime publishedTime) {
    this.fileTime = fileTime;
    this.publishedTime = publishedTime;
  }

    
  @JsonProperty("fileTime")
  public OffsetDateTime getFileTime() {
    return fileTime;
  }
  public void setFileTime(OffsetDateTime fileTime) {
    this.fileTime = fileTime;
  }

    
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
    return Objects.equals(fileTime, feedPublicationPriceAndStockUpdateDTO.fileTime) &&
        Objects.equals(publishedTime, feedPublicationPriceAndStockUpdateDTO.publishedTime);
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
