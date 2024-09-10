/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CategoryErrorDTO;
import org.openapitools.model.MaxSaleQuantumDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Категории и лимит на установку кванта и минимального количества товаров.
 */
@Schema(name = "GetCategoriesMaxSaleQuantumDTO", description = "Категории и лимит на установку кванта и минимального количества товаров.")
@JsonPropertyOrder({
  GetCategoriesMaxSaleQuantumDTO.JSON_PROPERTY_RESULTS,
  GetCategoriesMaxSaleQuantumDTO.JSON_PROPERTY_ERRORS
})
@JsonTypeName("GetCategoriesMaxSaleQuantumDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class GetCategoriesMaxSaleQuantumDTO {
    public static final String JSON_PROPERTY_RESULTS = "results";
    private List<@Valid MaxSaleQuantumDTO> results = new ArrayList<>();

    public static final String JSON_PROPERTY_ERRORS = "errors";
    private List<@Valid CategoryErrorDTO> errors = null;

    public GetCategoriesMaxSaleQuantumDTO(List<@Valid MaxSaleQuantumDTO> results) {
        this.results = results;
    }

    public GetCategoriesMaxSaleQuantumDTO results(List<@Valid MaxSaleQuantumDTO> results) {
        this.results = results;
        return this;
    }

    public GetCategoriesMaxSaleQuantumDTO addResultsItem(MaxSaleQuantumDTO resultsItem) {
        this.results.add(resultsItem);
        return this;
    }

    /**
     * Категории и лимит на установку кванта и минимального количества товаров.
     * @return results
     */
    @NotNull
    @Schema(name = "results", description = "Категории и лимит на установку кванта и минимального количества товаров.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_RESULTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid MaxSaleQuantumDTO> getResults() {
        return results;
    }

    @JsonProperty(JSON_PROPERTY_RESULTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setResults(List<@Valid MaxSaleQuantumDTO> results) {
        this.results = results;
    }

    public GetCategoriesMaxSaleQuantumDTO errors(List<@Valid CategoryErrorDTO> errors) {
        this.errors = errors;
        return this;
    }

    public GetCategoriesMaxSaleQuantumDTO addErrorsItem(CategoryErrorDTO errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Ошибки, которые появились из-за переданных категорий.
     * @return errors
     */
    @Nullable
    @Schema(name = "errors", description = "Ошибки, которые появились из-за переданных категорий.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ERRORS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid CategoryErrorDTO> getErrors() {
        return errors;
    }

    @JsonProperty(JSON_PROPERTY_ERRORS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErrors(List<@Valid CategoryErrorDTO> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO = (GetCategoriesMaxSaleQuantumDTO) o;
        return Objects.equals(this.results, getCategoriesMaxSaleQuantumDTO.results) &&
            Objects.equals(this.errors, getCategoriesMaxSaleQuantumDTO.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, errors);
    }

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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

