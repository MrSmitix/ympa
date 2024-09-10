package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ApiResponseStatusType;
import org.openapitools.server.model.GetCampaignOffersResultDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ответ на запрос списка товаров в магазине.
 */
public class GetCampaignOffersResponse   {

    private ApiResponseStatusType status;
    private GetCampaignOffersResultDTO result;

    /**
     * Default constructor.
     */
    public GetCampaignOffersResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetCampaignOffersResponse.
     *
     * @param status status
     * @param result result
     */
    public GetCampaignOffersResponse(
        ApiResponseStatusType status, 
        GetCampaignOffersResultDTO result
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
    public GetCampaignOffersResultDTO getResult() {
        return result;
    }

    public void setResult(GetCampaignOffersResultDTO result) {
        this.result = result;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCampaignOffersResponse {\n");
        
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

