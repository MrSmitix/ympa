package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.FeedStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 */
public class FeedPlacementDTO   {

    private FeedStatusType status;
    private Integer totalOffersCount;

    /**
     * Default constructor.
     */
    public FeedPlacementDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedPlacementDTO.
     *
     * @param status status
     * @param totalOffersCount Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
     */
    public FeedPlacementDTO(
        FeedStatusType status, 
        Integer totalOffersCount
    ) {
        this.status = status;
        this.totalOffersCount = totalOffersCount;
    }



    /**
     * Get status
     * @return status
     */
    public FeedStatusType getStatus() {
        return status;
    }

    public void setStatus(FeedStatusType status) {
        this.status = status;
    }

    /**
     * Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
     * @return totalOffersCount
     */
    public Integer getTotalOffersCount() {
        return totalOffersCount;
    }

    public void setTotalOffersCount(Integer totalOffersCount) {
        this.totalOffersCount = totalOffersCount;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedPlacementDTO {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    totalOffersCount: ").append(toIndentedString(totalOffersCount)).append("\n");
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

