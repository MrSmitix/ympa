package org.openapitools.server.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Данные, необходимые для генерации отчета.
 */
public class GeneratePricesReportRequest   {

    private Long businessId;
    private Long campaignId;
    private List<Long> categoryIds;
    private LocalDate creationDateFrom;
    private LocalDate creationDateTo;

    /**
     * Default constructor.
     */
    public GeneratePricesReportRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GeneratePricesReportRequest.
     *
     * @param businessId Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан &#x60;campaignId&#x60;. 
     * @param campaignId Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать &#x60;businessId&#x60; не нужно. 
     * @param categoryIds Фильтр по категориям на Маркете.
     * @param creationDateFrom Фильтр по времени появления предложения — начало периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
     * @param creationDateTo Фильтр по времени появления предложения — окончание периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
     */
    public GeneratePricesReportRequest(
        Long businessId, 
        Long campaignId, 
        List<Long> categoryIds, 
        LocalDate creationDateFrom, 
        LocalDate creationDateTo
    ) {
        this.businessId = businessId;
        this.campaignId = campaignId;
        this.categoryIds = categoryIds;
        this.creationDateFrom = creationDateFrom;
        this.creationDateTo = creationDateTo;
    }



    /**
     * Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
     * @return businessId
     */
    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    /**
     * Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 
     * @return campaignId
     */
    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Фильтр по категориям на Маркете.
     * @return categoryIds
     */
    public List<Long> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<Long> categoryIds) {
        this.categoryIds = categoryIds;
    }

    /**
     * Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 
     * @return creationDateFrom
     */
    public LocalDate getCreationDateFrom() {
        return creationDateFrom;
    }

    public void setCreationDateFrom(LocalDate creationDateFrom) {
        this.creationDateFrom = creationDateFrom;
    }

    /**
     * Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 
     * @return creationDateTo
     */
    public LocalDate getCreationDateTo() {
        return creationDateTo;
    }

    public void setCreationDateTo(LocalDate creationDateTo) {
        this.creationDateTo = creationDateTo;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneratePricesReportRequest {\n");
        
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
        sb.append("    creationDateFrom: ").append(toIndentedString(creationDateFrom)).append("\n");
        sb.append("    creationDateTo: ").append(toIndentedString(creationDateTo)).append("\n");
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

