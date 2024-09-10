package org.openapitools.server.model;

import java.time.LocalDate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Данные, необходимые для генерации отчета. 
 */
public class GenerateBoostConsolidatedRequest   {

    private Long businessId;
    private LocalDate dateFrom;
    private LocalDate dateTo;

    /**
     * Default constructor.
     */
    public GenerateBoostConsolidatedRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GenerateBoostConsolidatedRequest.
     *
     * @param businessId Идентификатор бизнеса.
     * @param dateFrom Начало периода, включительно.
     * @param dateTo Конец периода, включительно.
     */
    public GenerateBoostConsolidatedRequest(
        Long businessId, 
        LocalDate dateFrom, 
        LocalDate dateTo
    ) {
        this.businessId = businessId;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
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
     * Конец периода, включительно.
     * @return dateTo
     */
    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateBoostConsolidatedRequest {\n");
        
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
        sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
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

