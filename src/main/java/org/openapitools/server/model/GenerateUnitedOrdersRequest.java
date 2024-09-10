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
public class GenerateUnitedOrdersRequest   {

    private Long businessId;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private List<Long> campaignIds;
    private String promoId;

    /**
     * Default constructor.
     */
    public GenerateUnitedOrdersRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GenerateUnitedOrdersRequest.
     *
     * @param businessId Идентификатор бизнеса.
     * @param dateFrom Начало периода, включительно.
     * @param dateTo Конец периода, включительно. Максимальный период — 1 год.
     * @param campaignIds Список магазинов, которые нужны в отчете.
     * @param promoId Идентификатор акции, товары из которой нужны в отчете.
     */
    public GenerateUnitedOrdersRequest(
        Long businessId, 
        LocalDate dateFrom, 
        LocalDate dateTo, 
        List<Long> campaignIds, 
        String promoId
    ) {
        this.businessId = businessId;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.campaignIds = campaignIds;
        this.promoId = promoId;
    }



    /**
     * Идентификатор бизнеса.
     * @return businessId
     */
    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    /**
     * Начало периода, включительно.
     * @return dateFrom
     */
    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    /**
     * Конец периода, включительно. Максимальный период — 1 год.
     * @return dateTo
     */
    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    /**
     * Список магазинов, которые нужны в отчете.
     * @return campaignIds
     */
    public List<Long> getCampaignIds() {
        return campaignIds;
    }

    public void setCampaignIds(List<Long> campaignIds) {
        this.campaignIds = campaignIds;
    }

    /**
     * Идентификатор акции, товары из которой нужны в отчете.
     * @return promoId
     */
    public String getPromoId() {
        return promoId;
    }

    public void setPromoId(String promoId) {
        this.promoId = promoId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateUnitedOrdersRequest {\n");
        
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
        sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
        sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
        sb.append("    promoId: ").append(toIndentedString(promoId)).append("\n");
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

