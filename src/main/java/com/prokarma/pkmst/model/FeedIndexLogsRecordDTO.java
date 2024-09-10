package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.FeedIndexLogsErrorDTO;
import com.prokarma.pkmst.model.FeedIndexLogsIndexType;
import com.prokarma.pkmst.model.FeedIndexLogsOffersDTO;
import com.prokarma.pkmst.model.FeedIndexLogsStatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Список отчетов по индексации прайс-листа.
 */
@ApiModel(description = "Список отчетов по индексации прайс-листа.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedIndexLogsRecordDTO   {
  @JsonProperty("downloadTime")
  private OffsetDateTime downloadTime;

  @JsonProperty("fileTime")
  private OffsetDateTime fileTime;

  @JsonProperty("generationId")
  private Long generationId;

  @JsonProperty("indexType")
  private FeedIndexLogsIndexType indexType;

  @JsonProperty("publishedTime")
  private OffsetDateTime publishedTime;

  @JsonProperty("status")
  private FeedIndexLogsStatusType status;

  @JsonProperty("error")
  private FeedIndexLogsErrorDTO error;

  @JsonProperty("offers")
  private FeedIndexLogsOffersDTO offers;

  public FeedIndexLogsRecordDTO downloadTime(OffsetDateTime downloadTime) {
    this.downloadTime = downloadTime;
    return this;
  }

  /**
   * Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
   * @return downloadTime
   */
  @ApiModelProperty(value = "Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  public OffsetDateTime getDownloadTime() {
    return downloadTime;
  }

  public void setDownloadTime(OffsetDateTime downloadTime) {
    this.downloadTime = downloadTime;
  }

  public FeedIndexLogsRecordDTO fileTime(OffsetDateTime fileTime) {
    this.fileTime = fileTime;
    return this;
  }

  /**
   * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
   * @return fileTime
   */
  @ApiModelProperty(value = "Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  public OffsetDateTime getFileTime() {
    return fileTime;
  }

  public void setFileTime(OffsetDateTime fileTime) {
    this.fileTime = fileTime;
  }

  public FeedIndexLogsRecordDTO generationId(Long generationId) {
    this.generationId = generationId;
    return this;
  }

  /**
   * Идентификатор индексации.
   * @return generationId
   */
  @ApiModelProperty(value = "Идентификатор индексации.")
  public Long getGenerationId() {
    return generationId;
  }

  public void setGenerationId(Long generationId) {
    this.generationId = generationId;
  }

  public FeedIndexLogsRecordDTO indexType(FeedIndexLogsIndexType indexType) {
    this.indexType = indexType;
    return this;
  }

  /**
   * Get indexType
   * @return indexType
   */
  @ApiModelProperty(value = "")
  public FeedIndexLogsIndexType getIndexType() {
    return indexType;
  }

  public void setIndexType(FeedIndexLogsIndexType indexType) {
    this.indexType = indexType;
  }

  public FeedIndexLogsRecordDTO publishedTime(OffsetDateTime publishedTime) {
    this.publishedTime = publishedTime;
    return this;
  }

  /**
   * Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
   * @return publishedTime
   */
  @ApiModelProperty(value = "Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ")
  public OffsetDateTime getPublishedTime() {
    return publishedTime;
  }

  public void setPublishedTime(OffsetDateTime publishedTime) {
    this.publishedTime = publishedTime;
  }

  public FeedIndexLogsRecordDTO status(FeedIndexLogsStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @ApiModelProperty(value = "")
  public FeedIndexLogsStatusType getStatus() {
    return status;
  }

  public void setStatus(FeedIndexLogsStatusType status) {
    this.status = status;
  }

  public FeedIndexLogsRecordDTO error(FeedIndexLogsErrorDTO error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @ApiModelProperty(value = "")
  public FeedIndexLogsErrorDTO getError() {
    return error;
  }

  public void setError(FeedIndexLogsErrorDTO error) {
    this.error = error;
  }

  public FeedIndexLogsRecordDTO offers(FeedIndexLogsOffersDTO offers) {
    this.offers = offers;
    return this;
  }

  /**
   * Get offers
   * @return offers
   */
  @ApiModelProperty(value = "")
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

