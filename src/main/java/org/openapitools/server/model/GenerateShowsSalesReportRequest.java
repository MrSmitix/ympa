package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.server.model.ShowsSalesGroupingType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Данные, необходимые для генерации отчета.
 */
public class GenerateShowsSalesReportRequest   {

    private Long businessId;
    private Long campaignId;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private ShowsSalesGroupingType grouping;

    /**
     * Default constructor.
     */
    public GenerateShowsSalesReportRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GenerateShowsSalesReportRequest.
     *
     * @param businessId Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. 
     * @param campaignId Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. 
     * @param dateFrom Начало периода, включительно.
     * @param dateTo Конец периода, включительно.
     * @param grouping grouping
     */
    public GenerateShowsSalesReportRequest(
        Long businessId, 
        Long campaignId, 
        LocalDate dateFrom, 
        LocalDate dateTo, 
        ShowsSalesGroupingType grouping
    ) {
        this.businessId = businessId;
        this.campaignId = campaignId;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.grouping = grouping;
    }



    /**
     * Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
     * @return businessId
     */
    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    /**
     * Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
     * @return campaignId
     */
    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
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
     * Get grouping
     * @return grouping
     */
    public ShowsSalesGroupingType getGrouping() {
        return grouping;
    }

    public void setGrouping(ShowsSalesGroupingType grouping) {
        this.grouping = grouping;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateShowsSalesReportRequest {\n");
        
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
        sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
        sb.append("    grouping: ").append(toIndentedString(grouping)).append("\n");
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

