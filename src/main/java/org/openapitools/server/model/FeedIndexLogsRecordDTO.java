package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.server.model.FeedIndexLogsErrorDTO;
import org.openapitools.server.model.FeedIndexLogsIndexType;
import org.openapitools.server.model.FeedIndexLogsOffersDTO;
import org.openapitools.server.model.FeedIndexLogsStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список отчетов по индексации прайс-листа.
 */
public class FeedIndexLogsRecordDTO   {

    private OffsetDateTime downloadTime;
    private OffsetDateTime fileTime;
    private Long generationId;
    private FeedIndexLogsIndexType indexType;
    private OffsetDateTime publishedTime;
    private FeedIndexLogsStatusType status;
    private FeedIndexLogsErrorDTO error;
    private FeedIndexLogsOffersDTO offers;

    /**
     * Default constructor.
     */
    public FeedIndexLogsRecordDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedIndexLogsRecordDTO.
     *
     * @param downloadTime Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
     * @param fileTime Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
     * @param generationId Идентификатор индексации.
     * @param indexType indexType
     * @param publishedTime Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
     * @param status status
     * @param error error
     * @param offers offers
     */
    public FeedIndexLogsRecordDTO(
        OffsetDateTime downloadTime, 
        OffsetDateTime fileTime, 
        Long generationId, 
        FeedIndexLogsIndexType indexType, 
        OffsetDateTime publishedTime, 
        FeedIndexLogsStatusType status, 
        FeedIndexLogsErrorDTO error, 
        FeedIndexLogsOffersDTO offers
    ) {
        this.downloadTime = downloadTime;
        this.fileTime = fileTime;
        this.generationId = generationId;
        this.indexType = indexType;
        this.publishedTime = publishedTime;
        this.status = status;
        this.error = error;
        this.offers = offers;
    }



    /**
     * Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
     * @return downloadTime
     */
    public OffsetDateTime getDownloadTime() {
        return downloadTime;
    }

    public void setDownloadTime(OffsetDateTime downloadTime) {
        this.downloadTime = downloadTime;
    }

    /**
     * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
     * @return fileTime
     */
    public OffsetDateTime getFileTime() {
        return fileTime;
    }

    public void setFileTime(OffsetDateTime fileTime) {
        this.fileTime = fileTime;
    }

    /**
     * Идентификатор индексации.
     * @return generationId
     */
    public Long getGenerationId() {
        return generationId;
    }

    public void setGenerationId(Long generationId) {
        this.generationId = generationId;
    }

    /**
     * Get indexType
     * @return indexType
     */
    public FeedIndexLogsIndexType getIndexType() {
        return indexType;
    }

    public void setIndexType(FeedIndexLogsIndexType indexType) {
        this.indexType = indexType;
    }

    /**
     * Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
     * @return publishedTime
     */
    public OffsetDateTime getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(OffsetDateTime publishedTime) {
        this.publishedTime = publishedTime;
    }

    /**
     * Get status
     * @return status
     */
    public FeedIndexLogsStatusType getStatus() {
        return status;
    }

    public void setStatus(FeedIndexLogsStatusType status) {
        this.status = status;
    }

    /**
     * Get error
     * @return error
     */
    public FeedIndexLogsErrorDTO getError() {
        return error;
    }

    public void setError(FeedIndexLogsErrorDTO error) {
        this.error = error;
    }

    /**
     * Get offers
     * @return offers
     */
    public FeedIndexLogsOffersDTO getOffers() {
        return offers;
    }

    public void setOffers(FeedIndexLogsOffersDTO offers) {
        this.offers = offers;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

