package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ApiResponseStatusType;
import org.openapitools.server.model.CampaignsQualityRatingDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об индексе качества магазинов.
 */
public class GetQualityRatingResponse   {

    private ApiResponseStatusType status;
    private CampaignsQualityRatingDTO result;

    /**
     * Default constructor.
     */
    public GetQualityRatingResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetQualityRatingResponse.
     *
     * @param status status
     * @param result result
     */
    public GetQualityRatingResponse(
        ApiResponseStatusType status, 
        CampaignsQualityRatingDTO result
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
    public CampaignsQualityRatingDTO getResult() {
        return result;
    }

    public void setResult(CampaignsQualityRatingDTO result) {
        this.result = result;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetQualityRatingResponse {\n");
        
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

