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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Годные/негодные ярлыки по заказам в отгрузке.
 */
@Schema(name = "OrdersShipmentInfoDTO", description = "Годные/негодные ярлыки по заказам в отгрузке.")
@JsonPropertyOrder({
  OrdersShipmentInfoDTO.JSON_PROPERTY_ORDER_IDS_WITH_LABELS,
  OrdersShipmentInfoDTO.JSON_PROPERTY_ORDER_IDS_WITHOUT_LABELS
})
@JsonTypeName("OrdersShipmentInfoDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class OrdersShipmentInfoDTO {
    public static final String JSON_PROPERTY_ORDER_IDS_WITH_LABELS = "orderIdsWithLabels";
    private Set<Long> orderIdsWithLabels = new LinkedHashSet<>();

    public static final String JSON_PROPERTY_ORDER_IDS_WITHOUT_LABELS = "orderIdsWithoutLabels";
    private Set<Long> orderIdsWithoutLabels = new LinkedHashSet<>();

    public OrdersShipmentInfoDTO(Set<Long> orderIdsWithLabels, Set<Long> orderIdsWithoutLabels) {
        this.orderIdsWithLabels = orderIdsWithLabels;
        this.orderIdsWithoutLabels = orderIdsWithoutLabels;
    }

    public OrdersShipmentInfoDTO orderIdsWithLabels(Set<Long> orderIdsWithLabels) {
        this.orderIdsWithLabels = orderIdsWithLabels;
        return this;
    }

    public OrdersShipmentInfoDTO addOrderIdsWithLabelsItem(Long orderIdsWithLabelsItem) {
        this.orderIdsWithLabels.add(orderIdsWithLabelsItem);
        return this;
    }

    /**
     * Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
     * @return orderIdsWithLabels
     */
    @NotNull
    @Schema(name = "orderIdsWithLabels", description = "Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ORDER_IDS_WITH_LABELS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Set<Long> getOrderIdsWithLabels() {
        return orderIdsWithLabels;
    }

    @JsonProperty(JSON_PROPERTY_ORDER_IDS_WITH_LABELS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
       @JsonDeserialize(as = LinkedHashSet.class)
    public void setOrderIdsWithLabels(Set<Long> orderIdsWithLabels) {
        this.orderIdsWithLabels = orderIdsWithLabels;
    }

    public OrdersShipmentInfoDTO orderIdsWithoutLabels(Set<Long> orderIdsWithoutLabels) {
        this.orderIdsWithoutLabels = orderIdsWithoutLabels;
        return this;
    }

    public OrdersShipmentInfoDTO addOrderIdsWithoutLabelsItem(Long orderIdsWithoutLabelsItem) {
        this.orderIdsWithoutLabels.add(orderIdsWithoutLabelsItem);
        return this;
    }

    /**
     * Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
     * @return orderIdsWithoutLabels
     */
    @NotNull
    @Schema(name = "orderIdsWithoutLabels", description = "Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ORDER_IDS_WITHOUT_LABELS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Set<Long> getOrderIdsWithoutLabels() {
        return orderIdsWithoutLabels;
    }

    @JsonProperty(JSON_PROPERTY_ORDER_IDS_WITHOUT_LABELS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
       @JsonDeserialize(as = LinkedHashSet.class)
    public void setOrderIdsWithoutLabels(Set<Long> orderIdsWithoutLabels) {
        this.orderIdsWithoutLabels = orderIdsWithoutLabels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrdersShipmentInfoDTO ordersShipmentInfoDTO = (OrdersShipmentInfoDTO) o;
        return Objects.equals(this.orderIdsWithLabels, ordersShipmentInfoDTO.orderIdsWithLabels) &&
            Objects.equals(this.orderIdsWithoutLabels, ordersShipmentInfoDTO.orderIdsWithoutLabels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderIdsWithLabels, orderIdsWithoutLabels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrdersShipmentInfoDTO {\n");
        sb.append("    orderIdsWithLabels: ").append(toIndentedString(orderIdsWithLabels)).append("\n");
        sb.append("    orderIdsWithoutLabels: ").append(toIndentedString(orderIdsWithoutLabels)).append("\n");
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

