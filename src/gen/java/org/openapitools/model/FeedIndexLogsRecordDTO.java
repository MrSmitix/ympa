package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedIndexLogsErrorDTO;
import org.openapitools.model.FeedIndexLogsIndexType;
import org.openapitools.model.FeedIndexLogsOffersDTO;
import org.openapitools.model.FeedIndexLogsStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Список отчетов по индексации прайс-листа.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Список отчетов по индексации прайс-листа.")
public class FeedIndexLogsRecordDTO   {
  
  private java.util.Date downloadTime;

  private java.util.Date fileTime;

  private Long generationId;

  private FeedIndexLogsIndexType indexType;

  private java.util.Date publishedTime;

  private FeedIndexLogsStatusType status;

  private FeedIndexLogsErrorDTO error;

  private FeedIndexLogsOffersDTO offers;

  /**
   * Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
   **/
  public FeedIndexLogsRecordDTO downloadTime(java.util.Date downloadTime) {
    this.downloadTime = downloadTime;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  @JsonProperty("downloadTime")
  public java.util.Date getDownloadTime() {
    return downloadTime;
  }
  public void setDownloadTime(java.util.Date downloadTime) {
    this.downloadTime = downloadTime;
  }


  /**
   * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
   **/
  public FeedIndexLogsRecordDTO fileTime(java.util.Date fileTime) {
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
   * Идентификатор индексации.
   **/
  public FeedIndexLogsRecordDTO generationId(Long generationId) {
    this.generationId = generationId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор индексации.")
  @JsonProperty("generationId")
  public Long getGenerationId() {
    return generationId;
  }
  public void setGenerationId(Long generationId) {
    this.generationId = generationId;
  }


  /**
   **/
  public FeedIndexLogsRecordDTO indexType(FeedIndexLogsIndexType indexType) {
    this.indexType = indexType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("indexType")
  public FeedIndexLogsIndexType getIndexType() {
    return indexType;
  }
  public void setIndexType(FeedIndexLogsIndexType indexType) {
    this.indexType = indexType;
  }


  /**
   * Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
   **/
  public FeedIndexLogsRecordDTO publishedTime(java.util.Date publishedTime) {
    this.publishedTime = publishedTime;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  @JsonProperty("publishedTime")
  public java.util.Date getPublishedTime() {
    return publishedTime;
  }
  public void setPublishedTime(java.util.Date publishedTime) {
    this.publishedTime = publishedTime;
  }


  /**
   **/
  public FeedIndexLogsRecordDTO status(FeedIndexLogsStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public FeedIndexLogsStatusType getStatus() {
    return status;
  }
  public void setStatus(FeedIndexLogsStatusType status) {
    this.status = status;
  }


  /**
   **/
  public FeedIndexLogsRecordDTO error(FeedIndexLogsErrorDTO error) {
    this.error = error;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("error")
  public FeedIndexLogsErrorDTO getError() {
    return error;
  }
  public void setError(FeedIndexLogsErrorDTO error) {
    this.error = error;
  }


  /**
   **/
  public FeedIndexLogsRecordDTO offers(FeedIndexLogsOffersDTO offers) {
    this.offers = offers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("offers")
  public FeedIndexLogsOffersDTO getOffers() {
    return offers;
  }
  public void setOffers(FeedIndexLogsOffersDTO offers) {
    this.offers = offers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedIndexLogsRecordDTO feedIndexLogsRecordDTO = (FeedIndexLogsRecordDTO) o;
    return Objects.equals(this.downloadTime, feedIndexLogsRecordDTO.downloadTime) &&
        Objects.equals(this.fileTime, feedIndexLogsRecordDTO.fileTime) &&
        Objects.equals(this.generationId, feedIndexLogsRecordDTO.generationId) &&
        Objects.equals(this.indexType, feedIndexLogsRecordDTO.indexType) &&
        Objects.equals(this.publishedTime, feedIndexLogsRecordDTO.publishedTime) &&
        Objects.equals(this.status, feedIndexLogsRecordDTO.status) &&
        Objects.equals(this.error, feedIndexLogsRecordDTO.error) &&
        Objects.equals(this.offers, feedIndexLogsRecordDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadTime, fileTime, generationId, indexType, publishedTime, status, error, offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedIndexLogsRecordDTO {\n");
    
    sb.append("    downloadTime: ").append(toIndentedString(downloadTime)).append("\n");
    sb.append("    fileTime: ").append(toIndentedString(fileTime)).append("\n");
    sb.append("    generationId: ").append(toIndentedString(generationId)).append("\n");
    sb.append("    indexType: ").append(toIndentedString(indexType)).append("\n");
    sb.append("    publishedTime: ").append(toIndentedString(publishedTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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

