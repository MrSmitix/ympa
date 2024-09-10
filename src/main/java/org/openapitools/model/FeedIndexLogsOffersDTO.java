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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Информация о предложениях прайс-листа.
 */
@JsonPropertyOrder({
  FeedIndexLogsOffersDTO.JSON_PROPERTY_REJECTED_COUNT,
  FeedIndexLogsOffersDTO.JSON_PROPERTY_TOTAL_COUNT
})
@JsonTypeName("FeedIndexLogsOffersDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class FeedIndexLogsOffersDTO {
    public static final String JSON_PROPERTY_REJECTED_COUNT = "rejectedCount";
    private Long rejectedCount;

    public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
    private Long totalCount;

    public FeedIndexLogsOffersDTO() {
    }

    public FeedIndexLogsOffersDTO rejectedCount(Long rejectedCount) {
        this.rejectedCount = rejectedCount;
        return this;
    }

    /**
     * Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
     * @return rejectedCount
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_REJECTED_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getRejectedCount() {
        return rejectedCount;
    }

    @JsonProperty(JSON_PROPERTY_REJECTED_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRejectedCount(Long rejectedCount) {
        this.rejectedCount = rejectedCount;
    }

    public FeedIndexLogsOffersDTO totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Количество предложений в прайс-листе.
     * @return totalCount
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getTotalCount() {
        return totalCount;
    }

    @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeedIndexLogsOffersDTO feedIndexLogsOffersDTO = (FeedIndexLogsOffersDTO) o;
        return Objects.equals(this.rejectedCount, feedIndexLogsOffersDTO.rejectedCount) &&
            Objects.equals(this.totalCount, feedIndexLogsOffersDTO.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rejectedCount, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedIndexLogsOffersDTO {\n");
        sb.append("    rejectedCount: ").append(toIndentedString(rejectedCount)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

