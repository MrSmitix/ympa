package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ApiResponseStatusType;
import org.openapitools.server.model.FeedIndexLogsResultDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GetFeedIndexLogsResponse   {

    private ApiResponseStatusType status;
    private FeedIndexLogsResultDTO result;

    /**
     * Default constructor.
     */
    public GetFeedIndexLogsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetFeedIndexLogsResponse.
     *
     * @param status status
     * @param result result
     */
    public GetFeedIndexLogsResponse(
        ApiResponseStatusType status, 
        FeedIndexLogsResultDTO result
    ) {
        this.status = status;
        this.result = result;
    }



    /**
     * Get status
     * @return status
     */
    public ApiResponseStatusType getStatus() {
        return status;
    }

    public void setStatus(ApiResponseStatusType status) {
        this.status = status;
    }

    /**
     * Get result
     * @return result
     */
    public FeedIndexLogsResultDTO getResult() {
        return result;
    }

    public void setResult(FeedIndexLogsResultDTO result) {
        this.result = result;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFeedIndexLogsResponse {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

