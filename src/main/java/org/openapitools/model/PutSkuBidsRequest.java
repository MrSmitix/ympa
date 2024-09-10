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
import org.openapitools.model.SkuBidItemDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * description.
 */
@Schema(name = "PutSkuBidsRequest", description = "description.")
@JsonPropertyOrder({
  PutSkuBidsRequest.JSON_PROPERTY_BIDS
})
@JsonTypeName("PutSkuBidsRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class PutSkuBidsRequest {
    public static final String JSON_PROPERTY_BIDS = "bids";
    private List<@Valid SkuBidItemDTO> bids = new ArrayList<>();

    public PutSkuBidsRequest(List<@Valid SkuBidItemDTO> bids) {
        this.bids = bids;
    }

    public PutSkuBidsRequest bids(List<@Valid SkuBidItemDTO> bids) {
        this.bids = bids;
        return this;
    }

    public PutSkuBidsRequest addBidsItem(SkuBidItemDTO bidsItem) {
        this.bids.add(bidsItem);
        return this;
    }

    /**
     * Список товаров и ставки для продвижения, которые на них нужно установить.
     * @return bids
     */
    @NotNull
    @Size(min=1, max=1500)
    @Schema(name = "bids", description = "Список товаров и ставки для продвижения, которые на них нужно установить.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_BIDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid SkuBidItemDTO> getBids() {
        return bids;
    }

    @JsonProperty(JSON_PROPERTY_BIDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBids(List<@Valid SkuBidItemDTO> bids) {
        this.bids = bids;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutSkuBidsRequest putSkuBidsRequest = (PutSkuBidsRequest) o;
        return Objects.equals(this.bids, putSkuBidsRequest.bids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bids);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutSkuBidsRequest {\n");
        sb.append("    bids: ").append(toIndentedString(bids)).append("\n");
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

