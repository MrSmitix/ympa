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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderItemInstanceDTO;
import org.openapitools.model.OrderVatType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Информация о маркированном товаре.
 */
@Schema(name = "BriefOrderItemDTO", description = "Информация о маркированном товаре.")
@JsonPropertyOrder({
  BriefOrderItemDTO.JSON_PROPERTY_ID,
  BriefOrderItemDTO.JSON_PROPERTY_VAT,
  BriefOrderItemDTO.JSON_PROPERTY_COUNT,
  BriefOrderItemDTO.JSON_PROPERTY_PRICE,
  BriefOrderItemDTO.JSON_PROPERTY_OFFER_NAME,
  BriefOrderItemDTO.JSON_PROPERTY_OFFER_ID,
  BriefOrderItemDTO.JSON_PROPERTY_INSTANCES
})
@JsonTypeName("BriefOrderItemDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class BriefOrderItemDTO {
    public static final String JSON_PROPERTY_ID = "id";
    private Long id;

    public static final String JSON_PROPERTY_VAT = "vat";
    private OrderVatType vat;

    public static final String JSON_PROPERTY_COUNT = "count";
    private Integer count;

    public static final String JSON_PROPERTY_PRICE = "price";
    private BigDecimal price;

    public static final String JSON_PROPERTY_OFFER_NAME = "offerName";
    private String offerName;

    public static final String JSON_PROPERTY_OFFER_ID = "offerId";
    private String offerId;

    public static final String JSON_PROPERTY_INSTANCES = "instances";
    private List<@Valid OrderItemInstanceDTO> instances = null;

    public BriefOrderItemDTO() {
    }

    public BriefOrderItemDTO id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
     * @return id
     */
    @Nullable
    @Schema(name = "id", description = "Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(Long id) {
        this.id = id;
    }

    public BriefOrderItemDTO vat(OrderVatType vat) {
        this.vat = vat;
        return this;
    }

    /**
     * Get vat
     * @return vat
     */
    @Nullable
    @Schema(name = "vat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_VAT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OrderVatType getVat() {
        return vat;
    }

    @JsonProperty(JSON_PROPERTY_VAT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVat(OrderVatType vat) {
        this.vat = vat;
    }

    public BriefOrderItemDTO count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Количество единиц товара.
     * @return count
     */
    @Nullable
    @Schema(name = "count", description = "Количество единиц товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getCount() {
        return count;
    }

    @JsonProperty(JSON_PROPERTY_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCount(Integer count) {
        this.count = count;
    }

    public BriefOrderItemDTO price(BigDecimal price) {
        this.price = price;
        return this;
    }

    /**
     * Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
     * @return price
     */
    @Nullable
    @Schema(name = "price", description = "Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_PRICE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getPrice() {
        return price;
    }

    @JsonProperty(JSON_PROPERTY_PRICE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BriefOrderItemDTO offerName(String offerName) {
        this.offerName = offerName;
        return this;
    }

    /**
     * Название товара.
     * @return offerName
     */
    @Nullable
    @Schema(name = "offerName", description = "Название товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_OFFER_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getOfferName() {
        return offerName;
    }

    @JsonProperty(JSON_PROPERTY_OFFER_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public BriefOrderItemDTO offerId(String offerId) {
        this.offerId = offerId;
        return this;
    }

    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @return offerId
     */
    @Nullable
    @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
    @Size(min=1, max=255)
    @Schema(name = "offerId", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_OFFER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getOfferId() {
        return offerId;
    }

    @JsonProperty(JSON_PROPERTY_OFFER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public BriefOrderItemDTO instances(List<@Valid OrderItemInstanceDTO> instances) {
        this.instances = instances;
        return this;
    }

    public BriefOrderItemDTO addInstancesItem(OrderItemInstanceDTO instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    /**
     * Переданные вами коды маркировки.
     * @return instances
     */
    @Nullable
    @Schema(name = "instances", description = "Переданные вами коды маркировки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_INSTANCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid OrderItemInstanceDTO> getInstances() {
        return instances;
    }

    @JsonProperty(JSON_PROPERTY_INSTANCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInstances(List<@Valid OrderItemInstanceDTO> instances) {
        this.instances = instances;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BriefOrderItemDTO briefOrderItemDTO = (BriefOrderItemDTO) o;
        return Objects.equals(this.id, briefOrderItemDTO.id) &&
            Objects.equals(this.vat, briefOrderItemDTO.vat) &&
            Objects.equals(this.count, briefOrderItemDTO.count) &&
            Objects.equals(this.price, briefOrderItemDTO.price) &&
            Objects.equals(this.offerName, briefOrderItemDTO.offerName) &&
            Objects.equals(this.offerId, briefOrderItemDTO.offerId) &&
            Objects.equals(this.instances, briefOrderItemDTO.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vat, count, price, offerName, offerId, instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BriefOrderItemDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

