package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.FeedDownloadErrorDTO;
import org.openapitools.server.model.FeedStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о последней загрузке прайс-листа.
 */
public class FeedDownloadDTO   {

    private FeedStatusType status;
    private FeedDownloadErrorDTO error;

    /**
     * Default constructor.
     */
    public FeedDownloadDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedDownloadDTO.
     *
     * @param status status
     * @param error error
     */
    public FeedDownloadDTO(
        FeedStatusType status, 
        FeedDownloadErrorDTO error
    ) {
        this.status = status;
        this.error = error;
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
     * Get error
     * @return error
     */
    public FeedDownloadErrorDTO getError() {
        return error;
    }

    public void setError(FeedDownloadErrorDTO error) {
        this.error = error;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedDownloadDTO {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

