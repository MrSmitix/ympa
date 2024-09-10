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
import org.openapitools.model.OrderDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * GetOrderResponse
 */
@JsonPropertyOrder({
  GetOrderResponse.JSON_PROPERTY_ORDER
})
@JsonTypeName("GetOrderResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class GetOrderResponse {
    public static final String JSON_PROPERTY_ORDER = "order";
    private OrderDTO order;

    public GetOrderResponse() {
    }

    public GetOrderResponse order(OrderDTO order) {
        this.order = order;
        return this;
    }

    /**
     * Get order
     * @return order
     */
    @Valid
    @Nullable
    @Schema(name = "order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ORDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OrderDTO getOrder() {
        return order;
    }

    @JsonProperty(JSON_PROPERTY_ORDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOrder(OrderDTO order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetOrderResponse getOrderResponse = (GetOrderResponse) o;
        return Objects.equals(this.order, getOrderResponse.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOrderResponse {\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

