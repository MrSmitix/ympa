package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ApiResponseStatusType;
import org.openapitools.server.model.OfferMappingSuggestionsListDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ответ со списком рекомендованных карточек товара.
 */
public class GetSuggestedOfferMappingEntriesResponse   {

    private ApiResponseStatusType status;
    private OfferMappingSuggestionsListDTO result;

    /**
     * Default constructor.
     */
    public GetSuggestedOfferMappingEntriesResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetSuggestedOfferMappingEntriesResponse.
     *
     * @param status status
     * @param result result
     */
    public GetSuggestedOfferMappingEntriesResponse(
        ApiResponseStatusType status, 
        OfferMappingSuggestionsListDTO result
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
    public OfferMappingSuggestionsListDTO getResult() {
        return result;
    }

    public void setResult(OfferMappingSuggestionsListDTO result) {
        this.result = result;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSuggestedOfferMappingEntriesResponse {\n");
        
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

