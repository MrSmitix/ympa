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
import org.openapitools.model.OrderPromoType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 */
@JsonPropertyOrder({
  OrderItemPromoDTO.JSON_PROPERTY_TYPE,
  OrderItemPromoDTO.JSON_PROPERTY_DISCOUNT,
  OrderItemPromoDTO.JSON_PROPERTY_SUBSIDY,
  OrderItemPromoDTO.JSON_PROPERTY_SHOP_PROMO_ID,
  OrderItemPromoDTO.JSON_PROPERTY_MARKET_PROMO_ID
})
@JsonTypeName("OrderItemPromoDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class OrderItemPromoDTO {
    public static final String JSON_PROPERTY_TYPE = "type";
    private OrderPromoType type;

    public static final String JSON_PROPERTY_DISCOUNT = "discount";
    private BigDecimal discount;

    public static final String JSON_PROPERTY_SUBSIDY = "subsidy";
    private BigDecimal subsidy;

    public static final String JSON_PROPERTY_SHOP_PROMO_ID = "shopPromoId";
    private String shopPromoId;

    public static final String JSON_PROPERTY_MARKET_PROMO_ID = "marketPromoId";
    private String marketPromoId;

    public OrderItemPromoDTO(OrderPromoType type) {
        this.type = type;
    }

    public OrderItemPromoDTO type(OrderPromoType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OrderPromoType getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(OrderPromoType type) {
        this.type = type;
    }

    public OrderItemPromoDTO discount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    /**
     * Размер пользовательской скидки в валюте покупателя. 
     * @return discount
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_DISCOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getDiscount() {
        return discount;
    }

    @JsonProperty(JSON_PROPERTY_DISCOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public OrderItemPromoDTO subsidy(BigDecimal subsidy) {
        this.subsidy = subsidy;
        return this;
    }

    /**
     * Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
     * @return subsidy
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_SUBSIDY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getSubsidy() {
        return subsidy;
    }

    @JsonProperty(JSON_PROPERTY_SUBSIDY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSubsidy(BigDecimal subsidy) {
        this.subsidy = subsidy;
    }

    public OrderItemPromoDTO shopPromoId(String shopPromoId) {
        this.shopPromoId = shopPromoId;
        return this;
    }

    /**
     * Идентификатор акции поставщика. 
     * @return shopPromoId
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_SHOP_PROMO_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getShopPromoId() {
        return shopPromoId;
    }

    @JsonProperty(JSON_PROPERTY_SHOP_PROMO_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setShopPromoId(String shopPromoId) {
        this.shopPromoId = shopPromoId;
    }

    public OrderItemPromoDTO marketPromoId(String marketPromoId) {
        this.marketPromoId = marketPromoId;
        return this;
    }

    /**
     * Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;. 
     * @return marketPromoId
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_MARKET_PROMO_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMarketPromoId() {
        return marketPromoId;
    }

    @JsonProperty(JSON_PROPERTY_MARKET_PROMO_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMarketPromoId(String marketPromoId) {
        this.marketPromoId = marketPromoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderItemPromoDTO orderItemPromoDTO = (OrderItemPromoDTO) o;
        return Objects.equals(this.type, orderItemPromoDTO.type) &&
            Objects.equals(this.discount, orderItemPromoDTO.discount) &&
            Objects.equals(this.subsidy, orderItemPromoDTO.subsidy) &&
            Objects.equals(this.shopPromoId, orderItemPromoDTO.shopPromoId) &&
            Objects.equals(this.marketPromoId, orderItemPromoDTO.marketPromoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, discount, subsidy, shopPromoId, marketPromoId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderItemPromoDTO {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
        sb.append("    subsidy: ").append(toIndentedString(subsidy)).append("\n");
        sb.append("    shopPromoId: ").append(toIndentedString(shopPromoId)).append("\n");
        sb.append("    marketPromoId: ").append(toIndentedString(marketPromoId)).append("\n");
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

