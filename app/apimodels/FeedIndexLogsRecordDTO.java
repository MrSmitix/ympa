package apimodels;

import apimodels.FeedIndexLogsErrorDTO;
import apimodels.FeedIndexLogsIndexType;
import apimodels.FeedIndexLogsOffersDTO;
import apimodels.FeedIndexLogsStatusType;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Список отчетов по индексации прайс-листа.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FeedIndexLogsRecordDTO   {
  @JsonProperty("downloadTime")
  @Valid

  private OffsetDateTime downloadTime;

  @JsonProperty("fileTime")
  @Valid

  private OffsetDateTime fileTime;

  @JsonProperty("generationId")
  
  private Long generationId;

  @JsonProperty("indexType")
  @Valid

  private FeedIndexLogsIndexType indexType;

  @JsonProperty("publishedTime")
  @Valid

  private OffsetDateTime publishedTime;

  @JsonProperty("status")
  @Valid

  private FeedIndexLogsStatusType status;

  @JsonProperty("error")
  @Valid

  private FeedIndexLogsErrorDTO error;

  @JsonProperty("offers")
  @Valid

  private FeedIndexLogsOffersDTO offers;

  public FeedIndexLogsRecordDTO downloadTime(OffsetDateTime downloadTime) {
    this.downloadTime = downloadTime;
    return this;
  }

   /**
   * Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
   * @return downloadTime
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

