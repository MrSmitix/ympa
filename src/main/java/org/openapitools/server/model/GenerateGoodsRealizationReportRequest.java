package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 */
public class GenerateGoodsRealizationReportRequest   {

    private Long campaignId;
    private Integer year;
    private Integer month;

    /**
     * Default constructor.
     */
    public GenerateGoodsRealizationReportRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GenerateGoodsRealizationReportRequest.
     *
     * @param campaignId Идентификатор кампании.
     * @param year Год.
     * @param month Номер месяца.
     */
    public GenerateGoodsRealizationReportRequest(
        Long campaignId, 
        Integer year, 
        Integer month
    ) {
        this.campaignId = campaignId;
        this.year = year;
        this.month = month;
    }



    /**
     * Идентификатор кампании.
     * @return campaignId
     */
    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Год.
     * @return year
     */
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * Номер месяца.
     * minimum: 1
     * maximum: 12
     * @return month
     */
    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateGoodsRealizationReportRequest {\n");
        
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    year: ").append(toIndentedString(year)).append("\n");
        sb.append("    month: ").append(toIndentedString(month)).append("\n");
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

