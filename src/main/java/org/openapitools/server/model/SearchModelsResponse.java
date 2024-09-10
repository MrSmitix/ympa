package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CurrencyType;
import org.openapitools.server.model.FlippingPagerDTO;
import org.openapitools.server.model.ModelDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class SearchModelsResponse   {

    private List<@Valid ModelDTO> models = new ArrayList<>();
    private CurrencyType currency;
    private Long regionId;
    private FlippingPagerDTO pager;

    /**
     * Default constructor.
     */
    public SearchModelsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create SearchModelsResponse.
     *
     * @param models Список моделей товаров.
     * @param currency currency
     * @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
     * @param pager pager
     */
    public SearchModelsResponse(
        List<@Valid ModelDTO> models, 
        CurrencyType currency, 
        Long regionId, 
        FlippingPagerDTO pager
    ) {
        this.models = models;
        this.currency = currency;
        this.regionId = regionId;
        this.pager = pager;
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
     * Get pager
     * @return pager
     */
    public FlippingPagerDTO getPager() {
        return pager;
    }

    public void setPager(FlippingPagerDTO pager) {
        this.pager = pager;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

