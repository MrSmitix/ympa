package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.FeedIndexLogsErrorDTO;
import org.openapitools.vertxweb.server.model.FeedIndexLogsIndexType;
import org.openapitools.vertxweb.server.model.FeedIndexLogsOffersDTO;
import org.openapitools.vertxweb.server.model.FeedIndexLogsStatusType;

/**
 * Список отчетов по индексации прайс-листа.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedIndexLogsRecordDTO   {
  
  private OffsetDateTime downloadTime;
  private OffsetDateTime fileTime;
  private Long generationId;
  private FeedIndexLogsIndexType indexType;
  private OffsetDateTime publishedTime;
  private FeedIndexLogsStatusType status;
  private FeedIndexLogsErrorDTO error;
  private FeedIndexLogsOffersDTO offers;

  public FeedIndexLogsRecordDTO () {

  }

  public FeedIndexLogsRecordDTO (OffsetDateTime downloadTime, OffsetDateTime fileTime, Long generationId, FeedIndexLogsIndexType indexType, OffsetDateTime publishedTime, FeedIndexLogsStatusType status, FeedIndexLogsErrorDTO error, FeedIndexLogsOffersDTO offers) {
    this.downloadTime = downloadTime;
    this.fileTime = fileTime;
    this.generationId = generationId;
    this.indexType = indexType;
    this.publishedTime = publishedTime;
    this.status = status;
    this.error = error;
    this.offers = offers;
  }

    
  @JsonProperty("downloadTime")
  public OffsetDateTime getDownloadTime() {
    return downloadTime;
  }
  public void setDownloadTime(OffsetDateTime downloadTime) {
    this.downloadTime = downloadTime;
  }

    
  @JsonProperty("fileTime")
  public OffsetDateTime getFileTime() {
    return fileTime;
  }
  public void setFileTime(OffsetDateTime fileTime) {
    this.fileTime = fileTime;
  }

    
  @JsonProperty("generationId")
  public Long getGenerationId() {
    return generationId;
  }
  public void setGenerationId(Long generationId) {
    this.generationId = generationId;
  }

    
  @JsonProperty("indexType")
  public FeedIndexLogsIndexType getIndexType() {
    return indexType;
  }
  public void setIndexType(FeedIndexLogsIndexType indexType) {
    this.indexType = indexType;
  }

    
  @JsonProperty("publishedTime")
  public OffsetDateTime getPublishedTime() {
    return publishedTime;
  }
  public void setPublishedTime(OffsetDateTime publishedTime) {
    this.publishedTime = publishedTime;
  }

    
  @JsonProperty("status")
  public FeedIndexLogsStatusType getStatus() {
    return status;
  }
  public void setStatus(FeedIndexLogsStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("error")
  public FeedIndexLogsErrorDTO getError() {
    return error;
  }
  public void setError(FeedIndexLogsErrorDTO error) {
    this.error = error;
  }

    
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
