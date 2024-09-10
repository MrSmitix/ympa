package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре &#x60;full&#x60;. Выводится, если параметр &#x60;publication status&#x3D;OK&#x60;. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре `full`. Выводится, если параметр `publication status=OK`. ")
public class FeedPublicationPriceAndStockUpdateDTO   {
  
  private java.util.Date fileTime;

  private java.util.Date publishedTime;

  /**
   * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
   **/
  public FeedPublicationPriceAndStockUpdateDTO fileTime(java.util.Date fileTime) {
    this.fileTime = fileTime;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  @JsonProperty("fileTime")
  public java.util.Date getFileTime() {
    return fileTime;
  }
  public void setFileTime(java.util.Date fileTime) {
    this.fileTime = fileTime;
  }


  /**
   * Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
   **/
  public FeedPublicationPriceAndStockUpdateDTO publishedTime(java.util.Date publishedTime) {
    this.publishedTime = publishedTime;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  @JsonProperty("publishedTime")
  public java.util.Date getPublishedTime() {
    return publishedTime;
  }
  public void setPublishedTime(java.util.Date publishedTime) {
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

