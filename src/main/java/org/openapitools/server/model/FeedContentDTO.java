package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.FeedContentErrorDTO;
import org.openapitools.server.model.FeedStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 */
public class FeedContentDTO   {

    private Long rejectedOffersCount;
    private FeedStatusType status;
    private Long totalOffersCount;
    private FeedContentErrorDTO error;

    /**
     * Default constructor.
     */
    public FeedContentDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedContentDTO.
     *
     * @param rejectedOffersCount Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;. 
     * @param status status
     * @param totalOffersCount Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;. 
     * @param error error
     */
    public FeedContentDTO(
        Long rejectedOffersCount, 
        FeedStatusType status, 
        Long totalOffersCount, 
        FeedContentErrorDTO error
    ) {
        this.rejectedOffersCount = rejectedOffersCount;
        this.status = status;
        this.totalOffersCount = totalOffersCount;
        this.error = error;
    }



    /**
     * Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
     * @return rejectedOffersCount
     */
    public Long getRejectedOffersCount() {
        return rejectedOffersCount;
    }

    public void setRejectedOffersCount(Long rejectedOffersCount) {
        this.rejectedOffersCount = rejectedOffersCount;
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
     * Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
     * @return totalOffersCount
     */
    public Long getTotalOffersCount() {
        return totalOffersCount;
    }

    public void setTotalOffersCount(Long totalOffersCount) {
        this.totalOffersCount = totalOffersCount;
    }

    /**
     * Get error
     * @return error
     */
    public FeedContentErrorDTO getError() {
        return error;
    }

    public void setError(FeedContentErrorDTO error) {
        this.error = error;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedContentDTO {\n");
        
        sb.append("    rejectedOffersCount: ").append(toIndentedString(rejectedOffersCount)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    totalOffersCount: ").append(toIndentedString(totalOffersCount)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

