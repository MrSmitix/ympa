/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.time.OffsetDateTime;
import org.openapitools.model.FeedIndexLogsErrorDTO;
import org.openapitools.model.FeedIndexLogsIndexType;
import org.openapitools.model.FeedIndexLogsOffersDTO;
import org.openapitools.model.FeedIndexLogsStatusType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Список отчетов по индексации прайс-листа.
 */
@Schema(name = "FeedIndexLogsRecordDTO", description = "Список отчетов по индексации прайс-листа.")
@JsonPropertyOrder({
  FeedIndexLogsRecordDTO.JSON_PROPERTY_DOWNLOAD_TIME,
  FeedIndexLogsRecordDTO.JSON_PROPERTY_FILE_TIME,
  FeedIndexLogsRecordDTO.JSON_PROPERTY_GENERATION_ID,
  FeedIndexLogsRecordDTO.JSON_PROPERTY_INDEX_TYPE,
  FeedIndexLogsRecordDTO.JSON_PROPERTY_PUBLISHED_TIME,
  FeedIndexLogsRecordDTO.JSON_PROPERTY_STATUS,
  FeedIndexLogsRecordDTO.JSON_PROPERTY_ERROR,
  FeedIndexLogsRecordDTO.JSON_PROPERTY_OFFERS
})
@JsonTypeName("FeedIndexLogsRecordDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class FeedIndexLogsRecordDTO {
    public static final String JSON_PROPERTY_DOWNLOAD_TIME = "downloadTime";
    private OffsetDateTime downloadTime;

    public static final String JSON_PROPERTY_FILE_TIME = "fileTime";
    private OffsetDateTime fileTime;

    public static final String JSON_PROPERTY_GENERATION_ID = "generationId";
    private Long generationId;

    public static final String JSON_PROPERTY_INDEX_TYPE = "indexType";
    private FeedIndexLogsIndexType indexType;

    public static final String JSON_PROPERTY_PUBLISHED_TIME = "publishedTime";
    private OffsetDateTime publishedTime;

    public static final String JSON_PROPERTY_STATUS = "status";
    private FeedIndexLogsStatusType status;

    public static final String JSON_PROPERTY_ERROR = "error";
    private FeedIndexLogsErrorDTO error;

    public static final String JSON_PROPERTY_OFFERS = "offers";
    private FeedIndexLogsOffersDTO offers;

    public FeedIndexLogsRecordDTO() {
    }

    public FeedIndexLogsRecordDTO downloadTime(OffsetDateTime downloadTime) {
        this.downloadTime = downloadTime;
        return this;
    }

    /**
     * Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
     * @return downloadTime
     */
    @Nullable
    @Schema(name = "downloadTime", description = "Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DOWNLOAD_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getDownloadTime() {
        return downloadTime;
    }

    @JsonProperty(JSON_PROPERTY_DOWNLOAD_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setDownloadTime(OffsetDateTime downloadTime) {
        this.downloadTime = downloadTime;
    }

    public FeedIndexLogsRecordDTO fileTime(OffsetDateTime fileTime) {
        this.fileTime = fileTime;
        return this;
    }

    /**
     * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
     * @return fileTime
     */
    @Nullable
    @Schema(name = "fileTime", description = "Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_FILE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getFileTime() {
        return fileTime;
    }

    @JsonProperty(JSON_PROPERTY_FILE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
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
    @Nullable
    @Schema(name = "generationId", description = "Идентификатор индексации.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_GENERATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getGenerationId() {
        return generationId;
    }

    @JsonProperty(JSON_PROPERTY_GENERATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @Schema(name = "indexType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_INDEX_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public FeedIndexLogsIndexType getIndexType() {
        return indexType;
    }

    @JsonProperty(JSON_PROPERTY_INDEX_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIndexType(FeedIndexLogsIndexType indexType) {
        this.indexType = indexType;
    }

    public FeedIndexLogsRecordDTO publishedTime(OffsetDateTime publishedTime) {
        this.publishedTime = publishedTime;
        return this;
    }

    /**
     * Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
     * @return publishedTime
     */
    @Nullable
    @Schema(name = "publishedTime", description = "Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_PUBLISHED_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getPublishedTime() {
        return publishedTime;
    }

    @JsonProperty(JSON_PROPERTY_PUBLISHED_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
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
    @Nullable
    @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public FeedIndexLogsStatusType getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Valid
    @Nullable
    @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ERROR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public FeedIndexLogsErrorDTO getError() {
        return error;
    }

    @JsonProperty(JSON_PROPERTY_ERROR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Valid
    @Nullable
    @Schema(name = "offers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_OFFERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public FeedIndexLogsOffersDTO getOffers() {
        return offers;
    }

    @JsonProperty(JSON_PROPERTY_OFFERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

