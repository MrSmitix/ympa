package org.openapitools.server.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос информации по индексу качества.
 */
public class GetQualityRatingRequest   {

    private LocalDate dateFrom;
    private LocalDate dateTo;
    private Set<Long> campaignIds = new LinkedHashSet<>();

    /**
     * Default constructor.
     */
    public GetQualityRatingRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetQualityRatingRequest.
     *
     * @param dateFrom Начало периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть раньше 30 дней от текущей даты. 
     * @param dateTo Конец периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть позже текущей даты. 
     * @param campaignIds Список идентификаторов магазинов.
     */
    public GetQualityRatingRequest(
        LocalDate dateFrom, 
        LocalDate dateTo, 
        Set<Long> campaignIds
    ) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.campaignIds = campaignIds;
    }



    /**
     * Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. 
     * @return dateFrom
     */
    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    /**
     * Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. 
     * @return dateTo
     */
    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    /**
     * Список идентификаторов магазинов.
     * @return campaignIds
     */
    public Set<Long> getCampaignIds() {
        return campaignIds;
    }

    public void setCampaignIds(Set<Long> campaignIds) {
        this.campaignIds = campaignIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetQualityRatingRequest {\n");
        
        sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
        sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
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

