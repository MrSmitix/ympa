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
import org.openapitools.model.CurrencyType;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.ModelDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * SearchModelsResponse
 */
@JsonPropertyOrder({
  SearchModelsResponse.JSON_PROPERTY_MODELS,
  SearchModelsResponse.JSON_PROPERTY_CURRENCY,
  SearchModelsResponse.JSON_PROPERTY_REGION_ID,
  SearchModelsResponse.JSON_PROPERTY_PAGER
})
@JsonTypeName("SearchModelsResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class SearchModelsResponse {
    public static final String JSON_PROPERTY_MODELS = "models";
    private List<@Valid ModelDTO> models = new ArrayList<>();

    public static final String JSON_PROPERTY_CURRENCY = "currency";
    private CurrencyType currency;

    public static final String JSON_PROPERTY_REGION_ID = "regionId";
    private Long regionId;

    public static final String JSON_PROPERTY_PAGER = "pager";
    private FlippingPagerDTO pager;

    public SearchModelsResponse(List<@Valid ModelDTO> models) {
        this.models = models;
    }

    public SearchModelsResponse models(List<@Valid ModelDTO> models) {
        this.models = models;
        return this;
    }

    public SearchModelsResponse addModelsItem(ModelDTO modelsItem) {
        this.models.add(modelsItem);
        return this;
    }

    /**
     * Список моделей товаров.
     * @return models
     */
    @NotNull
    @Schema(name = "models", description = "Список моделей товаров.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_MODELS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid ModelDTO> getModels() {
        return models;
    }

    @JsonProperty(JSON_PROPERTY_MODELS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setModels(List<@Valid ModelDTO> models) {
        this.models = models;
    }

    public SearchModelsResponse currency(CurrencyType currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     * @return currency
     */
    @Nullable
    @Schema(name = "currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CURRENCY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CurrencyType getCurrency() {
        return currency;
    }

    @JsonProperty(JSON_PROPERTY_CURRENCY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }

    public SearchModelsResponse regionId(Long regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
     * @return regionId
     */
    @Nullable
    @Schema(name = "regionId", description = "Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_REGION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getRegionId() {
        return regionId;
    }

    @JsonProperty(JSON_PROPERTY_REGION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public SearchModelsResponse pager(FlippingPagerDTO pager) {
        this.pager = pager;
        return this;
    }

    /**
     * Get pager
     * @return pager
     */
    @Valid
    @Nullable
    @Schema(name = "pager", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_PAGER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public FlippingPagerDTO getPager() {
        return pager;
    }

    @JsonProperty(JSON_PROPERTY_PAGER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPager(FlippingPagerDTO pager) {
        this.pager = pager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchModelsResponse searchModelsResponse = (SearchModelsResponse) o;
        return Objects.equals(this.models, searchModelsResponse.models) &&
            Objects.equals(this.currency, searchModelsResponse.currency) &&
            Objects.equals(this.regionId, searchModelsResponse.regionId) &&
            Objects.equals(this.pager, searchModelsResponse.pager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(models, currency, regionId, pager);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchModelsResponse {\n");
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    pager: ").append(toIndentedString(pager)).append("\n");
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

