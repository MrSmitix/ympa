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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Запрос на подтверждение цены. 
 */
@Schema(name = "ConfirmPricesRequest", description = "Запрос на подтверждение цены. ")
@JsonPropertyOrder({
  ConfirmPricesRequest.JSON_PROPERTY_OFFER_IDS
})
@JsonTypeName("ConfirmPricesRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class ConfirmPricesRequest {
    public static final String JSON_PROPERTY_OFFER_IDS = "offerIds";
    private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds = new ArrayList<>();

    public ConfirmPricesRequest(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
        this.offerIds = offerIds;
    }

    public ConfirmPricesRequest offerIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
        this.offerIds = offerIds;
        return this;
    }

    public ConfirmPricesRequest addOfferIdsItem(String offerIdsItem) {
        this.offerIds.add(offerIdsItem);
        return this;
    }

    /**
     * Идентификаторы товаров, у которых подтверждается цена.
     * @return offerIds
     */
    @NotNull
    @Size(min=1, max=200)
    @Schema(name = "offerIds", description = "Идентификаторы товаров, у которых подтверждается цена.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_OFFER_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
        return offerIds;
    }

    @JsonProperty(JSON_PROPERTY_OFFER_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
        this.offerIds = offerIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfirmPricesRequest confirmPricesRequest = (ConfirmPricesRequest) o;
        return Objects.equals(this.offerIds, confirmPricesRequest.offerIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmPricesRequest {\n");
        sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
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

