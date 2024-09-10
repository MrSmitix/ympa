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
import org.openapitools.model.PromoOfferDiscountParamsDTO;
import org.openapitools.model.PromoOfferPromocodeParamsDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
 */
@JsonPropertyOrder({
  PromoOfferParamsDTO.JSON_PROPERTY_DISCOUNT_PARAMS,
  PromoOfferParamsDTO.JSON_PROPERTY_PROMOCODE_PARAMS
})
@JsonTypeName("PromoOfferParamsDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class PromoOfferParamsDTO {
    public static final String JSON_PROPERTY_DISCOUNT_PARAMS = "discountParams";
    private PromoOfferDiscountParamsDTO discountParams;

    public static final String JSON_PROPERTY_PROMOCODE_PARAMS = "promocodeParams";
    private PromoOfferPromocodeParamsDTO promocodeParams;

    public PromoOfferParamsDTO() {
    }

    public PromoOfferParamsDTO discountParams(PromoOfferDiscountParamsDTO discountParams) {
        this.discountParams = discountParams;
        return this;
    }

    /**
     * Get discountParams
     * @return discountParams
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_DISCOUNT_PARAMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PromoOfferDiscountParamsDTO getDiscountParams() {
        return discountParams;
    }

    @JsonProperty(JSON_PROPERTY_DISCOUNT_PARAMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDiscountParams(PromoOfferDiscountParamsDTO discountParams) {
        this.discountParams = discountParams;
    }

    public PromoOfferParamsDTO promocodeParams(PromoOfferPromocodeParamsDTO promocodeParams) {
        this.promocodeParams = promocodeParams;
        return this;
    }

    /**
     * Get promocodeParams
     * @return promocodeParams
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_PROMOCODE_PARAMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PromoOfferPromocodeParamsDTO getPromocodeParams() {
        return promocodeParams;
    }

    @JsonProperty(JSON_PROPERTY_PROMOCODE_PARAMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPromocodeParams(PromoOfferPromocodeParamsDTO promocodeParams) {
        this.promocodeParams = promocodeParams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PromoOfferParamsDTO promoOfferParamsDTO = (PromoOfferParamsDTO) o;
        return Objects.equals(this.discountParams, promoOfferParamsDTO.discountParams) &&
            Objects.equals(this.promocodeParams, promoOfferParamsDTO.promocodeParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountParams, promocodeParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromoOfferParamsDTO {\n");
        sb.append("    discountParams: ").append(toIndentedString(discountParams)).append("\n");
        sb.append("    promocodeParams: ").append(toIndentedString(promocodeParams)).append("\n");
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

