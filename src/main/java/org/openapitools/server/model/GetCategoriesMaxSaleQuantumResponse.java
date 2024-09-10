package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ApiResponseStatusType;
import org.openapitools.server.model.CategoryErrorDTO;
import org.openapitools.server.model.MaxSaleQuantumDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GetCategoriesMaxSaleQuantumResponse   {

    private ApiResponseStatusType status;
    private List<@Valid MaxSaleQuantumDTO> results = new ArrayList<>();
    private List<@Valid CategoryErrorDTO> errors;

    /**
     * Default constructor.
     */
    public GetCategoriesMaxSaleQuantumResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetCategoriesMaxSaleQuantumResponse.
     *
     * @param status status
     * @param results Категории и лимит на установку кванта и минимального количества товаров.
     * @param errors Ошибки, которые появились из-за переданных категорий.
     */
    public GetCategoriesMaxSaleQuantumResponse(
        ApiResponseStatusType status, 
        List<@Valid MaxSaleQuantumDTO> results, 
        List<@Valid CategoryErrorDTO> errors
    ) {
        this.status = status;
        this.results = results;
        this.errors = errors;
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
     * Категории и лимит на установку кванта и минимального количества товаров.
     * @return results
     */
    public List<@Valid MaxSaleQuantumDTO> getResults() {
        return results;
    }

    public void setResults(List<@Valid MaxSaleQuantumDTO> results) {
        this.results = results;
    }

    /**
     * Ошибки, которые появились из-за переданных категорий.
     * @return errors
     */
    public List<@Valid CategoryErrorDTO> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid CategoryErrorDTO> errors) {
        this.errors = errors;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCategoriesMaxSaleQuantumResponse {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

