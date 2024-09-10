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
import org.openapitools.model.OfferDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Найденные предложения магазина.
 */
@JsonPropertyOrder({
  OffersDTO.JSON_PROPERTY_OFFERS
})
@JsonTypeName("OffersDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class OffersDTO {
    public static final String JSON_PROPERTY_OFFERS = "offers";
    private List<@Valid OfferDTO> offers = new ArrayList<>();

    public OffersDTO(List<@Valid OfferDTO> offers) {
        this.offers = offers;
    }

    public OffersDTO offers(List<@Valid OfferDTO> offers) {
        this.offers = offers;
        return this;
    }

    public OffersDTO addOffersItem(OfferDTO offersItem) {
        this.offers.add(offersItem);
        return this;
    }

    /**
     * Список предложений магазина.
     * @return offers
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_OFFERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid OfferDTO> getOffers() {
        return offers;
    }

    @JsonProperty(JSON_PROPERTY_OFFERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOffers(List<@Valid OfferDTO> offers) {
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
        OffersDTO offersDTO = (OffersDTO) o;
        return Objects.equals(this.offers, offersDTO.offers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OffersDTO {\n");
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

