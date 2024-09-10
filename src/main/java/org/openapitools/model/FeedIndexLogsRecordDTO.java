/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.FeedIndexLogsErrorDTO;
import org.openapitools.model.FeedIndexLogsIndexType;
import org.openapitools.model.FeedIndexLogsOffersDTO;
import org.openapitools.model.FeedIndexLogsStatusType;



/**
 * Список отчетов по индексации прайс-листа.
 */

@ApiModel(description = "Список отчетов по индексации прайс-листа.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedIndexLogsRecordDTO   {
  
  private Date downloadTime;
  private Date fileTime;
  private Long generationId;
  private FeedIndexLogsIndexType indexType;
  private Date publishedTime;
  private FeedIndexLogsStatusType status;
  private FeedIndexLogsErrorDTO error;
  private FeedIndexLogsOffersDTO offers;

  /**
   * Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
   */
  public FeedIndexLogsRecordDTO downloadTime(Date downloadTime) {
    this.downloadTime = downloadTime;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  @JsonProperty("downloadTime")
  public Date getDownloadTime() {
    return downloadTime;
  }
  public void setDownloadTime(Date downloadTime) {
    this.downloadTime = downloadTime;
  }

  /**
   * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
   */
  public FeedIndexLogsRecordDTO fileTime(Date fileTime) {
    this.fileTime = fileTime;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  @JsonProperty("fileTime")
  public Date getFileTime() {
    return fileTime;
  }
  public void setFileTime(Date fileTime) {
    this.fileTime = fileTime;
  }

  /**
   * Идентификатор индексации.
   */
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
   */
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
   * Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
   */
  public FeedIndexLogsRecordDTO publishedTime(Date publishedTime) {
    this.publishedTime = publishedTime;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  @JsonProperty("publishedTime")
  public Date getPublishedTime() {
    return publishedTime;
  }
  public void setPublishedTime(Date publishedTime) {
    this.publishedTime = publishedTime;
  }

  /**
   */
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
   */
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
   */
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
    return Objects.equals(downloadTime, feedIndexLogsRecordDTO.downloadTime) &&
        Objects.equals(fileTime, feedIndexLogsRecordDTO.fileTime) &&
        Objects.equals(generationId, feedIndexLogsRecordDTO.generationId) &&
        Objects.equals(indexType, feedIndexLogsRecordDTO.indexType) &&
        Objects.equals(publishedTime, feedIndexLogsRecordDTO.publishedTime) &&
        Objects.equals(status, feedIndexLogsRecordDTO.status) &&
        Objects.equals(error, feedIndexLogsRecordDTO.error) &&
        Objects.equals(offers, feedIndexLogsRecordDTO.offers);
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

