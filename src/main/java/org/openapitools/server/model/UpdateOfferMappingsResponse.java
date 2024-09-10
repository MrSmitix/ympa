package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ApiResponseStatusType;
import org.openapitools.server.model.UpdateOfferMappingResultDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Описывает проблемы, возникшие при сохранении товара.
 */
public class UpdateOfferMappingsResponse   {

    private ApiResponseStatusType status;
    private List<@Valid UpdateOfferMappingResultDTO> results;

    /**
     * Default constructor.
     */
    public UpdateOfferMappingsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateOfferMappingsResponse.
     *
     * @param status status
     * @param results Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
     */
    public UpdateOfferMappingsResponse(
        ApiResponseStatusType status, 
        List<@Valid UpdateOfferMappingResultDTO> results
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
     * Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
     * @return results
     */
    public List<@Valid UpdateOfferMappingResultDTO> getResults() {
        return results;
    }

    public void setResults(List<@Valid UpdateOfferMappingResultDTO> results) {
        this.results = results;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOfferMappingsResponse {\n");
        
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

