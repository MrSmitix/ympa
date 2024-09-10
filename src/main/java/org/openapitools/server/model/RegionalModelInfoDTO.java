package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CurrencyType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Региональная информация.
 */
public class RegionalModelInfoDTO   {

    private CurrencyType currency;
    private Long regionId;

    /**
     * Default constructor.
     */
    public RegionalModelInfoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create RegionalModelInfoDTO.
     *
     * @param currency currency
     * @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
     */
    public RegionalModelInfoDTO(
        CurrencyType currency, 
        Long regionId
    ) {
        this.currency = currency;
        this.regionId = regionId;
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
        sb.append("class RegionalModelInfoDTO {\n");
        
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

