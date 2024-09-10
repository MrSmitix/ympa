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

/**
 * Запрос переноса заказов из отгрузки.
 */
@JsonPropertyOrder({
  TransferOrdersFromShipmentRequest.JSON_PROPERTY_ORDER_IDS
})
@JsonTypeName("TransferOrdersFromShipmentRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class TransferOrdersFromShipmentRequest {
    public static final String JSON_PROPERTY_ORDER_IDS = "orderIds";
    private List<Long> orderIds = new ArrayList<>();

    public TransferOrdersFromShipmentRequest(List<Long> orderIds) {
        this.orderIds = orderIds;
    }

    public TransferOrdersFromShipmentRequest orderIds(List<Long> orderIds) {
        this.orderIds = orderIds;
        return this;
    }

    public TransferOrdersFromShipmentRequest addOrderIdsItem(Long orderIdsItem) {
        this.orderIds.add(orderIdsItem);
        return this;
    }

    /**
     * Список заказов, которые вы не успеваете подготовить.
     * @return orderIds
     */
    @NotNull
    @Size(min=1, max=500)
    @JsonProperty(JSON_PROPERTY_ORDER_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<Long> getOrderIds() {
        return orderIds;
    }

    @JsonProperty(JSON_PROPERTY_ORDER_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOrderIds(List<Long> orderIds) {
        this.orderIds = orderIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest = (TransferOrdersFromShipmentRequest) o;
        return Objects.equals(this.orderIds, transferOrdersFromShipmentRequest.orderIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferOrdersFromShipmentRequest {\n");
        sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
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

