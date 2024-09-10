package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CategoryErrorDTO;
import org.openapitools.server.model.MaxSaleQuantumDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Категории и лимит на установку кванта и минимального количества товаров.
 */
public class GetCategoriesMaxSaleQuantumDTO   {

    private List<@Valid MaxSaleQuantumDTO> results = new ArrayList<>();
    private List<@Valid CategoryErrorDTO> errors;

    /**
     * Default constructor.
     */
    public GetCategoriesMaxSaleQuantumDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetCategoriesMaxSaleQuantumDTO.
     *
     * @param results Категории и лимит на установку кванта и минимального количества товаров.
     * @param errors Ошибки, которые появились из-за переданных категорий.
     */
    public GetCategoriesMaxSaleQuantumDTO(
        List<@Valid MaxSaleQuantumDTO> results, 
        List<@Valid CategoryErrorDTO> errors
    ) {
        this.results = results;
        this.errors = errors;
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
        sb.append("class GetCategoriesMaxSaleQuantumDTO {\n");
        
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

