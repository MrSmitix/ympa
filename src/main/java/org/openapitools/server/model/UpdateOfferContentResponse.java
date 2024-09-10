package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ApiResponseStatusType;
import org.openapitools.server.model.UpdateOfferContentResultDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Описывает проблемы, которые появились при сохранении товара.
 */
public class UpdateOfferContentResponse   {

    private ApiResponseStatusType status;
    private List<@Valid UpdateOfferContentResultDTO> results;

    /**
     * Default constructor.
     */
    public UpdateOfferContentResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateOfferContentResponse.
     *
     * @param status status
     * @param results Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
     */
    public UpdateOfferContentResponse(
        ApiResponseStatusType status, 
        List<@Valid UpdateOfferContentResultDTO> results
    ) {
        this.status = status;
        this.results = results;
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
     * Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
     * @return results
     */
    public List<@Valid UpdateOfferContentResultDTO> getResults() {
        return results;
    }

    public void setResults(List<@Valid UpdateOfferContentResultDTO> results) {
        this.results = results;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOfferContentResponse {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

