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
import org.openapitools.model.GetMappingDTO;
import org.openapitools.model.GetOfferDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Информация о товаре.
 */
@JsonPropertyOrder({
  GetOfferMappingDTO.JSON_PROPERTY_OFFER,
  GetOfferMappingDTO.JSON_PROPERTY_MAPPING
})
@JsonTypeName("GetOfferMappingDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class GetOfferMappingDTO {
    public static final String JSON_PROPERTY_OFFER = "offer";
    private GetOfferDTO offer;

    public static final String JSON_PROPERTY_MAPPING = "mapping";
    private GetMappingDTO mapping;

    public GetOfferMappingDTO() {
    }

    public GetOfferMappingDTO offer(GetOfferDTO offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get offer
     * @return offer
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_OFFER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public GetOfferDTO getOffer() {
        return offer;
    }

    @JsonProperty(JSON_PROPERTY_OFFER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOffer(GetOfferDTO offer) {
        this.offer = offer;
    }

    public GetOfferMappingDTO mapping(GetMappingDTO mapping) {
        this.mapping = mapping;
        return this;
    }

    /**
     * Get mapping
     * @return mapping
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_MAPPING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public GetMappingDTO getMapping() {
        return mapping;
    }

    @JsonProperty(JSON_PROPERTY_MAPPING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMapping(GetMappingDTO mapping) {
        this.mapping = mapping;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetOfferMappingDTO getOfferMappingDTO = (GetOfferMappingDTO) o;
        return Objects.equals(this.offer, getOfferMappingDTO.offer) &&
            Objects.equals(this.mapping, getOfferMappingDTO.mapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offer, mapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOfferMappingDTO {\n");
        sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
        sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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

