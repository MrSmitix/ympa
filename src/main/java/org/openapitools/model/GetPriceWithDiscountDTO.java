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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.openapitools.model.CurrencyType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Цена с указанием скидки и времени последнего обновления.
 */
@JsonPropertyOrder({
  GetPriceWithDiscountDTO.JSON_PROPERTY_VALUE,
  GetPriceWithDiscountDTO.JSON_PROPERTY_CURRENCY_ID,
  GetPriceWithDiscountDTO.JSON_PROPERTY_DISCOUNT_BASE,
  GetPriceWithDiscountDTO.JSON_PROPERTY_UPDATED_AT
})
@JsonTypeName("GetPriceWithDiscountDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class GetPriceWithDiscountDTO {
    public static final String JSON_PROPERTY_VALUE = "value";
    private BigDecimal value;

    public static final String JSON_PROPERTY_CURRENCY_ID = "currencyId";
    private CurrencyType currencyId;

    public static final String JSON_PROPERTY_DISCOUNT_BASE = "discountBase";
    private BigDecimal discountBase;

    public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
    private OffsetDateTime updatedAt;

    public GetPriceWithDiscountDTO(BigDecimal value, CurrencyType currencyId, OffsetDateTime updatedAt) {
        this.value = value;
        this.currencyId = currencyId;
        this.updatedAt = updatedAt;
    }

    public GetPriceWithDiscountDTO value(BigDecimal value) {
        this.value = value;
        return this;
    }

    /**
     * Значение.
     * minimum: 0
     * @return value
     */
    @NotNull
    @DecimalMin(value="0", inclusive=false)
    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getValue() {
        return value;
    }

    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public GetPriceWithDiscountDTO currencyId(CurrencyType currencyId) {
        this.currencyId = currencyId;
        return this;
    }

    /**
     * Get currencyId
     * @return currencyId
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_CURRENCY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CurrencyType getCurrencyId() {
        return currencyId;
    }

    @JsonProperty(JSON_PROPERTY_CURRENCY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCurrencyId(CurrencyType currencyId) {
        this.currencyId = currencyId;
    }

    public GetPriceWithDiscountDTO discountBase(BigDecimal discountBase) {
        this.discountBase = discountBase;
        return this;
    }

    /**
     * Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
     * minimum: 0
     * @return discountBase
     */
    @Nullable
    @DecimalMin(value="0", inclusive=false)
    @JsonProperty(JSON_PROPERTY_DISCOUNT_BASE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getDiscountBase() {
        return discountBase;
    }

    @JsonProperty(JSON_PROPERTY_DISCOUNT_BASE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDiscountBase(BigDecimal discountBase) {
        this.discountBase = discountBase;
    }

    public GetPriceWithDiscountDTO updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Время последнего обновления.
     * @return updatedAt
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetPriceWithDiscountDTO getPriceWithDiscountDTO = (GetPriceWithDiscountDTO) o;
        return Objects.equals(this.value, getPriceWithDiscountDTO.value) &&
            Objects.equals(this.currencyId, getPriceWithDiscountDTO.currencyId) &&
            Objects.equals(this.discountBase, getPriceWithDiscountDTO.discountBase) &&
            Objects.equals(this.updatedAt, getPriceWithDiscountDTO.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, currencyId, discountBase, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPriceWithDiscountDTO {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
        sb.append("    discountBase: ").append(toIndentedString(discountBase)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

