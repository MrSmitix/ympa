package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import org.openapitools.model.FeedIndexLogsErrorDTO;
import org.openapitools.model.FeedIndexLogsIndexType;
import org.openapitools.model.FeedIndexLogsOffersDTO;
import org.openapitools.model.FeedIndexLogsStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список отчетов по индексации прайс-листа.
 */
@ApiModel(description="Список отчетов по индексации прайс-листа.")

public class FeedIndexLogsRecordDTO  {
  
 /**
  * Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  */
  @ApiModelProperty(value = "Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date downloadTime;

 /**
  * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  */
  @ApiModelProperty(value = "Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date fileTime;

 /**
  * Идентификатор индексации.
  */
  @ApiModelProperty(value = "Идентификатор индексации.")
  private Long generationId;

  @ApiModelProperty(value = "")
  @Valid
  private FeedIndexLogsIndexType indexType;

 /**
  * Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  */
  @ApiModelProperty(value = "Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date publishedTime;

  @ApiModelProperty(value = "")
  @Valid
  private FeedIndexLogsStatusType status;

  @ApiModelProperty(value = "")
  @Valid
  private FeedIndexLogsErrorDTO error;

  @ApiModelProperty(value = "")
  @Valid
  private FeedIndexLogsOffersDTO offers;
 /**
  * Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
  * @return downloadTime
  */
  @JsonProperty("downloadTime")
  public Date getDownloadTime() {
    return downloadTime;
  }

  /**
   * Sets the <code>downloadTime</code> property.
   */
 public void setDownloadTime(Date downloadTime) {
    this.downloadTime = downloadTime;
  }

  /**
   * Sets the <code>downloadTime</code> property.
   */
  public FeedIndexLogsRecordDTO downloadTime(Date downloadTime) {
    this.downloadTime = downloadTime;
    return this;
  }

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
  public FeedIndexLogsRecordDTO fileTime(Date fileTime) {
    this.fileTime = fileTime;
    return this;
  }

 /**
  * Идентификатор индексации.
  * @return generationId
  */
  @JsonProperty("generationId")
  public Long getGenerationId() {
    return generationId;
  }

  /**
   * Sets the <code>generationId</code> property.
   */
 public void setGenerationId(Long generationId) {
    this.generationId = generationId;
  }

  /**
   * Sets the <code>generationId</code> property.
   */
  public FeedIndexLogsRecordDTO generationId(Long generationId) {
    this.generationId = generationId;
    return this;
  }

 /**
  * Get indexType
  * @return indexType
  */
  @JsonProperty("indexType")
  public FeedIndexLogsIndexType getIndexType() {
    return indexType;
  }

  /**
   * Sets the <code>indexType</code> property.
   */
 public void setIndexType(FeedIndexLogsIndexType indexType) {
    this.indexType = indexType;
  }

  /**
   * Sets the <code>indexType</code> property.
   */
  public FeedIndexLogsRecordDTO indexType(FeedIndexLogsIndexType indexType) {
    this.indexType = indexType;
    return this;
  }

 /**
  * Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
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
  public FeedIndexLogsRecordDTO publishedTime(Date publishedTime) {
    this.publishedTime = publishedTime;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public FeedIndexLogsStatusType getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(FeedIndexLogsStatusType status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public FeedIndexLogsRecordDTO status(FeedIndexLogsStatusType status) {
    this.status = status;
    return this;
  }

 /**
  * Get error
  * @return error
  */
  @JsonProperty("error")
  public FeedIndexLogsErrorDTO getError() {
    return error;
  }

  /**
   * Sets the <code>error</code> property.
   */
 public void setError(FeedIndexLogsErrorDTO error) {
    this.error = error;
  }

  /**
   * Sets the <code>error</code> property.
   */
  public FeedIndexLogsRecordDTO error(FeedIndexLogsErrorDTO error) {
    this.error = error;
    return this;
  }

 /**
  * Get offers
  * @return offers
  */
  @JsonProperty("offers")
  public FeedIndexLogsOffersDTO getOffers() {
    return offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
 public void setOffers(FeedIndexLogsOffersDTO offers) {
    this.offers = offers;
  }

  /**
   * Sets the <code>offers</code> property.
   */
  public FeedIndexLogsRecordDTO offers(FeedIndexLogsOffersDTO offers) {
    this.offers = offers;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

