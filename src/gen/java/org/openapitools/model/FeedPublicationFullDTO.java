package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о последней публикации предложений из прайс-листа на Маркете. 
 */
@ApiModel(description="Информация о последней публикации предложений из прайс-листа на Маркете. ")

public class FeedPublicationFullDTO  {
  
 /**
  * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  */
  @ApiModelProperty(value = "Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date fileTime;

 /**
  * Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  */
  @ApiModelProperty(value = "Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date publishedTime;
 /**
  * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
  * @return fileTime
  */
  @JsonProperty("fileTime")
  public Date getFileTime() {
    return fileTime;
  }

  /**
   * Sets the <code>fileTime</code> property.
   */
 public void setFileTime(Date fileTime) {
    this.fileTime = fileTime;
  }

  /**
   * Sets the <code>fileTime</code> property.
   */
  public FeedPublicationFullDTO fileTime(Date fileTime) {
    this.fileTime = fileTime;
    return this;
  }

 /**
  * Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
  * @return publishedTime
  */
  @JsonProperty("publishedTime")
  public Date getPublishedTime() {
    return publishedTime;
  }

  /**
   * Sets the <code>publishedTime</code> property.
   */
 public void setPublishedTime(Date publishedTime) {
    this.publishedTime = publishedTime;
  }

  /**
   * Sets the <code>publishedTime</code> property.
   */
  public FeedPublicationFullDTO publishedTime(Date publishedTime) {
    this.publishedTime = publishedTime;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

