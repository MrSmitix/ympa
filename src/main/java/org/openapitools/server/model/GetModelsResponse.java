package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CurrencyType;
import org.openapitools.server.model.ModelDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ответ на запрос информации о моделях.
 */
public class GetModelsResponse   {

    private List<@Valid ModelDTO> models = new ArrayList<>();
    private CurrencyType currency;
    private Long regionId;

    /**
     * Default constructor.
     */
    public GetModelsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetModelsResponse.
     *
     * @param models Список моделей товаров.
     * @param currency currency
     * @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
     */
    public GetModelsResponse(
        List<@Valid ModelDTO> models, 
        CurrencyType currency, 
        Long regionId
    ) {
        this.models = models;
        this.currency = currency;
        this.regionId = regionId;
    }



    /**
     * Список моделей товаров.
     * @return models
     */
    public List<@Valid ModelDTO> getModels() {
        return models;
    }

    public void setModels(List<@Valid ModelDTO> models) {
        this.models = models;
    }

    /**
     * Get currency
     * @return currency
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }

    /**
     * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
     * @return regionId
     */
    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetModelsResponse {\n");
        
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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

