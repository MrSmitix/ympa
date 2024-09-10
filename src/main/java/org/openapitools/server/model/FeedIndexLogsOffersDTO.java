package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о предложениях прайс-листа.
 */
public class FeedIndexLogsOffersDTO   {

    private Long rejectedCount;
    private Long totalCount;

    /**
     * Default constructor.
     */
    public FeedIndexLogsOffersDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedIndexLogsOffersDTO.
     *
     * @param rejectedCount Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
     * @param totalCount Количество предложений в прайс-листе.
     */
    public FeedIndexLogsOffersDTO(
        Long rejectedCount, 
        Long totalCount
    ) {
        this.rejectedCount = rejectedCount;
        this.totalCount = totalCount;
    }



    /**
     * Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
     * @return rejectedCount
     */
    public Long getRejectedCount() {
        return rejectedCount;
    }

    public void setRejectedCount(Long rejectedCount) {
        this.rejectedCount = rejectedCount;
    }

    /**
     * Количество предложений в прайс-листе.
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedIndexLogsOffersDTO {\n");
        
        sb.append("    rejectedCount: ").append(toIndentedString(rejectedCount)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

