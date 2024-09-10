package org.openapitools.server.model;

import java.time.LocalDate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Данные, необходимые для генерации отчета. 
 */
public class GenerateGoodsTurnoverRequest   {

    private Long campaignId;
    private LocalDate date;

    /**
     * Default constructor.
     */
    public GenerateGoodsTurnoverRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GenerateGoodsTurnoverRequest.
     *
     * @param campaignId Идентификатор кампании.
     * @param date Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
     */
    public GenerateGoodsTurnoverRequest(
        Long campaignId, 
        LocalDate date
    ) {
        this.campaignId = campaignId;
        this.date = date;
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
     * Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
     * @return date
     */
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateGoodsTurnoverRequest {\n");
        
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

