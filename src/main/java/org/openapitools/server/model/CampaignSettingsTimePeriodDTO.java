package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 */
public class CampaignSettingsTimePeriodDTO   {

    private String fromDate;
    private String toDate;

    /**
     * Default constructor.
     */
    public CampaignSettingsTimePeriodDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignSettingsTimePeriodDTO.
     *
     * @param fromDate Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
     * @param toDate Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
     */
    public CampaignSettingsTimePeriodDTO(
        String fromDate, 
        String toDate
    ) {
        this.fromDate = fromDate;
        this.toDate = toDate;
    }



    /**
     * Формат даты: `ДД-ММ-ГГГГ`. 
     * @return fromDate
     */
    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * Формат даты: `ДД-ММ-ГГГГ`. 
     * @return toDate
     */
    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignSettingsTimePeriodDTO {\n");
        
        sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
        sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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

