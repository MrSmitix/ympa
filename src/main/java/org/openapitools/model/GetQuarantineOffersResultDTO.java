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
import org.openapitools.model.QuarantineOfferDTO;
import org.openapitools.model.ScrollingPagerDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Список товаров в карантине.
 */
@Schema(name = "GetQuarantineOffersResultDTO", description = "Список товаров в карантине.")
@JsonPropertyOrder({
  GetQuarantineOffersResultDTO.JSON_PROPERTY_PAGING,
  GetQuarantineOffersResultDTO.JSON_PROPERTY_OFFERS
})
@JsonTypeName("GetQuarantineOffersResultDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class GetQuarantineOffersResultDTO {
    public static final String JSON_PROPERTY_PAGING = "paging";
    private ScrollingPagerDTO paging;

    public static final String JSON_PROPERTY_OFFERS = "offers";
    private List<@Valid QuarantineOfferDTO> offers = new ArrayList<>();

    public GetQuarantineOffersResultDTO(List<@Valid QuarantineOfferDTO> offers) {
        this.offers = offers;
    }

    public GetQuarantineOffersResultDTO paging(ScrollingPagerDTO paging) {
        this.paging = paging;
        return this;
    }

    /**
     * Get paging
     * @return paging
     */
    @Valid
    @Nullable
    @Schema(name = "paging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_PAGING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ScrollingPagerDTO getPaging() {
        return paging;
    }

    @JsonProperty(JSON_PROPERTY_PAGING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPaging(ScrollingPagerDTO paging) {
        this.paging = paging;
    }

    public GetQuarantineOffersResultDTO offers(List<@Valid QuarantineOfferDTO> offers) {
        this.offers = offers;
        return this;
    }

    public GetQuarantineOffersResultDTO addOffersItem(QuarantineOfferDTO offersItem) {
        this.offers.add(offersItem);
        return this;
    }

    /**
     * Страница списка товаров в карантине.
     * @return offers
     */
    @NotNull
    @Schema(name = "offers", description = "Страница списка товаров в карантине.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_OFFERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid QuarantineOfferDTO> getOffers() {
        return offers;
    }

    @JsonProperty(JSON_PROPERTY_OFFERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOffers(List<@Valid QuarantineOfferDTO> offers) {
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
        GetQuarantineOffersResultDTO getQuarantineOffersResultDTO = (GetQuarantineOffersResultDTO) o;
        return Objects.equals(this.paging, getQuarantineOffersResultDTO.paging) &&
            Objects.equals(this.offers, getQuarantineOffersResultDTO.offers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paging, offers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetQuarantineOffersResultDTO {\n");
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

