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
import java.time.LocalDate;
import org.openapitools.model.ShelfsStatisticsAttributionType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Данные, необходимые для генерации отчета. 
 */
@JsonPropertyOrder({
  GenerateShelfsStatisticsRequest.JSON_PROPERTY_BUSINESS_ID,
  GenerateShelfsStatisticsRequest.JSON_PROPERTY_DATE_FROM,
  GenerateShelfsStatisticsRequest.JSON_PROPERTY_DATE_TO,
  GenerateShelfsStatisticsRequest.JSON_PROPERTY_ATTRIBUTION_TYPE
})
@JsonTypeName("GenerateShelfsStatisticsRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class GenerateShelfsStatisticsRequest {
    public static final String JSON_PROPERTY_BUSINESS_ID = "businessId";
    private Long businessId;

    public static final String JSON_PROPERTY_DATE_FROM = "dateFrom";
    private LocalDate dateFrom;

    public static final String JSON_PROPERTY_DATE_TO = "dateTo";
    private LocalDate dateTo;

    public static final String JSON_PROPERTY_ATTRIBUTION_TYPE = "attributionType";
    private ShelfsStatisticsAttributionType attributionType;

    public GenerateShelfsStatisticsRequest(Long businessId, LocalDate dateFrom, LocalDate dateTo, ShelfsStatisticsAttributionType attributionType) {
        this.businessId = businessId;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.attributionType = attributionType;
    }

    public GenerateShelfsStatisticsRequest businessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * Идентификатор бизнеса.
     * @return businessId
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_BUSINESS_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Long getBusinessId() {
        return businessId;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public GenerateShelfsStatisticsRequest dateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    /**
     * Начало периода, включительно.
     * @return dateFrom
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_DATE_FROM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public LocalDate getDateFrom() {
        return dateFrom;
    }

    @JsonProperty(JSON_PROPERTY_DATE_FROM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public GenerateShelfsStatisticsRequest dateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    /**
     * Конец периода, включительно.
     * @return dateTo
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_DATE_TO)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public LocalDate getDateTo() {
        return dateTo;
    }

    @JsonProperty(JSON_PROPERTY_DATE_TO)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public GenerateShelfsStatisticsRequest attributionType(ShelfsStatisticsAttributionType attributionType) {
        this.attributionType = attributionType;
        return this;
    }

    /**
     * Get attributionType
     * @return attributionType
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_ATTRIBUTION_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ShelfsStatisticsAttributionType getAttributionType() {
        return attributionType;
    }

    @JsonProperty(JSON_PROPERTY_ATTRIBUTION_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAttributionType(ShelfsStatisticsAttributionType attributionType) {
        this.attributionType = attributionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest = (GenerateShelfsStatisticsRequest) o;
        return Objects.equals(this.businessId, generateShelfsStatisticsRequest.businessId) &&
            Objects.equals(this.dateFrom, generateShelfsStatisticsRequest.dateFrom) &&
            Objects.equals(this.dateTo, generateShelfsStatisticsRequest.dateTo) &&
            Objects.equals(this.attributionType, generateShelfsStatisticsRequest.attributionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessId, dateFrom, dateTo, attributionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateShelfsStatisticsRequest {\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
        sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
        sb.append("    attributionType: ").append(toIndentedString(attributionType)).append("\n");
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

