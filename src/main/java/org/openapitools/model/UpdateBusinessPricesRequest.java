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
import org.openapitools.model.UpdateBusinessOfferPriceDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Запрос на установку базовых цен на товары.
 */
@Schema(name = "UpdateBusinessPricesRequest", description = "Запрос на установку базовых цен на товары.")
@JsonPropertyOrder({
  UpdateBusinessPricesRequest.JSON_PROPERTY_OFFERS
})
@JsonTypeName("UpdateBusinessPricesRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class UpdateBusinessPricesRequest {
    public static final String JSON_PROPERTY_OFFERS = "offers";
    private List<@Valid UpdateBusinessOfferPriceDTO> offers = new ArrayList<>();

    public UpdateBusinessPricesRequest(List<@Valid UpdateBusinessOfferPriceDTO> offers) {
        this.offers = offers;
    }

    public UpdateBusinessPricesRequest offers(List<@Valid UpdateBusinessOfferPriceDTO> offers) {
        this.offers = offers;
        return this;
    }

    public UpdateBusinessPricesRequest addOffersItem(UpdateBusinessOfferPriceDTO offersItem) {
        this.offers.add(offersItem);
        return this;
    }

    /**
     * Список товаров с ценами.
     * @return offers
     */
    @NotNull
    @Size(min=1, max=500)
    @Schema(name = "offers", description = "Список товаров с ценами.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_OFFERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid UpdateBusinessOfferPriceDTO> getOffers() {
        return offers;
    }

    @JsonProperty(JSON_PROPERTY_OFFERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOffers(List<@Valid UpdateBusinessOfferPriceDTO> offers) {
        this.offers = offers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateBusinessPricesRequest updateBusinessPricesRequest = (UpdateBusinessPricesRequest) o;
        return Objects.equals(this.offers, updateBusinessPricesRequest.offers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBusinessPricesRequest {\n");
        sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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

