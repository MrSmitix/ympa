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
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubstatusType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Информация по заказу.
 */
@Schema(name = "OrderStateDTO", description = "Информация по заказу.")
@JsonPropertyOrder({
  OrderStateDTO.JSON_PROPERTY_ID,
  OrderStateDTO.JSON_PROPERTY_STATUS,
  OrderStateDTO.JSON_PROPERTY_SUBSTATUS
})
@JsonTypeName("OrderStateDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class OrderStateDTO {
    public static final String JSON_PROPERTY_ID = "id";
    private Long id;

    public static final String JSON_PROPERTY_STATUS = "status";
    private OrderStatusType status;

    public static final String JSON_PROPERTY_SUBSTATUS = "substatus";
    private OrderSubstatusType substatus;

    public OrderStateDTO(Long id, OrderStatusType status) {
        this.id = id;
        this.status = status;
    }

    public OrderStateDTO id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Идентификатор заказа.
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "Идентификатор заказа.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Long getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(Long id) {
        this.id = id;
    }

    public OrderStateDTO status(OrderStatusType status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @NotNull
    @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OrderStatusType getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public OrderStateDTO substatus(OrderSubstatusType substatus) {
        this.substatus = substatus;
        return this;
    }

    /**
     * Get substatus
     * @return substatus
     */
    @Nullable
    @Schema(name = "substatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SUBSTATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OrderSubstatusType getSubstatus() {
        return substatus;
    }

    @JsonProperty(JSON_PROPERTY_SUBSTATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSubstatus(OrderSubstatusType substatus) {
        this.substatus = substatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderStateDTO orderStateDTO = (OrderStateDTO) o;
        return Objects.equals(this.id, orderStateDTO.id) &&
            Objects.equals(this.status, orderStateDTO.status) &&
            Objects.equals(this.substatus, orderStateDTO.substatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, substatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderStateDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    substatus: ").append(toIndentedString(substatus)).append("\n");
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

