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
import org.openapitools.model.FeedStatusType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 */
@Schema(name = "FeedPlacementDTO", description = "Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.")
@JsonPropertyOrder({
  FeedPlacementDTO.JSON_PROPERTY_STATUS,
  FeedPlacementDTO.JSON_PROPERTY_TOTAL_OFFERS_COUNT
})
@JsonTypeName("FeedPlacementDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class FeedPlacementDTO {
    public static final String JSON_PROPERTY_STATUS = "status";
    private FeedStatusType status;

    public static final String JSON_PROPERTY_TOTAL_OFFERS_COUNT = "totalOffersCount";
    private Integer totalOffersCount;

    public FeedPlacementDTO() {
    }

    public FeedPlacementDTO status(FeedStatusType status) {
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
    public FeedStatusType getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(FeedStatusType status) {
        this.status = status;
    }

    public FeedPlacementDTO totalOffersCount(Integer totalOffersCount) {
        this.totalOffersCount = totalOffersCount;
        return this;
    }

    /**
     * Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
     * @return totalOffersCount
     */
    @Nullable
    @Schema(name = "totalOffersCount", description = "Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TOTAL_OFFERS_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getTotalOffersCount() {
        return totalOffersCount;
    }

    @JsonProperty(JSON_PROPERTY_TOTAL_OFFERS_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTotalOffersCount(Integer totalOffersCount) {
        this.totalOffersCount = totalOffersCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeedPlacementDTO feedPlacementDTO = (FeedPlacementDTO) o;
        return Objects.equals(this.status, feedPlacementDTO.status) &&
            Objects.equals(this.totalOffersCount, feedPlacementDTO.totalOffersCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, totalOffersCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedPlacementDTO {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    totalOffersCount: ").append(toIndentedString(totalOffersCount)).append("\n");
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

