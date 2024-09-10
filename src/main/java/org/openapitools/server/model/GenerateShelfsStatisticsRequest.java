package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.server.model.ShelfsStatisticsAttributionType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Данные, необходимые для генерации отчета. 
 */
public class GenerateShelfsStatisticsRequest   {

    private Long businessId;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private ShelfsStatisticsAttributionType attributionType;

    /**
     * Default constructor.
     */
    public GenerateShelfsStatisticsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GenerateShelfsStatisticsRequest.
     *
     * @param businessId Идентификатор бизнеса.
     * @param dateFrom Начало периода, включительно.
     * @param dateTo Конец периода, включительно.
     * @param attributionType attributionType
     */
    public GenerateShelfsStatisticsRequest(
        Long businessId, 
        LocalDate dateFrom, 
        LocalDate dateTo, 
        ShelfsStatisticsAttributionType attributionType
    ) {
        this.businessId = businessId;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.attributionType = attributionType;
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
     * Get attributionType
     * @return attributionType
     */
    public ShelfsStatisticsAttributionType getAttributionType() {
        return attributionType;
    }

    public void setAttributionType(ShelfsStatisticsAttributionType attributionType) {
        this.attributionType = attributionType;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

