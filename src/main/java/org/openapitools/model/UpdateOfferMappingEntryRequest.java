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
import org.openapitools.model.UpdateOfferMappingEntryDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Запрос на обновление товаров.
 */
@Schema(name = "UpdateOfferMappingEntryRequest", description = "Запрос на обновление товаров.")
@JsonPropertyOrder({
  UpdateOfferMappingEntryRequest.JSON_PROPERTY_OFFER_MAPPING_ENTRIES
})
@JsonTypeName("UpdateOfferMappingEntryRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class UpdateOfferMappingEntryRequest {
    public static final String JSON_PROPERTY_OFFER_MAPPING_ENTRIES = "offerMappingEntries";
    private List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries = new ArrayList<>();

    public UpdateOfferMappingEntryRequest(List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries) {
        this.offerMappingEntries = offerMappingEntries;
    }

    public UpdateOfferMappingEntryRequest offerMappingEntries(List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries) {
        this.offerMappingEntries = offerMappingEntries;
        return this;
    }

    public UpdateOfferMappingEntryRequest addOfferMappingEntriesItem(UpdateOfferMappingEntryDTO offerMappingEntriesItem) {
        this.offerMappingEntries.add(offerMappingEntriesItem);
        return this;
    }

    /**
     * Информация о товарах в каталоге.
     * @return offerMappingEntries
     */
    @NotNull
    @Size(min=1, max=500)
    @Schema(name = "offerMappingEntries", description = "Информация о товарах в каталоге.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_OFFER_MAPPING_ENTRIES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid UpdateOfferMappingEntryDTO> getOfferMappingEntries() {
        return offerMappingEntries;
    }

    @JsonProperty(JSON_PROPERTY_OFFER_MAPPING_ENTRIES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOfferMappingEntries(List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries) {
        this.offerMappingEntries = offerMappingEntries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest = (UpdateOfferMappingEntryRequest) o;
        return Objects.equals(this.offerMappingEntries, updateOfferMappingEntryRequest.offerMappingEntries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerMappingEntries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOfferMappingEntryRequest {\n");
        sb.append("    offerMappingEntries: ").append(toIndentedString(offerMappingEntries)).append("\n");
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

