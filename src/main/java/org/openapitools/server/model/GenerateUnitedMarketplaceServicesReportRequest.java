package org.openapitools.server.model;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.PlacementType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 */
public class GenerateUnitedMarketplaceServicesReportRequest   {

    private Long businessId;
    private OffsetDateTime dateTimeFrom;
    private OffsetDateTime dateTimeTo;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private Integer yearFrom;
    private Integer monthFrom;
    private Integer yearTo;
    private Integer monthTo;
    private List<PlacementType> placementPrograms;
    private List<String> inns;
    private List<Long> campaignIds;

    /**
     * Default constructor.
     */
    public GenerateUnitedMarketplaceServicesReportRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GenerateUnitedMarketplaceServicesReportRequest.
     *
     * @param businessId Идентификатор бизнеса.
     * @param dateTimeFrom {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
     * @param dateTimeTo {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
     * @param dateFrom Начало периода, включительно.
     * @param dateTo Конец периода, включительно. Максимальный период — 1 год.
     * @param yearFrom Начальный год формирования акта.
     * @param monthFrom Начальный номер месяца формирования акта.
     * @param yearTo Конечный год формирования акта.
     * @param monthTo Конечный номер месяца формирования акта.
     * @param placementPrograms Список моделей, которые нужны в отчете. 
     * @param inns Список ИНН, которые нужны в отчете.
     * @param campaignIds Список магазинов, которые нужны в отчете.
     */
    public GenerateUnitedMarketplaceServicesReportRequest(
        Long businessId, 
        OffsetDateTime dateTimeFrom, 
        OffsetDateTime dateTimeTo, 
        LocalDate dateFrom, 
        LocalDate dateTo, 
        Integer yearFrom, 
        Integer monthFrom, 
        Integer yearTo, 
        Integer monthTo, 
        List<PlacementType> placementPrograms, 
        List<String> inns, 
        List<Long> campaignIds
    ) {
        this.businessId = businessId;
        this.dateTimeFrom = dateTimeFrom;
        this.dateTimeTo = dateTimeTo;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.yearFrom = yearFrom;
        this.monthFrom = monthFrom;
        this.yearTo = yearTo;
        this.monthTo = monthTo;
        this.placementPrograms = placementPrograms;
        this.inns = inns;
        this.campaignIds = campaignIds;
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
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
     * @return dateTimeFrom
     */
    public OffsetDateTime getDateTimeFrom() {
        return dateTimeFrom;
    }

    public void setDateTimeFrom(OffsetDateTime dateTimeFrom) {
        this.dateTimeFrom = dateTimeFrom;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
     * @return dateTimeTo
     */
    public OffsetDateTime getDateTimeTo() {
        return dateTimeTo;
    }

    public void setDateTimeTo(OffsetDateTime dateTimeTo) {
        this.dateTimeTo = dateTimeTo;
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
     * Начальный год формирования акта.
     * @return yearFrom
     */
    public Integer getYearFrom() {
        return yearFrom;
    }

    public void setYearFrom(Integer yearFrom) {
        this.yearFrom = yearFrom;
    }

    /**
     * Начальный номер месяца формирования акта.
     * minimum: 1
     * maximum: 12
     * @return monthFrom
     */
    public Integer getMonthFrom() {
        return monthFrom;
    }

    public void setMonthFrom(Integer monthFrom) {
        this.monthFrom = monthFrom;
    }

    /**
     * Конечный год формирования акта.
     * @return yearTo
     */
    public Integer getYearTo() {
        return yearTo;
    }

    public void setYearTo(Integer yearTo) {
        this.yearTo = yearTo;
    }

    /**
     * Конечный номер месяца формирования акта.
     * minimum: 1
     * maximum: 12
     * @return monthTo
     */
    public Integer getMonthTo() {
        return monthTo;
    }

    public void setMonthTo(Integer monthTo) {
        this.monthTo = monthTo;
    }

    /**
     * Список моделей, которые нужны в отчете. 
     * @return placementPrograms
     */
    public List<PlacementType> getPlacementPrograms() {
        return placementPrograms;
    }

    public void setPlacementPrograms(List<PlacementType> placementPrograms) {
        this.placementPrograms = placementPrograms;
    }

    /**
     * Список ИНН, которые нужны в отчете.
     * @return inns
     */
    public List<String> getInns() {
        return inns;
    }

    public void setInns(List<String> inns) {
        this.inns = inns;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateUnitedMarketplaceServicesReportRequest {\n");
        
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    dateTimeFrom: ").append(toIndentedString(dateTimeFrom)).append("\n");
        sb.append("    dateTimeTo: ").append(toIndentedString(dateTimeTo)).append("\n");
        sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
        sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
        sb.append("    yearFrom: ").append(toIndentedString(yearFrom)).append("\n");
        sb.append("    monthFrom: ").append(toIndentedString(monthFrom)).append("\n");
        sb.append("    yearTo: ").append(toIndentedString(yearTo)).append("\n");
        sb.append("    monthTo: ").append(toIndentedString(monthTo)).append("\n");
        sb.append("    placementPrograms: ").append(toIndentedString(placementPrograms)).append("\n");
        sb.append("    inns: ").append(toIndentedString(inns)).append("\n");
        sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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

